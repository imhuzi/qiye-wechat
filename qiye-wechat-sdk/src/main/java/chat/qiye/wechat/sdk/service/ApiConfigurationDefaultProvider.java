package chat.qiye.wechat.sdk.service;

import chat.qiye.wechat.sdk.api.inner.AccessTokenApi;
import chat.qiye.wechat.sdk.api.inner.resp.AccessTokenResp;
import chat.qiye.wechat.sdk.api.thirdparty.ThirdAccessTokenApi;
import chat.qiye.wechat.sdk.confg.QiyeWechatConfig;
import chat.qiye.wechat.sdk.confg.QiyeWechatConfigVo;
import chat.qiye.wechat.sdk.constant.SysAppIdEnum;
import chat.qiye.wechat.sdk.utils.AssertUtil;
import chat.qiye.wechat.sdk.utils.StringUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/7/18
 */
@Slf4j
public class ApiConfigurationDefaultProvider implements ApiConfigurationProvider {

    final AccessTokenApi accessTokenApi;
    final ThirdAccessTokenApi thirdAccessTokenApi;

    public ApiConfigurationDefaultProvider() {
        this.accessTokenApi = ApiFactory.getApiBean(AccessTokenApi.class, this);
        this.thirdAccessTokenApi = ApiFactory.getApiBean(ThirdAccessTokenApi.class, this);
    }

    /**
     * 获取 系统 应用 专属 token, 比如 通讯录，客户关系等
     *
     * @param app {@link SysAppIdEnum}
     * @return access_token
     */
    @Override
    public String getAppToken(String app) {
        QiyeWechatConfigVo configVo = (StringUtil.isBlank(app) || SysAppIdEnum.DEFAULT.getAppId().equals(app)) ? QiyeWechatConfig.getAppConfig() : QiyeWechatConfig.getSysAppConfig(app);
        AssertUtil.notNull(configVo, "app config is null");
        AssertUtil.notNull(configVo.getCorpId(), "corpId config is null");
        AssertUtil.notNull(configVo.getSecret(), "app Secret config is null");
        AccessTokenResp resp = accessTokenApi.accessTokenInfo(configVo.getCorpId(), configVo.getSecret());
        if (!resp.success()) {
            log.error("AccessToken Error:{},{},{}", resp.getErrcode(), resp.getErrmsg(), configVo);
        }
        return resp.getAccessToken();
    }

    /**
     * 第三方 企业 access_token
     *
     * @return access_token
     */
    @Override
    public String getCorpToken(String appId) {
        // 先 获取  suite_access_token

        return null;
    }

    /**
     * 第三方  suite_access_token
     *
     * @return suite_access_token
     */
    @Override
    public String getSuiteToken(String appId) {

        return null;
    }

    /**
     * 服务商  access_token
     *
     * @return access_token
     */
    @Override
    public String getProviderToken() {

        return null;
    }
}
