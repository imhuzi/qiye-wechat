package cn.tobdev.qy.weixin.sdk.constant;

import java.util.HashSet;
import java.util.Set;

import lombok.Getter;

@Getter
public enum ApiUriEnums {
  /**
   * token api
   */
  TOKEN_GET("/gettoken", "token", "获取 accessToken"),
  /**
   * 通讯录 用户详情api
   */
  CONTACT_USER_GET("/user/get", "contact", "读取成员"),
  CONTACT_USER_CREATE("/user/create", "contact", "创建成员"),
  CONTACT_USER_UPDATE("/user/update", "contact", "更新成员"),
  CONTACT_USER_DELETE("/user/delete", "contact", "删除成员"),
  CONTACT_USER_DELETE_BATCH("/user/batchdelete", "contact", "批量删除成员"),
  CONTACT_USER_TO_OPENID("/user/convert_to_openid", "contact", "userid与openid互换"),
  CONTACT_USER_TO_USERID("/user/convert_to_userid", "contact", "openid转userid"),
  CONTACT_USER_TO_AUTHSUCC("/user/authsucc", "contact", "二次验证"),
  CONTACT_USER_INVITE("/batch/invite", "contact", "邀请成员"),
  CONTACT_GET_JOIN_QRCODE("/corp/get_join_qrcode", "contact", "获取加入企业二维码"),
  CONTACT_GET_ACTIVE_STAT("/user/get_active_stat", "contact", "获取企业活跃成员数"),
  /**
   * 通讯录用户列表
   */
  CONTACT_USER_LIST("/user/list", "contact", "获取部门成员详情"),
  /**
   * 通讯录用户简单信息列表
   * https://work.weixin.qq.com/api/doc/90000/90135/90200
   */
  CONTACT_USER_SIMPLE_LIST("/user/simplelist", "contact", "获取部门成员"),
  /**
   * 通讯录部门列表
   */
  CONTACT_DEPT_LIST("/department/list", "contact", "获取部门列表"),
  /**
   * 标签列表
   */
  CONTACT_TAG_LIST("/tag/list", "contact", "获取标签列表");

  public static final String API_TOKEN_GET = "/gettoken";

  public static final String API_DEPT_LIST = "/department/list";

  public static final String API_DEPT_CREATE = "/department/create";

  //-------------通讯录成员管理
  public static final String API_USER_LIST = "/user/list";

  public static final String API_USER_SIMPLE_LIST = "/user/simplelist";

  public static final String API_USER_GET = "/user/get";

  public static final String API_USER_CREATE = "/user/create";

  public static final String API_USER_UPDATE = "/user/update";

  public static final String API_USER_DELETE = "/user/delete";

  public static final String API_USER_DELETE_BATCH = "/user/batchdelete";

  public static final String API_USER_TO_OPENID = "/user/convert_to_openid";

  public static final String API_USER_TO_USERID = "/user/convert_to_userid";

  public static final String API_USER_AUTHSUCC = "/user/authsucc";

  public static final String API_USER_INVITE = "/batch/invite";

  public static final String API_GET_JOIN_QRCODE = "/corp/get_join_qrcode";

  public static final String API_GET_ACTIVE_STAT = "/user/get_active_stat";

  public static final String API_OAUTH2_USER_INFO = "/user/getuserinfo";
  //-----------------通讯录成员管理 end

  private final String apiUri;

  private final String descp;

  private final String cate;

  ApiUriEnums(String apiUri, String cate, String descp) {
    this.apiUri = apiUri;
    this.descp = descp;
    this.cate = cate;
  }

  public static String Api(ApiUriEnums api) {
    return api.getApiUri();
  }

  public static Set<String> getContactApiUris() {
    ApiUriEnums[] apis = ApiUriEnums.values();
    Set<String> set = new HashSet<>();
    for (ApiUriEnums item : apis) {
      if (item.cate.equalsIgnoreCase("contact")) {
        set.add(item.getApiUri());
      }
    }
    return set;
  }
}
