package chat.qiye.wechat.sdk.api.kf;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.constant.AppIdEnum;

/**
 * 客服 接待人员管理
 *
 * https://developer.work.weixin.qq.com/document/path/94646
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/13
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_KF)
public interface KfServicerApi {
  String KF_SERVICER_ADD = "POST /kf/servicer/add";
  String KF_SERVICER_DEL = "POST /kf/servicer/del";
  String KF_SERVICER_LIST = "POST /kf/servicer/list";

}
