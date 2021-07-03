package chat.qiye.wechat.sdk.service;

/**
 *
 * token  and base url provider
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/16
 */
public interface TokenAndBaseUrlProvider {
  /**
   * get base url
   * @return baseUrl
   */
  String getBaseUrl();

  /**
   * 企业 内部 应用 api token
   *
   * @return access_token
   */
  String getToken();

  /**
   * 第三方 企业 access_token
   * @return access_token
   */
  String getCorpToken();

  /**
   * 第三方  suite_access_token
   * @return suite_access_token
   */
  String getSuiteToken();

  /**
   * 服务商  access_token
   * @return access_token
   */
  String getProviderToken();
}
