package cn.tobdev.qy.weixin.sdk.api.thirdparty;

import cn.tobdev.qy.weixin.sdk.interceptor.TokenInterceptor;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.req.ProviderAccessTokenReqParam;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.resp.ProviderAccessTokenResp;
import com.dtflys.forest.config.ForestConfiguration;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class CredentialsApiTest extends TestCase {

    private CredentialsApi credentialsApi;

    @Override
    protected void setUp() throws Exception {
        ForestConfiguration configuration = ForestConfiguration.configuration();
        configuration.setVariableValue("baseUrl", "https://qyapi.weixin.qq.com/cgi-bin");
        configuration.setSslProtocol("TLSv1.2");
        configuration.setBackendName("okhttp3");
        configuration.setLogResponseContent(true);
        List<Class> interceptors = new ArrayList<>();
        interceptors.add(TokenInterceptor.class);
        configuration.setInterceptors(interceptors);

        credentialsApi = configuration.createInstance(CredentialsApi.class);
    }

    public void testGetProviderTokenInfo() {
        ProviderAccessTokenReqParam reqParam = new ProviderAccessTokenReqParam();
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