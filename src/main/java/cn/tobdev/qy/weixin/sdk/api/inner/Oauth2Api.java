package cn.tobdev.qy.weixin.sdk.api.inner;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.Query;

import cn.tobdev.qy.weixin.sdk.api.inner.resp.Oauth2UserInfoResp;
import cn.tobdev.qy.weixin.sdk.constant.ApiUriEnums;
import cn.tobdev.qy.weixin.sdk.interceptor.TokenInterceptor;

@BaseRequest(
        baseURL = "${qywx_api_host}",     // 默认域名
        interceptor = TokenInterceptor.class,
        headers = {"Accept:text/plain"}
)
public interface Oauth2Api {

    /**
     * Oauth 获取访问用户身份
     *
     * @param code 授权code
     * @return {@link Oauth2UserInfoResp}
     */
    @Get(ApiUriEnums.API_OAUTH2_USER_INFO)
    Oauth2UserInfoResp getUserInfo(@Query("code") String code);


}
