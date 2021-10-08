package chat.qiye.wechat.starter.event.type;

/**
 * 企业通讯录 事件类型
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/10/08
 */
public class ContactEventType {
    /**
     * 新增成员事件.
     */
    public static final String CREATE_USER = "create_user";

    /**
     * 更新成员事件.
     */
    public static final String UPDATE_USER = "update_user";

    /**
     * 删除成员事件.
     */
    public static final String DELETE_USER = "delete_user";

    /**
     * 新增部门事件.
     */
    public static final String CREATE_PARTY = "create_party";

    /**
     * 更新部门事件.
     */
    public static final String UPDATE_PARTY = "update_party";

    /**
     * 删除部门事件.
     */
    public static final String DELETE_PARTY = "delete_party";

    /**
     * 标签成员变更事件.
     */
    public static final String UPDATE_TAG = "update_tag";
}
