package chat.qiye.wechat.sdk.api.customer;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.customer.param.CustomerBatchByUserParam;
import chat.qiye.wechat.sdk.api.customer.resp.CustomerGetResp;
import chat.qiye.wechat.sdk.api.customer.resp.CustomerListResp;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import chat.qiye.wechat.sdk.constant.CustomerApiUris;
import feign.Param;
import feign.RequestLine;

/**
 * 客户管理相关 api
 * <p>
 * https://work.weixin.qq.com/api/doc/90000/90135/92112
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/6/3
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_CUSTOMER)
public interface CustomerApi {

    /**
     * 企业可通过此接口，根据外部联系人的userid（如何获取?），拉取客户详情。
     * <p>
     * 权限说明：
     * <p>
     * 企业需要使用系统应用“客户联系”或配置到“可调用应用”列表中的自建应用的secret所获取的accesstoken来调用（accesstoken如何获取？）；
     * 第三方应用需具有“企业客户权限->客户基础信息”权限
     * 第三方/自建应用调用时，返回的跟进人follow_user仅包含应用可见范围之内的成员。
     * 当客户在企业内的跟进人超过500人时需要使用cursor参数进行分页获取
     *
     * @param externalUserid 外部联系人的userid，注意不是企业成员的帐号
     * @param cursor         非必填 上次请求返回的next_cursor
     * @return {@link CustomerGetResp}
     */
    @RequestLine(CustomerApiUris.API_CUSTOMER_GET)
    CustomerGetResp get(@Param("external_userid") String externalUserid, @Param("cursor") String cursor);

    /**
     * 调试工具
     * 企业可通过此接口获取指定成员添加的客户列表。客户是指配置了客户联系功能的成员所添加的外部联系人。没有配置客户联系功能的成员，所添加的外部联系人将不会作为客户返回。
     * <p>
     * 请求方式：GET（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/list?access_token=ACCESS_TOKEN&userid=USERID
     * <p>
     * 参数说明：
     * <p>
     * 参数	必须	说明
     * access_token	是	调用接口凭证
     * userid	是	企业成员的userid
     * 权限说明：
     * <p>
     * 企业需要使用“客户联系”secret或配置到“可调用应用”列表中的自建应用secret所获取的accesstoken来调用（accesstoken如何获取？）；
     * 第三方应用需具有“企业客户权限->客户基础信息”权限
     * 第三方/自建应用只能获取到可见范围内的配置了客户联系功能的成员。
     *
     * @param userid 企业成员的userid
     * @return {@link CustomerListResp}
     */
    @RequestLine(CustomerApiUris.API_CUSTOMER_LIST)
    CustomerListResp list(@Param("userid") String userid);

    /**
     * 批量获取客户详情
     * 企业/第三方可通过此接口获取指定成员添加的客户信息列表。
     * <p>
     * 请求方式：POST（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/batch/get_by_user?access_token=ACCESS_TOKEN
     * <p>
     * 请求示例：
     * <p>
     * {
     * "userid":"rocky",
     * "cursor":"",
     * "limit":100
     * }
     *
     * @param req 请求参数
     * @return {@link CustomerGetResp}
     */
    @RequestLine(CustomerApiUris.API_CUSTOMER_BATCH)
    CustomerGetResp batchByUser(CustomerBatchByUserParam req);

    /**
     * 修改客户备注信息
     * 调试工具
     * 企业可通过此接口修改指定用户添加的客户的备注信息。
     * <p>
     * 请求方式: POST(HTTP)
     * <p>
     * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/externalcontact/remark?access_token=ACCESS_TOKEN
     *
     * @param req 请求参数
     * @return {@link CustomerGetResp}
     */
    @RequestLine(CustomerApiUris.API_CUSTOMER_REMARK_UPDATE)
    CustomerGetResp updateRemark(CustomerBatchByUserParam req);


}
