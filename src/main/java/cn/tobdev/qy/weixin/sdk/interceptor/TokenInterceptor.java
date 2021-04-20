package cn.tobdev.qy.weixin.sdk.interceptor;

import com.dtflys.forest.http.ForestRequest;
import com.dtflys.forest.interceptor.Interceptor;
import com.dtflys.forest.reflection.ForestMethod;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TokenInterceptor implements Interceptor<String> {

    /**
     * 该方法在被调用时，并在beforeExecute前被调用
     * @Param request Forest请求对象
     * @Param args 方法被调用时传入的参数数组
     */
    @Override
    public void onInvokeMethod(ForestRequest request, ForestMethod method, Object[] args) {
        log.info("on invoke method:{}", method.getVariable("suiteAccessToken"));
        log.info("on invoke method:{}", method.getVariable("appId"));
        method.getVariable("");
    }

    @Override
    public boolean beforeExecute(ForestRequest request) {
        log.info("invoke Simple beforeExecute:{}", request.getUrl());
        // 执行在发送请求之前处理的代码
//        request.addHeader("accessToken", "11111111");  // 添加Header
//        request.addQuery("username", "foo");  // 添加URL的Query参数
//        request.replaceQuery()

        return true;  // 继续执行请求返回true
    }
}
