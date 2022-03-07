package chat.qiye.wechat.sdk.api.customer;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.customer.dto.SentWelcomeMsgParam;
import chat.qiye.wechat.sdk.api.customer.param.AddMsgTemplateParam;
import chat.qiye.wechat.sdk.api.customer.param.GroupMsgListV2Param;
import chat.qiye.wechat.sdk.api.customer.param.GroupMsgSentResultGetParam;
import chat.qiye.wechat.sdk.api.customer.param.GroupMsgTaskGetParam;
import chat.qiye.wechat.sdk.api.customer.param.GroupWelcomeTemplateDelParam;
import chat.qiye.wechat.sdk.api.customer.param.GroupWelcomeTemplateGetParam;
import chat.qiye.wechat.sdk.api.customer.param.GroupWelcomeTemplateParam;
import chat.qiye.wechat.sdk.api.customer.resp.AddMsgTemplateResp;
import chat.qiye.wechat.sdk.api.customer.resp.GroupMsgListV2Resp;
import chat.qiye.wechat.sdk.api.customer.resp.GroupMsgSentResultGetResp;
import chat.qiye.wechat.sdk.api.customer.resp.GroupMsgTaskGetResp;
import chat.qiye.wechat.sdk.api.customer.resp.GroupWelcomeTemplateAddResp;
import chat.qiye.wechat.sdk.api.customer.resp.GroupWelcomeTemplateGetResp;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import chat.qiye.wechat.sdk.constant.CustomerApiUris;
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
@QiYeWeChatApi(appType = AppIdEnum.APP_CUSTOMER)
public interface CustomerMessageApi {

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

  /**
   * 获取企业群发成员执行结果
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_GET_GROUPMSG_SENT_RESULT)
  GroupMsgSentResultGetResp getGroupMsgSentResult(GroupMsgSentResultGetParam param);

  /**
   * 发送新客户欢迎语
   *
   * 企业微信在向企业推送添加外部联系人事件时，会额外返回一个welcome_code，企业以此为凭据调用接口，即可通过成员向新添加的客户发送个性化的欢迎语。
   * 为了保证用户体验以及避免滥用，企业仅可在收到相关事件后20秒内调用，且只可调用一次。
   * 如果企业已经在管理端为相关成员配置了可用的欢迎语，则推送添加外部联系人事件时不会返回welcome_code。
   * 每次添加新客户时可能有多个企业自建应用/第三方应用收到带有welcome_code的回调事件，但仅有最先调用的可以发送成功。后续调用将返回41051（externaluser has started chatting）错误，请用户根据实际使用需求，合理设置应用可见范围，避免冲突。
   * 旧接口发送新客户欢迎语已经废弃，接口升级后支持发送视频文件，并且最多支持同时发送9个附件
   * 请求方式: POST(HTTP)
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_SEND_WELCOME_MSG)
  RespStatus sendWelcomeMsg(SentWelcomeMsgParam param);

  /**
   * 添加入群欢迎语素材
   *
   * 企业可通过此API向企业的入群欢迎语素材库中添加素材。每个企业的入群欢迎语素材库中，最多容纳100个素材。
   * 请求方式: POST(HTTP)
   *
   * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/externalcontact/group_welcome_template/add?access_token=ACCESS_TOKEN
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_WELCOME_MSG_TPL_ADD)
  GroupWelcomeTemplateAddResp addGroupWelcomeTemplate(GroupWelcomeTemplateParam param);

  /**
   * 编辑入群欢迎语素材
   * 企业可通过此API编辑入群欢迎语素材库中的素材，且仅能够编辑调用方自己创建的入群欢迎语素材。
   *
   * 请求方式: POST(HTTP)
   *
   * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/externalcontact/group_welcome_template/edit?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_WELCOME_MSG_TPL_EDIT)
  RespStatus updateGroupWelcomeTemplate(GroupWelcomeTemplateParam param);

  /**
   * 删除入群欢迎语素材
   * 企业可通过此API删除入群欢迎语素材，且仅能删除调用方自己创建的入群欢迎语素材。
   *
   * 请求方式: POST(HTTP)
   *
   * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/externalcontact/group_welcome_template/del?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_WELCOME_MSG_TPL_DEL)
  RespStatus delGroupWelcomeTemplate(GroupWelcomeTemplateDelParam param);

  /**
   * 获取入群欢迎语素材
   * 企业可通过此API获取入群欢迎语素材。
   *
   * 请求方式: POST(HTTP)
   *
   * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/externalcontact/group_welcome_template/get?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_WELCOME_MSG_TPL_GET)
  GroupWelcomeTemplateGetResp getGroupWelcomeTemplate(GroupWelcomeTemplateGetParam param);

}
