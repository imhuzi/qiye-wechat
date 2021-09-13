package chat.qiye.wechat.starter;

import chat.qiye.wechat.starter.config.QiYeWeChatConfigProperties;
import feign.Client;
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
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/11
 */
public class QiYeWeChatApisFactoryBean<T> implements FactoryBean<Object>, InitializingBean, ApplicationContextAware, BeanFactoryAware, EnvironmentAware {
    private static final Logger log = LoggerFactory.getLogger(QiYeWeChatApisFactoryBean.class);

    private BeanFactory beanFactory;

    private Environment environment;

    private Class<T> apiType;
    private String url;
    private ApplicationContext applicationContext;

    private int readTimeoutMillis;

    private int connectTimeoutMillis;


    private Map<String, Object> attributes;

    @Autowired
    private Client feignClient;

    @Autowired
    private Encoder feignEncoder;

    @Autowired
    private Decoder feignDecoder;

    @Autowired
    private ErrorDecoder feignErrorDecoder;

    @Autowired
    private QiYeWeChatConfigProperties properties;

    public QiYeWeChatApisFactoryBean() {
        this.readTimeoutMillis = (new Request.Options()).readTimeoutMillis();
        this.connectTimeoutMillis = (new Request.Options()).connectTimeoutMillis();
    }


    @Override
    public Object getObject() throws Exception {
        Object r = feignBuild();
        log.debug("{} QiYeWeChat Api  feign client: instance is {}, url is {}", apiType, r, getUrl());
        return r;
    }

    /**
     * Generate QiYeWeChat Api  feign client.
     *
     * @return generated QiYeWeChat Api  feign client.
     */
    private T feignBuild() {
        Feign.Builder builder = Feign.builder();
        builder.client(feignClient);
        builder.encoder(feignEncoder);
        builder.decoder(feignDecoder);
        feign.Logger logger = resolveLogger();
        log.debug("{} QiYeWeChat Api  feign client {}: logger is {}", apiType, logger);
        if (logger != null) {
            builder.logger(logger);
        }
        configureUsingProperties(properties.getFeignConfig(), builder);
        return builder.target(apiType, getUrl());
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

    public String getUrl() {
        return resolveAttribute((String) attributes.get("url"));
    }


    @Override
    public Class<?> getObjectType() {
        return this.apiType;
    }


    protected void configureUsingProperties(QiYeWeChatConfigProperties.FeignConfig config, Feign.Builder builder) {
        if (config != null) {
            if (config.getLoggerLevel() != null) {
                builder.logLevel(config.getLoggerLevel());
            }

            this.connectTimeoutMillis = config.getConnectTimeout() != null ? config.getConnectTimeout() : this.connectTimeoutMillis;
            this.readTimeoutMillis = config.getReadTimeout() != null ? config.getReadTimeout() : this.readTimeoutMillis;
            builder.options(new Request.Options((long) this.connectTimeoutMillis, TimeUnit.MILLISECONDS, (long) this.readTimeoutMillis, TimeUnit.MILLISECONDS, true));
            if (config.getRetryer() != null) {
                Retryer retryer = this.getOrInstantiate(config.getRetryer());
                builder.retryer(retryer);
            }

            if (config.getErrorDecoder() != null) {
                ErrorDecoder errorDecoder = (ErrorDecoder) this.getOrInstantiate(config.getErrorDecoder());
                builder.errorDecoder(errorDecoder);
            }

            if (config.getRequestInterceptors() != null && !config.getRequestInterceptors().isEmpty()) {

                for (Class<RequestInterceptor> requestInterceptorClass : config.getRequestInterceptors()) {
                    RequestInterceptor interceptor = (RequestInterceptor) this.getOrInstantiate((Class) requestInterceptorClass);
                    builder.requestInterceptor(interceptor);
                }
            }

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
    }

    private <T> T getOrInstantiate(Class<T> tClass) {
        try {
            return this.beanFactory != null ? this.beanFactory.getBean(tClass) : this.applicationContext.getBean(tClass);
        } catch (NoSuchBeanDefinitionException var3) {
            return BeanUtils.instantiateClass(tClass);
        }
    }


    /**
     * Get the value or resolve placeholders to find the value configured at the property file.
     *
     * @return value.
     */
    public String resolveAttribute(String value) {
        if (StringUtils.hasText(value)) {
            return environment.resolvePlaceholders(value);
        }
        return value;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.applicationContext = context;
    }

    /**
     * Set the {@code Environment} that this component runs in.
     *
     * @see org.springframework.context.EnvironmentAware
     */
    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
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

    @Override
    public void afterPropertiesSet() throws Exception {
//        Assert.hasText(this.contextId, "Context id must be set");
//        Assert.hasText(this.name, "Name must be set");
    }


    public ApplicationContext getApplicationContext() {
        return this.applicationContext;
    }

}
