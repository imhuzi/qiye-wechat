package cn.tobdev.weixin;

import com.dtflys.forest.config.ForestConfiguration;

public class ClientTest {

    public static void main(String[] args) {
        ForestConfiguration configuration = ForestConfiguration.configuration();
        configuration.setBackendName("okhttp3");
        // 通过Forest配置对象实例化Forest请求接口
        MyClient myClient = configuration.createInstance(MyClient.class);

        // 调用Forest请求接口，并获取响应返回结果
        String result = myClient.hello();
        System.out.println(result);
    }
}
