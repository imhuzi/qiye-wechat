package chat.qiye.wechat.sdk;

import chat.qiye.wechat.sdk.service.ApiConfigurationProvider;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/18
 */
public class ApiConfigurationDefaultProvider implements ApiConfigurationProvider {
  /**
   * 企业 内部 应用 api token
   *
   * @return access_token
   */
  @Override
  public String getToken() {
    return null;
  }

  /**
   * 获取 系统 应用 专属 token, 比如 通讯录，客户关系等
   *
   * @param  app    {@link SysAppConstant}
   * @return access_token
   */
  @Override
  public String getSysAppToken(String app) {
    return null;
  }

  /**
   * 第三方 企业 access_token
   * @return access_token
   */
  @Override
  public String getCorpToken() {
    return null;
  }

  /**
   * 第三方  suite_access_token
   * @return suite_access_token
   */
  @Override
  public String getSuiteToken() {
    return null;
  }

  /**
   * 服务商  access_token
   * @return access_token
   */
  @Override
  public String getProviderToken() {
    return null;
  }
}
