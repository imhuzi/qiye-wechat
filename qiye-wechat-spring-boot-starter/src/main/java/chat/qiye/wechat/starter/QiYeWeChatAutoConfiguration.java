package chat.qiye.wechat.starter;

import chat.qiye.wechat.sdk.api.inner.AccessTokenApi;
import chat.qiye.wechat.sdk.api.thirdparty.ThirdAccessTokenApi;
import chat.qiye.wechat.sdk.service.ApiConfigurationDefaultProvider;
import chat.qiye.wechat.sdk.service.ApiConfigurationProvider;
import chat.qiye.wechat.sdk.service.ApiFactory;
import chat.qiye.wechat.starter.config.QiYeWeChatConfigProperties;
import chat.qiye.wechat.starter.config.SpringBootConfigurationProvider;
import com.netflix.hystrix.HystrixCommand;
import feign.Client;
import feign.Feign;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.httpclient.ApacheHttpClient;
import feign.hystrix.HystrixFeign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.okhttp.OkHttpClient;
import org.apache.http.client.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/11
 */
@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(QiYeWeChatConfigProperties.class)
@Import({QiYeWeChatApiRegistrar.class, SpringContextUtil.class})
public class QiYeWeChatAutoConfiguration {

    @Configuration
    @ConditionalOnClass({HystrixCommand.class, HystrixFeign.class})
    protected static class HystrixFeignConfiguration {
        @Bean
        @Scope("prototype")
        @ConditionalOnMissingBean
        @ConditionalOnProperty(name = "qiye.wechat.feign-config.hystrix-enabled", matchIfMissing = true)
        public Feign.Builder feignHystrixBuilder() {

            return HystrixFeign.builder();
        }
    }

    @Bean
    @Scope("prototype")
    @ConditionalOnMissingBean
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }

    @Bean
    @Scope("prototype")
    @ConditionalOnMissingBean(ApiConfigurationProvider.class)
    ApiConfigurationProvider apiConfigurationProvider(QiYeWeChatConfigProperties properties) {
        return new SpringBootConfigurationProvider(properties);
    }

    @Configuration
    @ConditionalOnClass({JacksonDecoder.class, JacksonEncoder.class})
    protected static class JacksonFeignConfiguration {
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
    }

    /**
     * ApacheHttpClient config
     */
    @Configuration
    @ConditionalOnClass(ApacheHttpClient.class)
    @ConditionalOnProperty(value = "qiye.wechat.feign-config.httpclient-enabled", matchIfMissing = true)
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

    @Configuration
    @ConditionalOnClass(okhttp3.OkHttpClient.class)
    @ConditionalOnProperty(value = "qiye.wechat.feign-config.okhttp-enabled", matchIfMissing = true)
    protected static class OkHttpFeignConfiguration {
        @Autowired(required = false)
        private okhttp3.OkHttpClient okHttpClient;

        @Bean
        @ConditionalOnMissingBean(Client.class)
        public Client feignClient() {
            if (this.okHttpClient != null) {
                return new OkHttpClient(this.okHttpClient);
            }
            return new OkHttpClient();
        }
    }

//
//    /**
//     * Sync线程池
//     *
//     * @return
//     */
//    @Bean
//    public Executor qiYeWeChatThreadPoolExecutor() {
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        //配置核心线程数
//        executor.setCorePoolSize(4);
//        //配置最大线程数
//        executor.setMaxPoolSize(100);
//        //配置队列大小
//        executor.setQueueCapacity(9999);
//        executor.setKeepAliveSeconds(60 * 10);
//        //配置线程池中的线程的名称前缀
//        executor.setThreadNamePrefix("QiYeWeChat-");
//        // rejection-policy：当pool已经达到max size的时候，如何处理新任务
//        // CALLER_RUNS：不在新线程中执行任务，而是有调用者所在的线程来执行
//        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
//        //执行初始化
//        executor.initialize();
//        return executor;
//    }

}
