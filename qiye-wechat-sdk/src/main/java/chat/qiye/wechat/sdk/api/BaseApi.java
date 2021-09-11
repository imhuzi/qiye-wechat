package chat.qiye.wechat.sdk.api;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import feign.Headers;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/16
 */
@Headers(value = {"Accept: application/json", "Content-Type: application/json"})
@QiYeWeChatApi
public interface BaseApi {

}
