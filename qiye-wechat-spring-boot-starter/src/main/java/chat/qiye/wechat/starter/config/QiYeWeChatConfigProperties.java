package chat.qiye.wechat.starter.config;

import chat.qiye.wechat.sdk.confg.QiyeWechatConfigVo;
import chat.qiye.wechat.sdk.constant.Constant;
import chat.qiye.wechat.sdk.utils.AssertUtil;
import chat.qiye.wechat.sdk.utils.StringUtil;
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

    private String apiModel = Constant.API_MODEL_INNER;

    /**
     * http options
     */
    private FeignConfig feignConfig;


    /**
     * corp id
     */
    private String corpId;

    /**
     * apps config
     */
    private List<QiyeWechatConfigVo> apps;

    @Data
    public static class FeignConfig {
        private String baseUrl = "https://qyapi.weixin.qq.com/cgi-bin";
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

    /**
     * get config by app type
     *
     * @param appType app type
     * @return {@link QiyeWechatConfigVo}
     */
    public QiyeWechatConfigVo getConfig(String appType) {
        AssertUtil.notNull(apps, "Not Apps config");
        final QiyeWechatConfigVo[] configVo = new QiyeWechatConfigVo[1];
        apps.stream().filter(item -> appType.equals(item.getAppType())).findFirst().ifPresent(item -> {
            configVo[0] = item;
        });
        if (configVo[0] != null && StringUtil.isEmpty(configVo[0].getCorpId())) {
            configVo[0].setCorpId(getCorpId());
        }
        return configVo[0];
    }

    /**
     * get config by appId
     *
     * @param appId app type
     * @return {@link QiyeWechatConfigVo}
     */
    public QiyeWechatConfigVo getConfigByAppId(String appId) {
        AssertUtil.notNull(apps, "Not Apps config");
        final QiyeWechatConfigVo[] configVo = new QiyeWechatConfigVo[1];
        apps.stream().filter(item -> appId.equals(item.getAppId())).findFirst().ifPresent(item -> {
            configVo[0] = item;
        });
        if (configVo[0] != null && StringUtil.isEmpty(configVo[0].getCorpId())) {
            configVo[0].setCorpId(getCorpId());
        }
        return configVo[0];
    }

}
