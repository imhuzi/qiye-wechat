package chat.qiye.wechat.starter;

import chat.qiye.wechat.sdk.interceptor.ApiDynamicTokenTarget;
import chat.qiye.wechat.sdk.service.ApiConfigurationProvider;
import chat.qiye.wechat.starter.config.QiYeWeChatConfigProperties;
import feign.Client;
import feign.Contract;
import feign.Feign;
import feign.Request;
import feign.RequestInterceptor;
import feign.Retryer;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.codec.ErrorDecoder;
import feign.slf4j.Slf4jLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.Environment;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/11
 */
public class QiYeWeChatApiFactoryBean<T> implements FactoryBean<Object>, InitializingBean, ApplicationContextAware {
    private static final Logger log = LoggerFactory.getLogger(QiYeWeChatApiFactoryBean.class);
    private static final String ENCODE_BEAN_NAME = "qiYeWechatEncoder";
    private static final String DECODE_BEAN_NAME = "qiYeWechatDecoder";
    private static final String CONTRACT_BEAN_NAME = "qiYeWechatFeignContract";

    private Class<T> apiType;

    private ApplicationContext applicationContext;

    private Map<String, Object> attributes;

    private QiYeWeChatConfigProperties properties;

    public QiYeWeChatApiFactoryBean(QiYeWeChatConfigProperties properties) {
        this.properties = properties;
    }


    @Override
    public Object getObject() throws Exception {
        return feignBuild();
    }

    @Override
    public Class<?> getObjectType() {
        return this.apiType;
    }

    /**
     * Generate QiYeWeChat Api  feign client.
     *
     * @return generated QiYeWeChat Api  feign client.
     */
    private T feignBuild() {
        log.debug("{} Api Bean start build", apiType);
        Feign.Builder builder = get(Feign.Builder.class)
                // required values
                .encoder(get(Encoder.class, ENCODE_BEAN_NAME))
                .decoder(get(Decoder.class, DECODE_BEAN_NAME));
        //1. configure by properties
        configureUsingProperties(builder);
        // 2. configure by spring bean
        configure(builder);
        // 3. configure by QiYeWeChatApi annotation attributes
        configureByAttributes(builder);
        return builder.target(new ApiDynamicTokenTarget<>(apiType, get(ApiConfigurationProvider.class)));
    }


    /**
     * configure
     *
     * @param builder Feign.Builder
     */
    protected void configure(Feign.Builder builder) {
        Client client = getOptional(Client.class);
        if (client != null) {
            builder.client(client);
        }
        if (StringUtils.hasText(properties.getFeignConfig().getContract())) {
            builder.contract(get(Contract.class, CONTRACT_BEAN_NAME));
        }
        Retryer retryer = getOptional(Retryer.class);
        if (retryer != null) {
            builder.retryer(retryer);
        }

        ErrorDecoder errorDecoder = getOptional(ErrorDecoder.class);
        if (errorDecoder != null) {
            builder.errorDecoder(errorDecoder);
        }

        Request.Options options = getOptional(Request.Options.class);
        if (options != null) {
            builder.options(options);
        }

        // interceptors
        Map<String, RequestInterceptor> requestInterceptors = getOptionals(RequestInterceptor.class);
        if (requestInterceptors != null) {
            builder.requestInterceptors(requestInterceptors.values());
        }

        log.debug("{} Bean configure ", apiType);
    }

    /**
     * using properties configure
     *
     * @param builder Feign.Builder
     */
    protected void configureUsingProperties(Feign.Builder builder) {
        QiYeWeChatConfigProperties.FeignConfig config = properties.getFeignConfig();
        if (config != null) {
            if (config.getLoggerLevel() != null) {
                builder.logLevel(config.getLoggerLevel());
            }
            feign.Logger logger = resolveLogger();
            if (logger != null) {
                builder.logger(logger);
            }
            builder.options(new Request.Options((long) config.getConnectTimeout(), TimeUnit.MILLISECONDS, (long) config.getReadTimeout(), TimeUnit.MILLISECONDS, config.isFollowRedirects()));

            if (config.getDecode404() != null && config.getDecode404()) {
                builder.decode404();
            }

            if (Objects.nonNull(config.getDefaultRequestHeaders())) {
                builder.requestInterceptor((requestTemplate) -> {
                    requestTemplate.headers(config.getDefaultRequestHeaders());
                });
            }

            if (Objects.nonNull(config.getDefaultQueryParameters())) {
                builder.requestInterceptor((requestTemplate) -> {
                    requestTemplate.queries(config.getDefaultQueryParameters());
                });
            }
        }

        log.debug("{} Bean configure width properties ", apiType);
    }

    /**
     * configure with QiYeWeChatApi annotation attributes
     *
     * @param builder Feign.Builder
     */
    protected void configureByAttributes(Feign.Builder builder) {
        String clientBeanName = (String) attributes.get("client");
        if (StringUtils.hasText(clientBeanName)) {
            builder.client(get(Client.class, clientBeanName));
        }

        String errorDecoderBeanName = (String) attributes.get("errorDecoder");
        if (StringUtils.hasText(errorDecoderBeanName)) {
            builder.errorDecoder(get(ErrorDecoder.class, errorDecoderBeanName));
        }

        String encoderBeanName = (String) attributes.get("encoder");
        if (StringUtils.hasText(encoderBeanName)) {
            builder.encoder(get(Encoder.class, encoderBeanName));
        }

        String decoderBeanName = (String) attributes.get("decoder");
        if (StringUtils.hasText(decoderBeanName)) {
            builder.decoder(get(Decoder.class, decoderBeanName));
        }

        log.debug("{} Bean configure width QiYeWeChatApi annotation attributes", apiType);
    }


    protected <T> T get(Class<T> type) {
        if (BeanFactoryUtils.beanNamesForTypeIncludingAncestors(applicationContext, type).length > 0) {
            return BeanFactoryUtils.beanOfTypeIncludingAncestors(applicationContext, type);
        } else {
            throw new IllegalStateException("No bean found of type " + type);
        }
    }

    protected <T> T get(Class<T> type, String beanName) {
        if (BeanFactoryUtils.beansOfTypeIncludingAncestors(applicationContext, type).size() > 0) {
            return BeanFactoryUtils.beansOfTypeIncludingAncestors(applicationContext, type).get(beanName);
        } else {
            throw new IllegalStateException("No bean found of type " + type + " And Name " + beanName);
        }
    }


    protected <T> T getOptional(Class<T> type) {
        if (BeanFactoryUtils.beanNamesForTypeIncludingAncestors(applicationContext, type).length > 0) {
            return BeanFactoryUtils.beanOfTypeIncludingAncestors(applicationContext, type);
        }
        return null;
    }

    protected <T> Map<String, T> getOptionals(Class<T> type) {
        if (BeanFactoryUtils.beanNamesForTypeIncludingAncestors(applicationContext, type).length > 0) {
            return BeanFactoryUtils.beansOfTypeIncludingAncestors(applicationContext, type);
        }
        return null;
    }


    public feign.Logger resolveLogger() {
        switch (properties.getFeignConfig().getLoggerType()) {
            case SYSTEM_ERR:
                return new feign.Logger.ErrorLogger();
            case JUL:
                return new feign.Logger.JavaLogger(apiType);
            case NO_OP:
                return new feign.Logger.NoOpLogger();
            case SLF4J:
                return new Slf4jLogger(apiType);
        }
        return null;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.applicationContext = context;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.hasText(properties.getCorpId(), "QiYe Wechat CorpId must be config");
        Assert.notEmpty(properties.getApps(), "QiYe Wechat Apps must be config");
    }

    public Class<T> getApiType() {
        return apiType;
    }

    public void setApiType(Class<T> apiType) {
        this.apiType = apiType;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public void setProperties(QiYeWeChatConfigProperties properties) {
        this.properties = properties;
    }


    public ApplicationContext getApplicationContext() {
        return this.applicationContext;
    }

}
