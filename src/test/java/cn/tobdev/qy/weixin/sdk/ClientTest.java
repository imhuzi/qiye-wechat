package cn.tobdev.qy.weixin.sdk;

import cn.tobdev.qy.weixin.sdk.coverter.ApiJacksonConverter;
import cn.tobdev.qy.weixin.sdk.interceptor.TokenInterceptor;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.req.CorpPermanentCodeReqParam;
import com.dtflys.forest.config.ForestConfiguration;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {

    public static void main(String[] args) {
        ForestConfiguration configuration = ForestConfiguration.configuration();
        configuration.setVariableValue("baseUrl", "https://qyapi.weixin.qq.com/cgi-bin");
        configuration.setSslProtocol("TLSv1.2");
        configuration.setJsonConverter(new ApiJacksonConverter());
        configuration.setBackendName("okhttp3");
        List<Class> interceptors = new ArrayList<>();
        interceptors.add(TokenInterceptor.class);
        configuration.setInterceptors(interceptors);
        // 通过Forest配置对象实例化Forest请求接口
        MyClient appAuthApiService = configuration.createInstance(MyClient.class);

        // 调用Forest请求接口，并获取响应返回结果
        CorpPermanentCodeReqParam reqParam = new CorpPermanentCodeReqParam();
        reqParam.setAuthCode("codekkkkkk");
        String result = appAuthApiService.hello();
        System.out.println(result);
    }
}
