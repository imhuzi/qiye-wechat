package chat.qiye.wechat.sdk.service;

import chat.qiye.wechat.sdk.constant.Constant;

/**
 *
 *  configuration provider interface
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/16
 */
public interface ApiConfigurationProvider {
  default String name() {
    return "QiYeChat";
  }
  /**
   * get base url
   * @return baseUrl
   */
  default String baseUrl() {
    return "https://qyapi.weixin.qq.com/cgi-bin";
  }

  /**
   * 是否支持重定向
   *
   * @return
   */
  default boolean followRedirects() {
    return true;
  }

  /**
   * 连接超时时间
   *
   * get connect timeout
   *
   * @return
   */
  default Integer getConnectTimeout() {
    return 10;
  }

  /**
   * 响应超时时间
   *
   *  get read timeout SECONDS
   *
   * @return
   */
  default Integer getReadTimeout() {
    return 60;
  }

  /**
   * 企业 内部 应用 api token
   *
   * @return access_token
   */
  String getToken();

  /**
   * 获取 系统 应用 专属 token, 比如 通讯录，客户关系等
   *
   * @param  app    {@link Constant}
   * @return access_token
   */
  String getSysAppToken(String app);

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
