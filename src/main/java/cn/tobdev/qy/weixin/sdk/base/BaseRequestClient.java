package cn.tobdev.qy.weixin.sdk.base;

import com.dtflys.forest.annotation.BaseRequest;

@BaseRequest(
        baseURL = "${baseApiUrl}",     // 默认域名
        headers = {
                "Accept:application/json, text/plain, */*"                // 默认请求头
        },
        sslProtocol = "TLS"
)
public interface BaseRequestClient {

}
