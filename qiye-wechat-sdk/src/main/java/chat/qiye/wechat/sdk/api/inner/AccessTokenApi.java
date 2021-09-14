package chat.qiye.wechat.sdk.api.inner;


import chat.qiye.wechat.sdk.annotation.NoAccessToken;
import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.inner.resp.AccessTokenResp;
import chat.qiye.wechat.sdk.constant.BaseApiUris;
import feign.Param;
import feign.RequestLine;

@QiYeWeChatApi
public interface AccessTokenApi {

    /**
     * 获取接口 的 accessToken
     *
     * @param corpId     应用id
     * @param corpsecret 应用的凭证密钥，获取方式参考：术语说明-secret
     * @return {@link AccessTokenResp}
     */
    @RequestLine(BaseApiUris.API_GET_TOKEN)
    @NoAccessToken
    AccessTokenResp accessTokenInfo(@Param("corpid") String corpId, @Param("corpsecret") String corpsecret);

}
