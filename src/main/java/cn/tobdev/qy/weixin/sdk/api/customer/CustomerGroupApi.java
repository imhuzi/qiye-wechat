package cn.tobdev.qy.weixin.sdk.api.customer;

import com.ddweilai.crm.qywx.api.enums.ApiUriEnums;
import com.ddweilai.crm.qywx.api.interceptor.TokenInterceptor;
import com.ddweilai.crm.qywx.api.vo.req.CustomerGroupGetReq;
import com.ddweilai.crm.qywx.api.vo.req.CustomerGroupListReq;
import com.ddweilai.crm.qywx.api.vo.resp.CustomerGroupListResp;
import com.ddweilai.crm.qywx.api.vo.resp.CustomerGroupResp;
import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.JSONBody;
import com.dtflys.forest.annotation.Post;

/**
 * 客户群 相关 接口
 */
@BaseRequest(
        baseURL = "${qywx_api_host}",     // 默认域名
        interceptor = TokenInterceptor.class,
        headers = {"Accept:text/plain"}
)
public interface CustomerGroupApi {

    /**
     * 获取 客户 群列表
     *
     * @param req 请求参数
     * @return {@link CustomerGroupListResp}
     */
    @Post(ApiUriEnums.API_CUSTOMER_GROUP_LIST)
    CustomerGroupListResp list(@JSONBody CustomerGroupListReq req);


    /**
     * 获取 客户 群详情
     *
     * @param req 请求参数
     * @return {@link CustomerGroupListResp}
     */
    @Post(ApiUriEnums.API_CUSTOMER_GROUP_GET)
    CustomerGroupResp get(@JSONBody CustomerGroupGetReq req);


}
