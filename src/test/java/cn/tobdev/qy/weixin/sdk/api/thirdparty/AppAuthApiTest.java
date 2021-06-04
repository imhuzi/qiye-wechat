package cn.tobdev.qy.weixin.sdk.api.thirdparty;

import cn.tobdev.qy.weixin.sdk.interceptor.TokenInterceptor;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.resp.PreAuthCodeResp;
import com.dtflys.forest.config.ForestConfiguration;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class AppAuthApiTest extends TestCase {

    private AppAuthApi appAuthApi;

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

        appAuthApi = configuration.createInstance(AppAuthApi.class);
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