package cn.tobdev.qy.weixin.sdk;

import com.dtflys.forest.annotation.Request;

public interface MyClient {

    @Request(url = "http://baidu.com")
    String hello();
}
