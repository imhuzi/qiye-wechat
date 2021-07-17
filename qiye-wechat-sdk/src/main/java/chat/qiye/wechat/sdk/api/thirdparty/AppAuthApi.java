package chat.qiye.wechat.sdk.api.thirdparty;


import chat.qiye.wechat.sdk.api.BaseApi;
import chat.qiye.wechat.sdk.api.thirdparty.param.AdminListParam;
import chat.qiye.wechat.sdk.api.thirdparty.param.CorpAuthInfoParam;
import chat.qiye.wechat.sdk.api.thirdparty.param.CorpPermanentCodeParam;
import chat.qiye.wechat.sdk.api.thirdparty.resp.AppAdminListResp;
import chat.qiye.wechat.sdk.api.thirdparty.resp.CorpAuthInfoResp;
import chat.qiye.wechat.sdk.api.thirdparty.resp.CorpPermanentCodeResp;
import chat.qiye.wechat.sdk.api.thirdparty.resp.PreAuthCodeResp;
import chat.qiye.wechat.sdk.exception.QyApiErrorException;
import feign.Param;
import feign.RequestLine;

/**
 * 访问 凭证 相关(token)
 * <p>
 * 应用授权 https://work.weixin.qq.com/api/doc/90001/90143/90597
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @created : 2021/1/3
 */

public interface AppAuthApi extends BaseApi {
    /**
     * <pre>
     *   获取预授权码
     *   @link https://work.weixin.qq.com/api/doc/90001/90143/90601
     * </pre>
     *
     * @return pre auth url
     */
    @RequestLine("GET /service/get_pre_auth_code")
    PreAuthCodeResp getPreAuthCode();

    /**
     * 获取企业永久授权码信息, 包含 企业授权信息
     *
     * @param reqParam the auth code
     * @return permanent code info
     * @author yuan
     * @since 2020 -03-18
     */
    @RequestLine("POST /service/get_permanent_code")
    CorpPermanentCodeResp getPermanentCodeInfo(CorpPermanentCodeParam reqParam);

    /**
     * 获取企业的授权信息
     *
     * @param reqParam 请求参数
     * @return auth info
     * @throws QyApiErrorException the wx error exception
     */
    @RequestLine("POST /service/get_auth_info")
    CorpAuthInfoResp getAuthInfo(CorpAuthInfoParam reqParam) throws QyApiErrorException;


    /**
     * 获取应用的管理员列表
     *
     * @param reqParam
     * @return
     */
    @RequestLine("POST /service/get_admin_list")
    AppAdminListResp getAdminList( AdminListParam reqParam) throws QyApiErrorException;

}
