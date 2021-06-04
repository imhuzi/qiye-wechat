package cn.tobdev.qy.weixin.sdk.api.inner;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.Query;

import cn.tobdev.qy.weixin.sdk.api.inner.resp.AccessTokenResp;
import cn.tobdev.qy.weixin.sdk.constant.ApiUriEnums;
import cn.tobdev.qy.weixin.sdk.interceptor.TokenInterceptor;

@BaseRequest(
        baseURL = "${qywx_api_host}",     // 默认域名
        interceptor = TokenInterceptor.class,
        headers = {"Accept:text/plain"}
)
public interface AccessTokenApi {

    /**
     * 获取接口 的 accessToken
     *
     * @param appId 应用id
     * @return {@link AccessTokenResp}
     */
    @Get(ApiUriEnums.API_TOKEN_GET)
    AccessTokenResp accessTokenInfo(@Query("appId") Integer appId);

    /**
     * 获取通讯录 接口 的 accessToken
     *
     * @param appId 应用id
     * @return {@link AccessTokenResp}
     */
    @Get(ApiUriEnums.API_TOKEN_GET)
    AccessTokenResp contactAccessTokenInfo(@Query("appId") Integer appId);


}
