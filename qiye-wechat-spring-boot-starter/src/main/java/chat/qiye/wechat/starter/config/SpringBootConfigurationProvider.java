package chat.qiye.wechat.starter.config;

import chat.qiye.wechat.sdk.confg.QiyeWechatConfigVo;
import chat.qiye.wechat.sdk.service.ApiConfigurationDefaultProvider;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * spring 方式 的配置
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/14
 */
public class SpringBootConfigurationProvider extends ApiConfigurationDefaultProvider {

    @Autowired
    QiYeWeChatConfigProperties properties;

    /**
     * get base url
     *
     * @return baseUrl
     */
    @Override
    public String baseUrl() {
        return properties.getFeignConfig().getBaseUrl();
    }

    /**
     * 是否支持重定向
     *
     * @return
     */
    @Override
    public boolean followRedirects() {
        return properties.getFeignConfig().isFollowRedirects();
    }

    /**
     * 连接超时时间
     * <p>
     * get connect timeout
     *
     * @return
     */
    @Override
    public Integer getConnectTimeout() {
        return properties.getFeignConfig().getConnectTimeout();
    }

    /**
     * 响应超时时间
     * <p>
     * get read timeout SECONDS
     *
     * @return
     */
    @Override
    public Integer getReadTimeout() {
        return properties.getFeignConfig().getReadTimeout();
    }

    /**
     * 获取 API 调用模式: inner->自建内部应用，third_party->第三方服务商应用
     *
     * @return
     */
    @Override
    public String getApiModel() {
        return properties.getApiModel();
    }

    /**
     * get config by app type
     *
     * @param appType app type
     * @return {@link QiyeWechatConfigVo}
     */
    @Override
    public QiyeWechatConfigVo getConfigByAppType(String appType) {
        return properties.getConfig(appType);
    }
}
