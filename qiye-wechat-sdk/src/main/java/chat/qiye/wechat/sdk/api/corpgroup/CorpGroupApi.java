package chat.qiye.wechat.sdk.api.corpgroup;

import chat.qiye.wechat.sdk.api.BaseApi;
import chat.qiye.wechat.sdk.api.corpgroup.param.GetCorpGroupListAppShareParam;
import chat.qiye.wechat.sdk.api.corpgroup.param.GetCorpGroupMiniprogramSessionParam;
import chat.qiye.wechat.sdk.api.corpgroup.param.GetCorpGroupTokenParam;
import chat.qiye.wechat.sdk.api.corpgroup.resp.CorpGroupListAppResp;
import chat.qiye.wechat.sdk.api.corpgroup.resp.CorpGroupMiniProgramSessionResp;
import chat.qiye.wechat.sdk.api.inner.resp.AccessTokenResp;
import chat.qiye.wechat.sdk.constant.BaseApiUris;
import feign.Param;
import feign.RequestLine;

/**
 * 企业互联
 * https://open.work.weixin.qq.com/api/doc/90000/90135/93360
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/7
 */
public interface CorpGroupApi extends BaseApi {
    /**
     * 获取应用共享信息
     * 上级企业通过该接口获取某个应用分享给的所有企业列表。
     * 特别注意，对于有敏感权限的应用，需要下级企业确认后才能共享成功，若下级企业未确认，则不会存在于该接口的返回列表
     * <p>
     * 请求方式： POST（HTTPS）
     * 请求地址： https://qyapi.weixin.qq.com/cgi-bin/corpgroup/corp/list_app_share_info?access_token=ACCESS_TOKEN
     * <p>
     * {
     * "agentid":1111
     * }
     *
     * @param param 参数	必须	说明
     *              access_token	是	调用接口凭证，上级企业应用access_token
     *              agentid	是	上级企业应用agentid
     * @return
     */
    @RequestLine(BaseApiUris.API_GET_CORPGROUP_LIST_APP_INFO)
    CorpGroupListAppResp getShareAppList(GetCorpGroupListAppShareParam param);

    /**
     * 获取下级企业的access_token
     * 获取应用可见范围内下级企业的access_token，该access_token可用于调用下级企业通讯录的只读接口。
     * <p>
     * 请求方式： POST（HTTPS）
     * 请求地址： https://qyapi.weixin.qq.com/cgi-bin/corpgroup/corp/gettoken?access_token=ACCESS_TOKEN
     * <p>
     * {
     * "corpid": "wwabc",
     * "agentid": 1111
     * }
     *
     * @param param 参数	必须	说明
     *              access_token	是	调用接口凭证，上级企业应用access_token
     *              corpid	是	已授权的下级企业corpid
     *              agentid	是	已授权的下级企业应用ID
     * @return
     */
    @RequestLine(BaseApiUris.API_GET_CORPGROUP_GETTOKEN)
    AccessTokenResp getAccessToken(GetCorpGroupTokenParam param);

    /**
     * 获取下级企业的小程序session
     * 上级企业通过该接口转换为下级企业的小程序session
     * <p>
     * 请求方式:POST(HTTPS)
     * <p>
     * 请求地址: https://qyapi.weixin.qq.com/cgi-bin/miniprogram/transfer_session?access_token=ACCESS_TOKEN
     * <p>
     * 请求示例
     * <p>
     * {
     * "userid": "wmAoNVCwAAUrSqEqz7oQpEIEMVWDrPeg",
     * "session_key": "n8cnNEoyW1pxSRz6/Lwjwg=="
     * }
     *
     * @param param 参数	必须	类型	说明
     *              access_token	是	string	调用接口凭证。下级企业的 access_token
     *              userid	是	string	通过code2Session接口获取到的加密的userid
     *              不多于64字节
     *              session_key	是	string	通过code2Session接口获取到的属于上级企业的会话密钥-
     *              不多于64字节
     * @return
     */
    @RequestLine(BaseApiUris.API_GET_CORPGROUP_MINIPROGRAM_SESSION)
    CorpGroupMiniProgramSessionResp getMiniProgramSession(@Param("corpgroup_access_token") String accessToken, GetCorpGroupMiniprogramSessionParam param);

}
