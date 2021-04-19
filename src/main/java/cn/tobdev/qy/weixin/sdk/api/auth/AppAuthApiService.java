package cn.tobdev.qy.weixin.sdk.api.auth;


import cn.tobdev.qy.weixin.sdk.base.BaseRequestClient;
import cn.tobdev.qy.weixin.sdk.exception.QyApiErrorException;
import cn.tobdev.qy.weixin.sdk.model.auth.AppAdminListResp;
import cn.tobdev.qy.weixin.sdk.model.auth.AuthInfoResp;
import cn.tobdev.qy.weixin.sdk.model.auth.PermanentCodeResp;
import cn.tobdev.qy.weixin.sdk.model.auth.PreAuthCodeResp;
import com.dtflys.forest.annotation.Get;

public interface AppAuthApiService extends BaseRequestClient {
    /**
     * <pre>
     *   获取预授码
     *   @Link https://work.weixin.qq.com/api/doc/90001/90143/90601
     * </pre>
     *
     * @return pre auth url
     * @throws QyApiErrorException the wx error exception
     */
    @Get("/service/get_pre_auth_code")
    PreAuthCodeResp getPreAuthCode(String appId);

    /**
     * 获取企业永久授权码信息
     * <pre>
     *   原来的方法实现不全
     * </pre>
     *
     * @param appId 以ww或wx开头应用id（对应于旧的以tj开头的套件id）
     * @param authCode the auth code
     * @return permanent code info
     * @throws QyApiErrorException the wx error exception
     * @author yuan
     * @since 2020 -03-18
     */
    PermanentCodeResp getPermanentCodeInfo(String appId, String authCode) throws QyApiErrorException;

    /**
     * 获取企业的授权信息
     *
     * @param appId 以ww或wx开头应用id（对应于旧的以tj开头的套件id）
     * @param authCorpId    授权企业的corpId
     * @param permanentCode 授权企业的永久授权码
     * @return auth info
     * @throws QyApiErrorException the wx error exception
     */
    AuthInfoResp getAuthInfo(String appId, String authCorpId, String permanentCode) throws QyApiErrorException;


    /**
     * 获取应用的管理员列表
     * @param appId 以ww或wx开头应用id（对应于旧的以tj开头的套件id）
     * @param authCorpId
     * @param agentId
     * @return
     */
    AppAdminListResp getAdminList(String appId, String authCorpId, Integer agentId) throws QyApiErrorException;

}
