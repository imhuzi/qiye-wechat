package chat.qiye.wechat.sdk.api.customer;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.customer.param.CustomerTransferParam;
import chat.qiye.wechat.sdk.api.customer.param.CustomerTransferResultGetParam;
import chat.qiye.wechat.sdk.api.customer.param.CustomerUnassignedListParam;
import chat.qiye.wechat.sdk.api.customer.param.GroupChatTransferParam;
import chat.qiye.wechat.sdk.api.customer.resp.CustomerTransferResp;
import chat.qiye.wechat.sdk.api.customer.resp.CustomerTransferResultResp;
import chat.qiye.wechat.sdk.api.customer.resp.CustomerUnassignedListResp;
import chat.qiye.wechat.sdk.api.customer.resp.GroupChatTransferResp;
import chat.qiye.wechat.sdk.constant.CustomerApiUris;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import feign.RequestLine;

/**
 * 客户 在职继承  和 离职继承
 *
 * https://work.weixin.qq.com/api/doc/90000/90135/94077
 *
 * https://work.weixin.qq.com/api/doc/90000/90135/92123
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/26
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_CUSTOMER)
public interface CustomerTransferApi {
  /**
   * 分配在职成员的客户
   * 企业可通过此接口，转接在职成员的客户给其他成员。
   *
   * 请求方式：POST（HTTPS）
   *
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/transfer_customer?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_TRANSFER)
  CustomerTransferResp transfer(CustomerTransferParam param);

  /**
   * 查询客户接替状态
   * 企业和第三方可通过此接口查询在职成员的客户转接情况。
   *
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/transfer_result?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_TRANSFER_RESULT)
  CustomerTransferResultResp getTransferResult(CustomerTransferResultGetParam param);

  /**
   * 获取待分配的离职成员列表
   *
   * 企业和第三方可通过此接口，获取所有离职成员的客户列表，并可进一步调用分配离职成员的客户接口将这些客户重新分配给其他企业成员。
   *
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_unassigned_list?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_UNASSIGNED_LIST)
  CustomerUnassignedListResp getUnassignedList(CustomerUnassignedListParam param);

  /**
   * 分配离职成员的客户
   * 企业可通过此接口，分配离职成员的客户给其他成员。
   *
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/resigned/transfer_customer?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_RESIGNED)
  CustomerTransferResp resigned(CustomerTransferParam param);

  /**
   * 查询客户接替状态
   * 企业和第三方可通过此接口查询离职成员的客户分配情况。
   *
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/resigned/transfer_result?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_RESIGNED_RESULT)
  CustomerTransferResultResp getResignedResult(CustomerTransferResultGetParam param);

  /**
   * 分配离职成员的客户群
   *
   * 企业可通过此接口，将已离职成员为群主的群，分配给另一个客服成员。
   *
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/groupchat/transfer?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_GROUP_CHAT_TRANSFER)
  GroupChatTransferResp transferGroupChat(GroupChatTransferParam param);
}
