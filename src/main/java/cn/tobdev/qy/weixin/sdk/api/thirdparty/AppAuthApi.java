package cn.tobdev.qy.weixin.sdk.api.thirdparty;


import cn.tobdev.qy.weixin.sdk.exception.QyApiErrorException;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.param.AdminListParam;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.param.CorpAuthInfoParam;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.param.CorpPermanentCodeParam;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.resp.AppAdminListResp;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.resp.CorpAuthInfoResp;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.resp.CorpPermanentCodeResp;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.resp.PreAuthCodeResp;
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

public interface AppAuthApi {
    /**
     * <pre>
     *   获取预授权码
     *   @Link https://work.weixin.qq.com/api/doc/90001/90143/90601
     * </pre>
     *
     * @return pre auth url
     */
    @RequestLine("/service/get_pre_auth_code")
    PreAuthCodeResp getPreAuthCode(@Param String appId);

    /**
     * 获取企业永久授权码信息, 包含 企业授权信息
     *
     * @param appId    以ww或wx开头应用id（对应于旧的以tj开头的套件id）
     * @param reqParam the auth code
     * @return permanent code info
     * @author yuan
     * @since 2020 -03-18
     */
    @RequestLine("/service/get_permanent_code")
    CorpPermanentCodeResp getPermanentCodeInfo(@Param String appId,  CorpPermanentCodeParam reqParam);

    /**
     * 获取企业的授权信息
     *
     * @param reqParam 请求参数
     * @return auth info
     * @throws QyApiErrorException the wx error exception
     */
    @RequestLine("/service/get_auth_info")
    CorpAuthInfoResp getAuthInfo( CorpAuthInfoParam reqParam) throws QyApiErrorException;


    /**
     * 获取应用的管理员列表
     *
     * @param reqParam
     * @return
     */
    @RequestLine("/service/get_admin_list")
    AppAdminListResp getAdminList( AdminListParam reqParam) throws QyApiErrorException;

}
