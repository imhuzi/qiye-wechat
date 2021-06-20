package cn.tobdev.qy.weixin.sdk.api.thirdparty;

import cn.tobdev.qy.weixin.sdk.api.thirdparty.resp.PreAuthCodeResp;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AppAuthApiTest extends TestCase {

    private AppAuthApi appAuthApi;

    @Override
    protected void setUp() throws Exception {

    }

    public void testGetPreAuthCode() {
        PreAuthCodeResp resp =  appAuthApi.getPreAuthCode("111111");
        log.info("testGetPreAuthCode:{}", resp);
    }

    public void testGetPermanentCodeInfo() {
    }

    public void testGetAuthInfo() {
    }

    public void testGetAdminList() {
    }
}