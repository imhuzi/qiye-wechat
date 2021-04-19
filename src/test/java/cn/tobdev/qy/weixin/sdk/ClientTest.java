package cn.tobdev.qy.weixin.sdk;

import cn.tobdev.qy.weixin.sdk.api.auth.AppAuthApiService;
import cn.tobdev.qy.weixin.sdk.coverter.ApiJacksonConverter;
import cn.tobdev.qy.weixin.sdk.interceptor.TokenInterceptor;
import cn.tobdev.qy.weixin.sdk.model.auth.PreAuthCodeResp;
import com.dtflys.forest.config.ForestConfiguration;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {

    public static void main(String[] args) {
        ForestConfiguration configuration = ForestConfiguration.configuration();
        configuration.setVariableValue("baseApiUrl", "https://qyapi.weixin.qq.com/cgi-bin");
        configuration.setSslProtocol("TLSv1.2");
        configuration.setJsonConverter(new ApiJacksonConverter());
        configuration.setBackendName("okhttp3");
        List<Class> interceptors = new ArrayList<>();
        interceptors.add(TokenInterceptor.class);
        configuration.setInterceptors(interceptors);
        // 通过Forest配置对象实例化Forest请求接口
        AppAuthApiService appAuthApiService = configuration.createInstance(AppAuthApiService.class);

        // 调用Forest请求接口，并获取响应返回结果
        PreAuthCodeResp result = appAuthApiService.getPreAuthCode("1111");
        System.out.println(result);
    }
}
