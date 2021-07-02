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

    String API_APP_SEND_MESSAGE = "POST /message/send";

    String API_APP_TASKCARD_MESSAGE_UPDATE = "POST /message/update_taskcard";

    String API_SCHOOL_SEND_MESSAGE = "POST /externalcontact/message/send";

    String API_LINKEDCORP_SEND_MESSAGE = "POST /linkedcorp/message/send";

    String API_GET_SEND_STAT = "POST /message/get_statistics?";

}
