package chat.qiye.wechat.sdk.constant;

/**
 * api uri 常量
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/6/16
 */
public interface BaseApiUris {

    String API_GET_TOKEN = "GET /gettoken?corpid={corpid}&corpsecret={corpsecret}";

    //通讯录-> 部门管理

    String API_DEPT_LIST = "GET /department/list?id={id}";
    String API_DEPT_CREATE = "POST /department/create";
    String API_DEPT_UPDATE = "POST /department/update";
    String API_DEPT_DELETE = "GET /department/delete?id={id}";

    //通讯录-> 成员管理

    String API_USER_LIST = "GET /user/list?department_id={department_id}&fetch_child={fetch_child}";
    String API_USER_SIMPLE_LIST = "GET /user/simplelist?department_id={department_id}&fetch_child={fetch_child}";
    String API_USER_GET = "GET /user/get?userid={userid}";
    String API_USER_CREATE = "POST /user/create";
    String API_USER_UPDATE = "POST /user/update";
    String API_USER_DELETE = "GET /user/delete?userid={userid}";

    String API_USER_DELETE_BATCH = "POST /user/batchdelete";
    String API_USER_TO_OPENID = "POST /user/convert_to_openid";
    String API_USER_TO_USERID = "POST /user/convert_to_userid";
    String API_USER_AUTHSUCC = "GET /user/authsucc?userid={userid}";
    String API_USER_INVITE = "POST /batch/invite";
    String API_GET_JOIN_QRCODE = "GET /corp/get_join_qrcode?size_type={size_type}";
    String API_GET_ACTIVE_STAT = "POST /user/get_active_stat";
    String API_OAUTH2_USER_INFO = "GET /user/getuserinfo";

    // 通讯录 异步批量接口
    String API_BATCH_SYNCUSER = "POST /batch/syncuser";
    String API_BATCH_REPLACEUSER = "POST /batch/replaceuser";
    String API_BATCH_REPLACEPARTY = "POST /batch/replaceparty";
    String API_BATCH_GETRESULT = "GET /batch/getresult?jobid={jobid}";

    // 通讯录 异步导出
    String API_EXPORT_SIMPLE_USER = "POST /export/simple_user";
    String API_EXPORT_USER = "POST /export/user";
    String API_EXPORT_DEPARTMENT = "POST /export/department";
    String API_EXPORT_TAGUSER = "POST /export/taguser";
    String API_EXPORT_GET_RESULT = "GET /export/get_result?jobid={jobid}";

    /**
     * 第三方应用 可调用
     */
    String API_USER_GET_USERID = "POST /user/getuserid";
    String API_USER_AUTH_MEMBER_LIST = "GET /user/list_member_auth";
    String API_USER_CHECK_MEMBER_AUTH = "GET /user/check_member_auth";
    String API_LIST_SELECTED_TICKET_USER = "POST /user/list_selected_ticket_user";
    // 通讯录-标签管理
    String API_TAG_LIST = "GET /tag/list";
    String API_TAG_CREATE = "POST /tag/create";
    String API_TAG_UPDATE = "POST /tag/update";
    String API_TAG_DELETE = "GET /tag/delete?tagid={tagid}";
    String API_TAG_GET = "GET /tag/get?tagid={tagid}";
    String API_TAG_ADDTAGUSERS = "POST /tag/addtagusers";
    String API_TAG_DELTAGUSERS = "POST /tag/deltagusers";

    // 互联企业
    String API_LINKEDCORP_AGENT_GET_PERM_LIST = "POST /linkedcorp/agent/get_perm_list";
    String API_LINKEDCORP_USER_GET = "POST /linkedcorp/user/get";
    String API_LINKEDCORP_USER_SIMPLELIST = "POST /linkedcorp/user/simplelist";
    String API_LINKEDCORP_USER_LIST = "POST /linkedcorp/user/list";
    String API_LINKEDCORP_DEPARTMENT_LIST = "POST /linkedcorp/department/list";


    // 应用管理
    String API_GET_DOMAIN_IP = "GET /get_api_domain_ip";
    String API_AGENT_GET = "GET /agent/get?agentid={agentid}";
    String API_AGENT_SET = "POST /agent/set";
    String API_AGENT_MENU_CREATE = "POST /menu/create?agentid={agentid}";
    String API_AGENT_MENU_GET = "POST /menu/get?agentid={agentid}";
    String API_AGENT_MENU_DELETE = "GET /menu/delete?agentid={agentid}";
    String API_AGENT_WORKBENCH_TEMPLATE_GET = "POST /agent/get_workbench_template";
    String API_AGENT_WORKBENCH_TEMPLATE_SET = "POST /agent/set_workbench_template";
    String API_AGENT_WORKBENCH_SET_DATA = "POST /agent/set_workbench_data";

    // 素材管理
    String API_MEDIA_UPLOAD = "POST /media/upload";
    String API_MEDIA_UPLOADIMG = "POST /media/uploadimg";
    String API_MEDIA_GET = "GET /media/get?media_id={media_id}";
    String API_MEDIA_GET_JSSDK = "GET /media/get/jssdk?media_id={media_id}";

    // 企业互联
    String API_GET_CORPGROUP_LIST_APP_INFO = "POST /corpgroup/corp/list_app_share_info";
    String API_GET_CORPGROUP_GETTOKEN = "POST /corpgroup/corp/gettoken";
    String API_GET_CORPGROUP_MINIPROGRAM_SESSION = "POST /miniprogram/transfer_session?access_token={corpgroup_access_token}";


    //第三方应用->  应用授权相关接口 start

    String SERVICE_GET_PROVIDER_TOKEN = "/service/get_provider_token";
    String SERVICE_GET_SUITE_TOKEN = "/service/get_suite_token";
    String SERVICE_GET_CORP_TOKEN = "/service/get_corp_token";

    String SERVICE_GET_PERMANENT_CODE = "/service/get_permanent_code";
    String SERVICE_GET_AUTH_INFO = "/service/get_auth_info";
    String SERVICE_GET_ADMIN_LIST = "/service/get_admin_list";
    String SERVICE_SET_SESSION_INFO = "/service/set_session_info";

    //第三方应用->  应用授权相关接口 end
}
