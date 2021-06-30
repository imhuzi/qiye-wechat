package cn.tobdev.qy.weixin.sdk.constant;

/**
 * 消息推送 api uri 常量
 *
 * https://work.weixin.qq.com/api/doc/90000/90135/90235
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/6/16
 */
public interface MessageApiUris {

    /**
     * 创建群会话
     */
    String API_APP_CHAT_CREATE = "POST /appchat/create";
    String API_APP_CHAT_UPDATE = "POST /appchat/update";
    String API_APP_CHAT_GET = "GET /appchat/get";
    String API_APP_CHAT_SEND_MESSAGE = "POST /appchat/send";

}
