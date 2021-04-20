package cn.tobdev.qy.weixin.sdk.api.appauth;

import cn.tobdev.qy.weixin.sdk.coverter.ApiJacksonConverter;
import cn.tobdev.qy.weixin.sdk.interceptor.TokenInterceptor;
import cn.tobdev.qy.weixin.sdk.model.appauth.token.ProviderAccessTokenReqParam;
import cn.tobdev.qy.weixin.sdk.model.appauth.token.ProviderAccessTokenResp;
import com.dtflys.forest.config.ForestConfiguration;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class CredentialsApiServiceTest extends TestCase {

    private CredentialsApiService credentialsApiService;

    @Override
    protected void setUp() throws Exception {
        ForestConfiguration configuration = ForestConfiguration.configuration();
        configuration.setVariableValue("baseUrl", "https://qyapi.weixin.qq.com/cgi-bin");
        configuration.setSslProtocol("TLSv1.2");
        configuration.setJsonConverter(new ApiJacksonConverter());
        configuration.setBackendName("okhttp3");
        configuration.setLogResponseContent(true);
        List<Class> interceptors = new ArrayList<>();
        interceptors.add(TokenInterceptor.class);
        configuration.setInterceptors(interceptors);

        credentialsApiService = configuration.createInstance(CredentialsApiService.class);
    }

    public void testGetProviderTokenInfo() {
        ProviderAccessTokenReqParam reqParam = new ProviderAccessTokenReqParam();
        reqParam.setCorpid("kk");
        reqParam.setProviderSecret("ll-8dVyBqp4-Gkp86vEM-yKbpOWY6URYR1uUkn4YSTM6mJKDZEv28gf");
        ProviderAccessTokenResp resp = credentialsApiService.getProviderTokenInfo(reqParam);
        log.info("testGetProviderTokenInfoRest:{}", resp);
        assertTrue(resp.success());
    }

    public void testGetSuiteAccessTokenInfo() {
    }

    public void testGetCorpTokenInfo() {
    }
}