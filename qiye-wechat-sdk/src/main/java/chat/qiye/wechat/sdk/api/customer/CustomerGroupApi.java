package chat.qiye.wechat.sdk.api.customer;


import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.customer.param.CustomerGroupGetParam;
import chat.qiye.wechat.sdk.api.customer.param.CustomerGroupListParam;
import chat.qiye.wechat.sdk.api.customer.resp.CustomerGroupListResp;
import chat.qiye.wechat.sdk.api.customer.resp.CustomerGroupResp;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import chat.qiye.wechat.sdk.constant.CustomerApiUris;
import feign.RequestLine;

/**
 * 客户群 相关 接口
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_CUSTOMER)
public interface CustomerGroupApi {

    /**
     * 获取 客户 群列表
     *
     * @param param 请求参数
     * @return {@link CustomerGroupListResp}
     */
    @RequestLine(CustomerApiUris.API_CUSTOMER_GROUP_CHAT_LIST)
    CustomerGroupListResp list(CustomerGroupListParam param);


    /**
     * 获取 客户 群详情
     *
     * @param param 请求参数
     * @return {@link CustomerGroupListResp}
     */
    @RequestLine(CustomerApiUris.API_CUSTOMER_GROUP_CHAT_GET)
    CustomerGroupResp get(CustomerGroupGetParam param);


}
