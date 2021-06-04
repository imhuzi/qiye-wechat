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

  public static final String API_USER_LIST = "/user/list";

  public static final String API_USER_SIMPLE_LIST = "/user/simplelist";

  public static final String API_USER_GET = "/user/get";

  public static final String API_OAUTH2_USER_INFO = "/user/getuserinfo";

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
