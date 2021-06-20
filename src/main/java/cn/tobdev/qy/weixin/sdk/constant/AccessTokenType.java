package cn.tobdev.qy.weixin.sdk.constant;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/16
 */
public interface AccessTokenType {

  /**
   * 企业内部应用 access token
   */
  String TOKEN_TYPE_DEFAULT = "default";

  /**
   * 第三方-> 企业 access token
   */
  String TOKEN_TYPE_CORP = "corp";

  /**
   * 第三方->  suite_access_token
   */
  String TOKEN_TYPE_SUITE = "suite";

  /**
   * 第三方-> 服务商  access_token
   */
  String TOKEN_TYPE_PROVIDER = "provider";
}
