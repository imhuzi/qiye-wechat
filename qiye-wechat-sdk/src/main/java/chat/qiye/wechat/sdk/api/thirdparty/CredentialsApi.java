package chat.qiye.wechat.sdk.api.thirdparty;


import chat.qiye.wechat.sdk.api.thirdparty.param.CorpAccessTokenParam;
import chat.qiye.wechat.sdk.api.thirdparty.param.ProviderAccessTokenParam;
import chat.qiye.wechat.sdk.api.thirdparty.param.SuiteAccessTokenParam;
import chat.qiye.wechat.sdk.api.thirdparty.resp.CorpAccessTokenResp;
import chat.qiye.wechat.sdk.api.thirdparty.resp.ProviderAccessTokenResp;
import chat.qiye.wechat.sdk.api.thirdparty.resp.SuiteAccessTokenResp;
import feign.RequestLine;


/**
 * 访问 凭证 相关(token)
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @created on  : 2021/1/3
 */
public interface CredentialsApi {

    /**
     * 获取服务商凭证 信息
     * https://work.weixin.qq.com/api/doc/90001/90143/91200
     *
     * @param reqParam 请求参数
     * @return the corp token
     */
    @RequestLine("/service/get_provider_token")
    ProviderAccessTokenResp getProviderTokenInfo( ProviderAccessTokenParam reqParam);


    /**
     * 获取suite_access_token, 不强制刷新suite_access_token
     *
     * @param reqParam
     * @return the suite access token
     */
    @RequestLine("/service/get_suite_token")
    SuiteAccessTokenResp getSuiteAccessTokenInfo( SuiteAccessTokenParam reqParam);

    /**
     * 获取企业凭证 信息
     *
     * @param reqParam
     * @return the corp token
     */
    @RequestLine("/service/get_corp_token")
    CorpAccessTokenResp getCorpTokenInfo( CorpAccessTokenParam reqParam);

}
