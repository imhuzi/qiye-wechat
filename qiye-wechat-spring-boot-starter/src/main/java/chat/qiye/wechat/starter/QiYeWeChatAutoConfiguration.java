package chat.qiye.wechat.starter;

import chat.qiye.wechat.sdk.service.ApiConfigurationDefaultProvider;
import chat.qiye.wechat.sdk.service.ApiConfigurationProvider;
import chat.qiye.wechat.sdk.service.ApiFactory;
import chat.qiye.wechat.starter.config.QiYeWeChatConfigProperties;
import chat.qiye.wechat.starter.config.SpringBootConfigurationProvider;
import feign.Client;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.httpclient.ApacheHttpClient;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.net.ssl.SSLContext;
import java.security.cert.X509Certificate;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/11
 */
@Configuration(proxyBeanMethods = false)
@Import({QiYeWeChatApisRegistrar.class, SpringBootConfigurationProvider.class})
@EnableConfigurationProperties(QiYeWeChatConfigProperties.class)
public class QiYeWeChatAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    ApiConfigurationProvider apiConfigurationProvider() {
        return new ApiConfigurationDefaultProvider();
    }

    @Bean
    @ConditionalOnMissingBean
    Encoder qiYeWechatEncoder() {
        return new JacksonEncoder(ApiFactory.getObjectMaper());
    }

    @Bean
    @ConditionalOnMissingBean
    Decoder qiYeWechatDecoder() {
        return new JacksonDecoder(ApiFactory.getObjectMaper());
    }

    /**
     * ApacheHttpClient config
     */
    @Configuration
    @ConditionalOnClass(ApacheHttpClient.class)
    @ConditionalOnProperty(value = "qiye.wechat.feign-config.httpclient.enabled", matchIfMissing = true)
    protected static class HttpClientFeignConfiguration {
        @Autowired(required = false)
        private HttpClient httpClient;

        @Bean
        @ConditionalOnMissingBean(Client.class)
        public Client feignClient() {
            if (this.httpClient != null) {
                return new ApacheHttpClient(this.httpClient);
            }
            return new ApacheHttpClient();
        }
    }

}
