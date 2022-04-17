package chat.qiye.wechat.starter.config;

import chat.qiye.wechat.sdk.api.inner.AccessTokenApi;
import chat.qiye.wechat.sdk.api.thirdparty.ThirdAccessTokenApi;
import chat.qiye.wechat.sdk.confg.QiyeWechatAppVo;
import chat.qiye.wechat.sdk.constant.Constant;
import chat.qiye.wechat.sdk.service.ApiConfigurationDefaultProvider;
import chat.qiye.wechat.sdk.utils.StringUtil;
import chat.qiye.wechat.starter.SpringContextUtil;

/**
 * spring 方式 的配置
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/14
 */
public class SpringBootConfigurationProvider extends ApiConfigurationDefaultProvider {

    final QiYeWeChatConfigProperties properties;

    public SpringBootConfigurationProvider(QiYeWeChatConfigProperties properties) {
        this.properties = properties;
    }

    @Override
    public AccessTokenApi getAccessTokenApi() {
        return SpringContextUtil.getBean(AccessTokenApi.class);
    }

    @Override
    public ThirdAccessTokenApi getThirdAccessTokenApi() {
        return SpringContextUtil.getBean(ThirdAccessTokenApi.class);
    }

    /**
     * get base url
     *
     * @return baseUrl
     */
    @Override
    public String baseUrl() {
        return StringUtil.isEmpty(properties.getFeignConfig().getBaseUrl()) ? Constant.DEFAULT_BASE_API_URL : properties.getFeignConfig().getBaseUrl();
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
        return properties.getModel();
    }

    /**
     * get config by app type
     *
     * @param appType app type
     * @return {@link QiyeWechatAppVo}
     */
    @Override
    public QiyeWechatAppVo getConfigByAppId(String appType) {
        return properties.getConfig(appType);
    }
}
