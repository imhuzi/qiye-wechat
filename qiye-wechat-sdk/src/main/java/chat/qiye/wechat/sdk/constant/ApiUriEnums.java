package chat.qiye.wechat.sdk.constant;

import java.util.HashSet;
import java.util.Set;

import lombok.Getter;

@Getter
public enum ApiUriEnums {
  // 企业内部应用 获取 accessToken
  TOKEN_GET("/gettoken", "token", "获取 accessToken"),
  //-> 通讯录管理
  CONTACT_DEPT_LIST("/department/list", "contact", "获取部门列表"),
  CONTACT_DEPT_CREATE("/department/create", "contact", "创建部门"),
  CONTACT_DEPT_UPDATE("/department/update", "contact", "更新部门"),
  CONTACT_DEPT_DELETE("/department/delete", "contact", "删除部门"),

  CONTACT_USER_LIST("/user/list", "contact", "批量获取部门成员详情"),
  CONTACT_USER_SIMPLE_LIST("/user/simplelist", "contact", "批量获取部门成员"),
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

  CONTACT_TAG_LIST("/tag/list", "contact", "获取标签列表"),
  CONTACT_TAG_CREATE("/tag/create", "contact", "创建标签"),
  CONTACT_TAG_UPDATE("/tag/update", "contact", "更新标签名字"),
  CONTACT_TAG_DELETE("/tag/delete", "contact", "删除标签"),
  CONTACT_TAG_GET("/tag/get", "contact", "获取标签成员"),
  CONTACT_TAG_ADDTAGUSERS("/tag/addtagusers", "contact", "增加标签成员"),
  CONTACT_TAG_DELTAGUSERS("/tag/deltagusers", "contact", "删除标签成员"),
  ;
  //-> 客户管理


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
