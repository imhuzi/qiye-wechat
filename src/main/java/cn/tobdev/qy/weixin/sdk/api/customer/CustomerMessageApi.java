package cn.tobdev.qy.weixin.sdk.api.customer;

import cn.tobdev.qy.weixin.sdk.api.BaseApi;
import cn.tobdev.qy.weixin.sdk.api.customer.param.AddMsgTemplateParam;
import cn.tobdev.qy.weixin.sdk.api.customer.param.GroupMsgListV2Param;
import cn.tobdev.qy.weixin.sdk.api.customer.param.GroupMsgSentResultGetParam;
import cn.tobdev.qy.weixin.sdk.api.customer.param.GroupMsgTaskGetParam;
import cn.tobdev.qy.weixin.sdk.api.customer.resp.AddMsgTemplateResp;
import cn.tobdev.qy.weixin.sdk.api.customer.resp.GroupMsgListV2Resp;
import cn.tobdev.qy.weixin.sdk.api.customer.resp.GroupMsgTaskGetResp;
import cn.tobdev.qy.weixin.sdk.constant.CustomerApiUris;
import feign.RequestLine;

/**
 *
 * 客户 相关的消息推送
 *
 * https://work.weixin.qq.com/api/doc/90000/90135/92134
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/26
 */
public interface CustomerMessageApi extends BaseApi {

  /**
   *  创建企业群发
   *
   * 企业跟第三方应用可通过此接口添加企业群发消息的任务并通知成员发送给相关客户或客户群。（注：企业微信终端需升级到2.7.5版本及以上）
   * 注意：调用该接口并不会直接发送消息给客户/客户群，需要成员确认后才会执行发送（客服人员的企业微信需要升级到2.7.5及以上版本）
   * 旧接口创建企业群发已经废弃，接口升级后支持发送视频文件，并且支持最多同时发送9个附件。
   * 同一个企业每个自然月内仅可针对一个客户/客户群发送4条消息，超过接收上限的客户将无法再收到群发消息。
   *
   * 请求方式: POST(HTTP)
   *
   * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/externalcontact/add_msg_template?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_ADD_MSG_TEMPLATE)
  AddMsgTemplateResp addMsgTemplate(AddMsgTemplateParam param);

  /**
   * 获取群发记录列表
   * 企业和第三方应用可通过此接口获取企业与成员的群发记录。
   *
   * 请求方式：POST(HTTPS)
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_groupmsg_list_v2?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_GET_GROUPMSG_LIST_V2)
  GroupMsgListV2Resp getGroupMsgListV2(GroupMsgListV2Param param);

  /**
   * 获取群发成员发送任务列表
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_GET_GROUPMSG_TASK)
  GroupMsgTaskGetResp getGroupMsgTask(GroupMsgTaskGetParam param);

  @RequestLine(CustomerApiUris.API_CUSTOMER_GET_GROUPMSG_SENT_RESULT)
  AddMsgTemplateResp getGroupMsgSentResult(GroupMsgSentResultGetParam param);

  @RequestLine(CustomerApiUris.API_CUSTOMER_SEND_WELCOME_MSG)
  AddMsgTemplateResp sendWelcomeMsg();
}
