package chat.qiye.wechat.sdk.api.app;

/**
 * 模版类型，目前支持的自定义类型包括 “keydata”、 “image”、 “list”、 “webview” 。若设置的type为 “normal”,则相当于从自定义模式切换为普通宫格或者列表展示模式
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/8
 */
public interface WorkBenchTemplateType {
    String TEMPLATE_TYPE_KEY_DATA = "keydata";
    String TEMPLATE_TYPE_IMAGE = "image";
    String TEMPLATE_TYPE_LIST = "list";
    String TEMPLATE_TYPE_WEBVIEW = "webview";
    String TEMPLATE_TYPE_NORMAL = "normal";
}
