package cn.tobdev.qy.weixin.sdk.api.thirdparty;


import cn.tobdev.qy.weixin.sdk.api.thirdparty.req.CorpAccessTokenReqParam;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.resp.CorpAccessTokenResp;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.req.ProviderAccessTokenReqParam;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.resp.ProviderAccessTokenResp;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.req.SuiteAccessTokenReqParam;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.resp.SuiteAccessTokenResp;
import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.JSONBody;
import com.dtflys.forest.annotation.Post;

/**
 * 访问 凭证 相关(token)
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @created on  : 2021/1/3
 */
@BaseRequest(
        baseURL = "${qywx_api_host}",     // 默认域名
        headers = {
                "Accept:application/json, text/plain, */*"                // 默认请求头
        }
)
public interface CredentialsApi {

    /**
     * 获取服务商凭证 信息
     * https://work.weixin.qq.com/api/doc/90001/90143/91200
     *
     * @param reqParam 请求参数
     * @return the corp token
     */
    @Post("/service/get_provider_token")
    ProviderAccessTokenResp getProviderTokenInfo(@JSONBody ProviderAccessTokenReqParam reqParam);


    /**
     * 获取suite_access_token, 不强制刷新suite_access_token
     *
     * @param reqParam
     * @return the suite access token
     */
    @Post("/service/get_suite_token")
    SuiteAccessTokenResp getSuiteAccessTokenInfo(@JSONBody SuiteAccessTokenReqParam reqParam);

    /**
     * 获取企业凭证 信息
     *
     * @param reqParam
     * @return the corp token
     */
    @Post("/service/get_corp_token")
    CorpAccessTokenResp getCorpTokenInfo(@JSONBody CorpAccessTokenReqParam reqParam);

}
