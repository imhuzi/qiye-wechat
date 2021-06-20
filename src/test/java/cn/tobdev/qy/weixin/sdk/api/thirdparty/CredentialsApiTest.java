package cn.tobdev.qy.weixin.sdk.api.thirdparty;

import cn.tobdev.qy.weixin.sdk.api.thirdparty.req.ProviderAccessTokenParam;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.resp.ProviderAccessTokenResp;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CredentialsApiTest extends TestCase {

    private CredentialsApi credentialsApi;

    @Override
    protected void setUp() throws Exception {

    }

    public void testGetProviderTokenInfo() {
        ProviderAccessTokenParam reqParam = new ProviderAccessTokenParam();
        reqParam.setCorpid("kk");
        reqParam.setProviderSecret("ll-8dVyBqp4-Gkp86vEM-yKbpOWY6URYR1uUkn4YSTM6mJKDZEv28gf");
        ProviderAccessTokenResp resp = credentialsApi.getProviderTokenInfo(reqParam);
        log.info("testGetProviderTokenInfoRest:{}", resp);
        assertTrue(resp.success());
    }

    public void testGetSuiteAccessTokenInfo() {
    }

    public void testGetCorpTokenInfo() {
    }
}