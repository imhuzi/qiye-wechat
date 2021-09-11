package chat.qiye.wechat.starter.config;

import chat.qiye.wechat.starter.FeignLoggerType;
import feign.Logger;
import feign.RequestInterceptor;
import feign.Retryer;
import feign.codec.ErrorDecoder;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 企业微信 配置信息
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/8/31
 */
@Data
@ConfigurationProperties(prefix = "qiye.wechat")
public class QiYeWeChatConfigProperties {

    /**
     * scan base packages
     */
    private String basePackages = "chat.qiye.wechat.sdk.api";

    /**
     * http options
     */
    private FeignConfig feignConfig;

    private String baseUrl;

    /**
     * corp id
     */
    private String corpId;

    /**
     * corp secret
     */
    private String secret;

    /**
     * apps config
     */
    private List<ConfigItem> apps;

    @Data
    public static class FeignConfig {
        private Logger.Level loggerLevel = Logger.Level.BASIC;
        private FeignLoggerType loggerType = FeignLoggerType.SYSTEM_ERR;
        private Integer connectTimeout = 10;
        private Integer readTimeout = 60;
        private boolean followRedirects = true;
        private Class<Retryer> retryer;
        private Class<ErrorDecoder> errorDecoder;
        private List<Class<RequestInterceptor>> requestInterceptors;
        private Map<String, Collection<String>> defaultRequestHeaders;
        private Map<String, Collection<String>> defaultQueryParameters;
        private Boolean decode404;
    }

    @Data
    public static class ConfigItem {
        /**
         * app name
         */
        private String name;

        /**
         * app id
         */
        private String appId;

        /**
         * app agentId
         */
        private Integer agentId;

        /**
         * app secret
         */
        private String secret;

        /**
         * corp id
         */
        private String corpId;

        /**
         * 应用主页(前端)
         */
        private String homeUrl;

        /**
         * 事件 token
         */
        private String eventToken;

        /**
         * 事件 加密
         */
        private String eventEncodingAesKey;

    }
}
