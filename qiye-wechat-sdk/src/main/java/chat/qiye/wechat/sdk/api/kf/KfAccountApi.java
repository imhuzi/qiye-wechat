package chat.qiye.wechat.sdk.api.kf;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.kf.param.KfAccountIdParam;
import chat.qiye.wechat.sdk.api.kf.param.KfAddContactWayParam;
import chat.qiye.wechat.sdk.api.kf.resp.KfAccountAddResp;
import chat.qiye.wechat.sdk.api.kf.resp.KfAccountListResp;
import chat.qiye.wechat.sdk.api.kf.resp.KfAddContactWayResp;
import chat.qiye.wechat.sdk.api.kf.vo.KfAccountVo;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import feign.RequestLine;

/**
 * 客服 账号管理
 * <p>
 * https://work.weixin.qq.com/api/doc/90000/90135/94648
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/13
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_KF)
public interface KfAccountApi {
    String KF_ACCOUNT_ADD = "POST /kf/account/add";
    String KF_ACCOUNT_DEL = "POST /kf/account/del";
    String KF_ACCOUNT_UPDATE = "POST /kf/account/update";
    String KF_ACCOUNT_LIST = "GET /kf/account/list";
    String KF_ADD_CONTACT_WAY = "POST /kf/add_contact_way";

    /**
     * 添加客服账号
     * <p>
     * https://work.weixin.qq.com/api/doc/90000/90135/94662
     *
     * @param param
     * @return
     */
    @RequestLine(KF_ACCOUNT_ADD)
    KfAccountAddResp add(KfAccountVo param);

    @RequestLine(KF_ACCOUNT_DEL)
    RespStatus del(KfAccountIdParam param);

    @RequestLine(KF_ACCOUNT_UPDATE)
    RespStatus update(KfAccountVo param);

    @RequestLine(KF_ACCOUNT_LIST)
    KfAccountListResp list();

    /**
     * 获取客服帐号链接
     * https://work.weixin.qq.com/api/doc/90000/90135/94665
     *
     * @param param
     * @return
     */
    @RequestLine(KF_ADD_CONTACT_WAY)
    KfAddContactWayResp getContactWay(KfAddContactWayParam param);

}
