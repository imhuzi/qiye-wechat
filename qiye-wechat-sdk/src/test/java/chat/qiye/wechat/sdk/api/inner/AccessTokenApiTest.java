package chat.qiye.wechat.sdk.api.inner;

import chat.qiye.wechat.sdk.BaseTest;
import chat.qiye.wechat.sdk.api.inner.resp.AccessTokenResp;
import chat.qiye.wechat.sdk.service.ApiFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/3
 */
@Slf4j
public class AccessTokenApiTest extends BaseTest {

    private AccessTokenApi accessTokenApi;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        accessTokenApi = ApiFactory.getApiBean(AccessTokenApi.class, this.apiConfigurationProvider);
    }

    public void testAccessTokenInfo() {
        AccessTokenResp resp = accessTokenApi.accessTokenInfo("ww16e3a15cc859c8d", "YZAVob4P0KCbQsuSSBawlHLVZ3Emfz9ugyx8QXN4HRo");
        log.info("resp:{}", resp);
        Assert.assertTrue(resp.success());
    }
}