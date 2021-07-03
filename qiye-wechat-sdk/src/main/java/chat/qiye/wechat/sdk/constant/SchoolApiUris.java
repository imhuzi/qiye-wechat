package chat.qiye.wechat.sdk.constant;

/**
 * 家校沟通相关接口 api uri 常量
 * <p>
 * https://work.weixin.qq.com/api/doc/90000/90135/91638
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/6/16
 */
public interface SchoolApiUris {
    /**
     * 获取「学校通知」二维码
     * 学校可通过此接口获取「学校通知」二维码，家长可通过扫描此二维码关注「学校通知」并接收学校推送的消息。
     */
    String API_GET_SUBSCRIBE_QR_CODE = "GET /externalcontact/get_subscribe_qr_code";

    String API_SET_SUBSCRIBE_MODEL= "GET /externalcontact/set_subscribe_mode";

    String API_GET_SUBSCRIBE_MODEL= "GET /externalcontact/get_subscribe_mode";

    String API_EXTERNALCONTACT_GET = "GET /externalcontact/get";
    String API_EXTERNALCONTACT_LIST = "GET /externalcontact/list";
}
