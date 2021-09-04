package chat.qiye.wechat.sdk.api.customer;

import chat.qiye.wechat.sdk.annotation.QiYeChatApi;
import chat.qiye.wechat.sdk.constant.SysAppIdEnum;
import feign.Headers;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/1
 */
@Headers(value = {"Accept: application/json", "Content-Type: application/json"})
@QiYeChatApi(appType = SysAppIdEnum.APP_CUSTOMER)
public interface CustomerBaseApi {

}
