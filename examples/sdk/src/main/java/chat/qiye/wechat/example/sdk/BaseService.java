package chat.qiye.wechat.example.sdk;

import chat.qiye.wechat.sdk.api.app.AppManageApi;
import chat.qiye.wechat.sdk.api.app.resp.AppInfoResp;
import chat.qiye.wechat.sdk.service.ApiConfigurationDefaultProvider;
import chat.qiye.wechat.sdk.service.ApiConfigurationProvider;
import chat.qiye.wechat.sdk.service.ApiFactory;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/13
 */
public class BaseService {
    protected ApiConfigurationProvider apiConfigurationProvider;

    private AppManageApi appManageApi;

    public BaseService() {
        apiConfigurationProvider = new ApiConfigurationDefaultProvider();
        appManageApi = ApiFactory.getApiBean(AppManageApi.class, apiConfigurationProvider);
    }

    public AppInfoResp get(Integer agentid) {
         return appManageApi.get(agentid);
    }
}
