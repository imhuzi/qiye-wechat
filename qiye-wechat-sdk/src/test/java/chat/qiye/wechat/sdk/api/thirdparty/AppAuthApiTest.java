package chat.qiye.wechat.sdk.api.thirdparty;

import chat.qiye.wechat.sdk.api.thirdparty.param.CorpPermanentCodeParam;
import chat.qiye.wechat.sdk.api.thirdparty.resp.CorpPermanentCodeResp;
import chat.qiye.wechat.sdk.api.thirdparty.resp.PreAuthCodeResp;
import chat.qiye.wechat.sdk.service.ApiConfigurationDefaultProvider;
import chat.qiye.wechat.sdk.service.ApiFactory;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;

@Slf4j
public class AppAuthApiTest extends TestCase {

  private AppAuthApi appAuthApi;

  @Override
  protected void setUp() throws Exception {
    appAuthApi = ApiFactory.getApiBean(AppAuthApi.class, new ApiConfigurationDefaultProvider());
  }

  public void testGetPreAuthCode() {
    PreAuthCodeResp resp = appAuthApi.getPreAuthCode();
    Assert.assertTrue(resp.success());
  }

  public void testGetPermanentCodeInfo() {
    CorpPermanentCodeResp resp = appAuthApi.getPermanentCodeInfo(new CorpPermanentCodeParam());
    Assert.assertTrue(resp.success());
  }

  public void testGetAuthInfo() {
  }

  public void testGetAdminList() {
  }
}