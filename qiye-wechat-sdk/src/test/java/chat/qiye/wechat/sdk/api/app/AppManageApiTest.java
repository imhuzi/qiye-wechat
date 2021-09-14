package chat.qiye.wechat.sdk.api.app;

import chat.qiye.wechat.sdk.BaseTest;
import chat.qiye.wechat.sdk.api.app.resp.AppInfoResp;
import chat.qiye.wechat.sdk.service.ApiFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/4
 */
@Slf4j
public class AppManageApiTest extends BaseTest {

    private AppManageApi appManageApi;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        appManageApi = ApiFactory.getApiBean(AppManageApi.class, this.apiConfigurationProvider);
    }

    public void testGet() {
        AppInfoResp resp =  appManageApi.get(1000088);
        log.info("resp:{}", resp);
        Assert.assertTrue(resp.success());
    }
}