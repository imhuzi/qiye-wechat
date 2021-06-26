package cn.tobdev.qy.weixin.sdk.api.inner;


import cn.tobdev.qy.weixin.sdk.api.inner.resp.AccessTokenResp;
import cn.tobdev.qy.weixin.sdk.constant.BaseApiUris;
import feign.Param;
import feign.RequestLine;

public interface AccessTokenApi {

    /**
     * 获取接口 的 accessToken
     *
     * @param appId 应用id
     * @return {@link AccessTokenResp}
     */
    @RequestLine(BaseApiUris.API_GET_TOKEN)
    AccessTokenResp accessTokenInfo(@Param("appId") Integer appId);

    /**
     * 获取通讯录 接口 的 accessToken
     *
     * @param appId 应用id 为 corpId
     * @return {@link AccessTokenResp}
     */
    @RequestLine(BaseApiUris.API_GET_TOKEN)
    AccessTokenResp contactAccessTokenInfo(@Param("appId") Integer appId);


}
