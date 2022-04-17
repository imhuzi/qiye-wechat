package chat.qiye.wechat.sdk.constant;

/**
 * 客户管理 api uri 常量
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/6/16
 */
public interface CustomerApiUris {

    /**
     * 客户管理
     */
    String API_CUSTOMER_LIST = "GET /externalcontact/list?userid={userid}";
    String API_CUSTOMER_GET = "GET /externalcontact/get?external_userid={external_userid}&cursor={cursor}";
    String API_CUSTOMER_BATCH = "POST /externalcontact/batch/get_by_user";
    String API_CUSTOMER_REMARK_UPDATE = "POST /externalcontact/remark";


    String API_CUSTOMER_FOLLOW_LIST = "GET /externalcontact/get_follow_user_list";
    String API_CUSTOMER_CONTACT_WAY_SET = "POST /externalcontact/add_contact_way";
    String API_CUSTOMER_CONTACT_WAY_GET = "POST /externalcontact/get_contact_way";
    String API_CUSTOMER_CONTACT_WAY_UPDATE = "POST /externalcontact/update_contact_way";
    String API_CUSTOMER_CONTACT_WAY_DEL = "POST /externalcontact/del_contact_way";
    String API_CUSTOMER_CLOSE_TEMP_CHAT = "POST /externalcontact/close_temp_chat";

    // 客户联系规则组管理 https://developer.work.weixin.qq.com/document/path/94883

    String API_CUSTOMER_STRATEGY_LIST = "POST /externalcontact/customer_strategy/list";
    String API_CUSTOMER_STRATEGY_GET = "POST /externalcontact/customer_strategy/get";
    String API_CUSTOMER_STRATEGY_GET_RANGE = "POST /externalcontact/customer_strategy/get_range";
    String API_CUSTOMER_STRATEGY_CREATE = "POST /externalcontact/customer_strategy/create";
    String API_CUSTOMER_STRATEGY_EDIT = "POST /externalcontact/customer_strategy/edit";
    String API_CUSTOMER_STRATEGY_DEL = "POST /externalcontact/customer_strategy/del";

    String API_CUSTOMER_STRATEGY_TAG_LIST = "POST /externalcontact/get_strategy_tag_list";
    String API_CUSTOMER_STRATEGY_TAG_ADD = "POST /externalcontact/add_strategy_tag";
    String API_CUSTOMER_STRATEGY_TAG_EDIT = "POST /externalcontact/edit_strategy_tag";
    String API_CUSTOMER_STRATEGY_TAG_DEL = "POST /externalcontact/del_strategy_tag";


    /**
     * 客户-标签管理
     */
    String API_CUSTOMER_TAG_LIST = "POST /externalcontact/get_corp_tag_list";
    String API_CUSTOMER_TAG_ADD = "POST /externalcontact/add_corp_tag";
    String API_CUSTOMER_TAG_EDIT = "POST /externalcontact/edit_corp_tag";
    String API_CUSTOMER_TAG_MARK = "POST /externalcontact/mark_tag";
    String API_CUSTOMER_TAG_DEL = "POST /externalcontact/del_corp_tag";

    // 客户-在职继承
    String API_CUSTOMER_TRANSFER = "POST /externalcontact/transfer_customer";
    String API_CUSTOMER_TRANSFER_RESULT = "POST /externalcontact/transfer_result";

    // 客户-离职继承
    String API_CUSTOMER_UNASSIGNED_LIST = "POST /externalcontact/get_unassigned_list";
    String API_CUSTOMER_RESIGNED = "POST /externalcontact/resigned/transfer_customer";
    String API_CUSTOMER_RESIGNED_RESULT = "POST /externalcontact/resigned/transfer_result";
    String API_CUSTOMER_GROUP_CHAT_TRANSFER = "POST /externalcontact/groupchat/transfer";

    // 客户-群管理
    String API_CUSTOMER_GROUP_CHAT_LIST = "POST /externalcontact/groupchat/list";
    String API_CUSTOMER_GROUP_CHAT_GET = "POST /externalcontact/groupchat/get";

    // 客户-朋友圈
    String API_CUSTOMER_MOMENT_LIST = "POST /externalcontact/get_moment_list";
    String API_CUSTOMER_MOMENT_TASK_STATUS = "POST /externalcontact/get_moment_task";
    String API_CUSTOMER_MOMENT_VIEW_LIST = "POST /externalcontact/get_moment_customer_list";
    String API_CUSTOMER_MOMENT_SEND_RESULT = "POST /externalcontact/get_moment_send_result";
    String API_CUSTOMER_MOMENT_COMMENTS = "POST /externalcontact/get_moment_comments";

    // 客户-消息推送
    String API_CUSTOMER_ADD_MSG_TEMPLATE = "POST /externalcontact/add_msg_template";
    String API_CUSTOMER_GET_GROUPMSG_LIST_V2 = "POST /externalcontact/get_groupmsg_list_v2";
    String API_CUSTOMER_GET_GROUPMSG_TASK = "POST /externalcontact/get_groupmsg_task";
    String API_CUSTOMER_GET_GROUPMSG_SENT_RESULT = "POST /externalcontact/get_groupmsg_send_result";
    String API_CUSTOMER_SEND_WELCOME_MSG = "POST /externalcontact/send_welcome_msg";

    // 客户-如群欢迎语
    String API_CUSTOMER_WELCOME_MSG_TPL_ADD = "POST /externalcontact/group_welcome_template/add";
    String API_CUSTOMER_WELCOME_MSG_TPL_EDIT = "POST /externalcontact/group_welcome_template/edit";
    String API_CUSTOMER_WELCOME_MSG_TPL_GET = "POST /externalcontact/group_welcome_template/get";
    String API_CUSTOMER_WELCOME_MSG_TPL_DEL = "POST /externalcontact/group_welcome_template/del";

    //客户-统计管理
    String API_CUSTOMER_BEHAVIOR_DATA = "POST /externalcontact/get_user_behavior_data";
    String API_CUSTOMER_GROUP_CHAT_STAT = "POST /externalcontact/groupchat/statistic";
    String API_CUSTOMER_GROUP_CHAT_STAT_BY_DAY = "POST /externalcontact/groupchat/statistic_group_by_day";
}
