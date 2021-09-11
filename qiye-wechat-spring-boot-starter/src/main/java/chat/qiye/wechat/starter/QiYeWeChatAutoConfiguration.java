package chat.qiye.wechat.starter;

import chat.qiye.wechat.sdk.service.ApiConfigurationDefaultProvider;
import chat.qiye.wechat.sdk.service.ApiConfigurationProvider;
import chat.qiye.wechat.sdk.service.ApiFactory;
import chat.qiye.wechat.starter.config.QiYeWeChatConfigProperties;
import feign.Client;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.httpclient.ApacheHttpClient;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/11
 */
@EnableConfigurationProperties(QiYeWeChatConfigProperties.class)
public class QiYeWeChatAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    private ApiConfigurationProvider apiConfigurationProvider() {
        return new ApiConfigurationDefaultProvider();
    }

    @Bean
    @ConditionalOnMissingBean
    private Client client() {
        return new ApacheHttpClient();
    }

    @Bean
    @ConditionalOnMissingBean
    private Encoder encoder() {
        return new JacksonEncoder(ApiFactory.getObjectMaper());
    }

    @Bean
    @ConditionalOnMissingBean
    private Decoder decoder() {
        return new JacksonDecoder(ApiFactory.getObjectMaper());
    }


}
