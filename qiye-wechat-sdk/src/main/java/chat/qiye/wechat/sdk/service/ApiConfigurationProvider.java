package chat.qiye.wechat.sdk.service;

import chat.qiye.wechat.sdk.api.inner.AccessTokenApi;
import chat.qiye.wechat.sdk.api.thirdparty.ThirdAccessTokenApi;
import chat.qiye.wechat.sdk.common.AccessTokenInfoVo;
import chat.qiye.wechat.sdk.confg.QiyeWechatAppVo;
import chat.qiye.wechat.sdk.confg.QiyeWechatConfig;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import chat.qiye.wechat.sdk.constant.Constant;
import chat.qiye.wechat.sdk.utils.StringUtil;

/**
 * configuration provider interface
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/6/16
 */
public interface ApiConfigurationProvider {

    default String name() {
        return "QiYeChat";
    }

    /**
     * get base url
     *
     * @return baseUrl
     */
    default String baseUrl() {
        return QiyeWechatConfig.getApiBaseUrl();
    }

    /**
     * 是否支持重定向
     *
     * @return
     */
    default boolean followRedirects() {
        return true;
    }

    /**
     * 连接超时时间
     * <p>
     * get connect timeout
     *
     * @return
     */
    default Integer getConnectTimeout() {
        return 10;
    }

    /**
     * 响应超时时间
     * <p>
     * get read timeout SECONDS
     *
     * @return
     */
    default Integer getReadTimeout() {
        return 60;
    }

    default boolean neverNeedsRefreshToken(AccessTokenInfoVo prevToken) {

        return prevToken.getFailureTime() >= System.currentTimeMillis();
    }

    /**
     * get config by appId
     *
     * @param appId app type
     * @return {@link QiyeWechatAppVo}
     */
    default QiyeWechatAppVo getConfigByAppId(String appId) {
        return (StringUtil.isBlank(appId) || AppIdEnum.DEFAULT.getAppId().equals(appId)) ? QiyeWechatConfig.getAppConfig() : QiyeWechatConfig.getSysAppConfig(appId);
    }

    AccessTokenApi getAccessTokenApi();

    ThirdAccessTokenApi getThirdAccessTokenApi();


    /**
     * 获取 API 调用模式: inner->自建内部应用，third_party->第三方服务商应用
     *
     * @return
     */
    default String getApiModel() {
        return QiyeWechatConfig.getApiModel();
    }

    /**
     * 是否 是第三方
     *
     * @return true or false
     */
    default boolean isThirdApp() {
        return Constant.API_MODEL_THIRD_PARTY.equals(getApiModel());
    }

    /**
     * 是否 是第三方
     *
     * @return true or false
     */
    default boolean isInnerApp() {
        return Constant.API_MODEL_INNER.equals(getApiModel());
    }

    /**
     * 获取 系统 应用 专属 token, 比如 通讯录，客户关系等
     *
     * @param appId {@link AppIdEnum}
     * @return access_token
     */
    String getAppToken(String appId);

    /**
     * 第三方 企业 access_token
     *
     * @param appId {@link AppIdEnum}
     * @return access_token
     */
    String getCorpToken(String appId);

    /**
     * 第三方  suite_access_token
     *
     * @return suite_access_token
     */
    String getSuiteToken(String appId);

    /**
     * 服务商  access_token
     *
     * @return access_token
     */
    String getProviderToken();
}
