package chat.qiye.wechat.starter.event.type;

/**
 * 客户变更事件
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/10/08
 */
public class ExternalContactEventType {

    // 新增客户事件
    public static final String ADD_EXTERNAL_CONTACT = "add_external_contact";
    // 编辑客户事件
    public static final String EDIT_EXTERNAL_CONTACT = "edit_external_contact";
    // 外部联系人免验证添加成员事件
    public static final String ADD_HALF_EXTERNAL_CONTACT = "add_half_external_contact";
    // 删除企业客户事件
    public static final String DEL_EXTERNAL_CONTACT = "del_external_contact";
    // 删除跟进成员事件
    public static final String DEL_FOLLOW_USER = "del_follow_user";
    // 客户接替失败事件
    public static final String TRANSFER_FAIL = "transfer_fail";


}
