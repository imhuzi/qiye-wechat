package chat.qiye.wechat.sdk.api.app;

/**
 * 菜单 按钮类型
 *
 * https://open.work.weixin.qq.com/api/doc/90000/90135/90231
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/8
 */
public interface ButtonType {
    String BUTTON_TYPE_CLICK = "click";
    String BUTTON_TYPE_VIEW = "view";
    String BUTTON_TYPE_SCANCODE_PUSH = "scancode_push";
    String BUTTON_TYPE_SCANCODE_WAITMSG = "scancode_waitmsg";
    String BUTTON_TYPE_PIC_SYSPHOTO = "pic_sysphoto";
    String BUTTON_TYPE_PIC_PHOTO_OR_ALBUM = "pic_photo_or_album";
    String BUTTON_TYPE_PIC_WEIXIN = "pic_weixin";
    String BUTTON_TYPE_LOCATION_SELECT = "location_select";
    String BUTTON_TYPE_VIEW_MINIPROGRAM = "view_miniprogram";
}
