package cn.tobdev.qy.weixin.sdk.api.auth;

import cn.tobdev.qy.weixin.sdk.MyClient;
import cn.tobdev.qy.weixin.sdk.coverter.ApiJacksonConverter;
import cn.tobdev.qy.weixin.sdk.interceptor.TokenInterceptor;
import cn.tobdev.qy.weixin.sdk.model.auth.resp.PreAuthCodeResp;
import com.dtflys.forest.config.ForestConfiguration;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class AppAuthApiServiceTest extends TestCase {

    private AppAuthApiService appAuthApiService;

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

        appAuthApiService = configuration.createInstance(AppAuthApiService.class);
    }

    public void testGetPreAuthCode() {
        PreAuthCodeResp resp =  appAuthApiService.getPreAuthCode("111111");
        log.info("testGetPreAuthCode:{}", resp);
    }

    public void testGetPermanentCodeInfo() {
    }

    public void testGetAuthInfo() {
    }

    public void testGetAdminList() {
    }
}