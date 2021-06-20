package cn.tobdev.qy.weixin.sdk.constant;

/**
 * api uri 常量
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/16
 */
public interface ApiUri {

  String API_GET_TOKEN = "/gettoken";

  //通讯录-> 部门管理

  String API_DEPT_LIST = "GET /department/list";
  String API_DEPT_CREATE = "POST /department/create";
  String API_DEPT_UPDATE = "POST /department/update";
  String API_DEPT_DELETE = "GET /department/delete";

  //通讯录-> 成员管理

  String API_USER_LIST = "GET /user/list";
  String API_USER_SIMPLE_LIST = "GET /user/simplelist";
  String API_USER_GET = "GET /user/get";
  String API_USER_CREATE = "POST /user/create";
  String API_USER_UPDATE = "POST /user/update";
  String API_USER_DELETE = "GET /user/delete";

  String API_USER_DELETE_BATCH = "POST /user/batchdelete";
  String API_USER_TO_OPENID = "POST /user/convert_to_openid";
  String API_USER_TO_USERID = "POST /user/convert_to_userid";
  String API_USER_AUTHSUCC = "GET /user/authsucc";
  String API_USER_INVITE = "POST /batch/invite";
  String API_GET_JOIN_QRCODE = "GET /corp/get_join_qrcode";
  String API_GET_ACTIVE_STAT = "POST /user/get_active_stat";
  String API_OAUTH2_USER_INFO = "GET /user/getuserinfo";

  /**
   *  第三方应用 可调用
   */
  String API_USER_GET_USERID = "POST /user/getuserid";
  String API_USER_AUTH_MEMBER_LIST = "GET /user/list_member_auth";
  String API_USER_CHECK_MEMBER_AUTH = "GET /user/check_member_auth";

  String API_TAG_LIST = "/tag/list";
  String API_TAG_CREATE = "/tag/create";
  String API_TAG_UPDATE = "/tag/update";
  String API_TAG_DELETE = "/tag/delete";
  String API_TAG_GET = "/tag/get";
  String API_TAG_ADDTAGUSERS = "/tag/addtagusers";
  String API_TAG_DELTAGUSERS = "/tag/deltagusers";


  String API_AGENT_GET = "/agent/get";

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
