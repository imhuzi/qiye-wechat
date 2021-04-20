package cn.tobdev.qy.weixin.sdk.api.appauth;


import cn.tobdev.qy.weixin.sdk.exception.QyApiErrorException;
import cn.tobdev.qy.weixin.sdk.model.appauth.req.AdminListReqParam;
import cn.tobdev.qy.weixin.sdk.model.appauth.req.CorpAuthInfoReqParam;
import cn.tobdev.qy.weixin.sdk.model.appauth.req.CorpPermanentCodeReqParam;
import cn.tobdev.qy.weixin.sdk.model.appauth.resp.AppAdminListResp;
import cn.tobdev.qy.weixin.sdk.model.appauth.resp.CorpAuthInfoResp;
import cn.tobdev.qy.weixin.sdk.model.appauth.resp.CorpPermanentCodeResp;
import cn.tobdev.qy.weixin.sdk.model.appauth.resp.PreAuthCodeResp;
import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.JSONBody;
import com.dtflys.forest.annotation.Post;
import com.dtflys.forest.annotation.Query;

/**
 * 访问 凭证 相关(token)
 * <p>
 * 应用授权 https://work.weixin.qq.com/api/doc/90001/90143/90597
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @created : 2021/1/3
 */

@BaseRequest(
        baseURL = "${baseUrl}",     // 默认域名
        headers = {
                "Accept:application/json, text/plain, */*"                // 默认请求头
        },
        sslProtocol = "TLS"
)
public interface AppAuthApiService {
    /**
     * <pre>
     *   获取预授码
     *   @Link https://work.weixin.qq.com/api/doc/90001/90143/90601
     * </pre>
     *
     * @return pre auth url
     */
    @Get("/service/get_pre_auth_code")
    PreAuthCodeResp getPreAuthCode(@Query String appId);

    /**
     * 获取企业永久授权码信息, 包含 企业授权信息
     *
     * @param appId    以ww或wx开头应用id（对应于旧的以tj开头的套件id）
     * @param reqParam the auth code
     * @return permanent code info
     * @author yuan
     * @since 2020 -03-18
     */
    @Post("/service/get_permanent_code")
    CorpPermanentCodeResp getPermanentCodeInfo(@Query String appId, @JSONBody CorpPermanentCodeReqParam reqParam);

    /**
     * 获取企业的授权信息
     *
     * @param appId    以ww或wx开头应用id（对应于旧的以tj开头的套件id）
     * @param reqParam 请求参数
     * @return auth info
     * @throws QyApiErrorException the wx error exception
     */
    @Post("/service/get_auth_info")
    CorpAuthInfoResp getAuthInfo(@Query String appId, @JSONBody CorpAuthInfoReqParam reqParam) throws QyApiErrorException;


    /**
     * 获取应用的管理员列表
     *
     * @param appId    以ww或wx开头应用id（对应于旧的以tj开头的套件id）
     * @param reqParam
     * @return
     */
    @Post("/service/get_pre_auth_code")
    AppAdminListResp getAdminList(@Query String appId, @JSONBody AdminListReqParam reqParam) throws QyApiErrorException;

}
