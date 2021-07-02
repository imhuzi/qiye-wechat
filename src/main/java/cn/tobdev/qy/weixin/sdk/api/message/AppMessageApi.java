package cn.tobdev.qy.weixin.sdk.api.message;

import cn.tobdev.qy.weixin.sdk.api.BaseApi;
import cn.tobdev.qy.weixin.sdk.api.message.dto.app.AppMessageDto;
import cn.tobdev.qy.weixin.sdk.api.message.dto.linkedcorp.LinkedCorpMessageDto;
import cn.tobdev.qy.weixin.sdk.api.message.param.AppTaskCardMessageUpdateParm;
import cn.tobdev.qy.weixin.sdk.api.message.param.MessageStatGetParam;
import cn.tobdev.qy.weixin.sdk.api.message.resp.AppMessageSendResp;
import cn.tobdev.qy.weixin.sdk.api.message.resp.AppTaskCardMessageUpdateResp;
import cn.tobdev.qy.weixin.sdk.api.message.resp.LinkedCorpMessageSendResp;
import cn.tobdev.qy.weixin.sdk.api.message.resp.MessageStatGetResp;
import cn.tobdev.qy.weixin.sdk.constant.MessageApiUris;
import feign.RequestLine;

/**
 * 应用 消息
 * https://work.weixin.qq.com/api/doc/90000/90135/90236
 * 互联企业 发送应用消息
 *
 * https://work.weixin.qq.com/api/doc/90000/90135/90250
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/1
 */
public interface AppMessageApi  extends BaseApi {
  /**
   * 发送应用消息
   * 应用支持推送文本、图片、视频、文件、图文等类型。
   *
   * 请求方式：POST（HTTPS）
   * 请求地址： https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token=ACCESS_TOKEN
   *
   * 参数说明：
   *
   * 参数	是否必须	说明
   * access_token	是	调用接口凭证
   * 各个消息类型的具体POST格式请阅后续“消息类型”部分。
   * 如果有在管理端对应用设置“在微工作台中始终进入主页”，应用在微信端只能接收到文本消息，并且文本消息的长度限制为20字节，超过20字节会被截断。同时其他消息类型也会转换为文本消息，提示用户到企业微信查看。
   * 支持id转译，将userid/部门id转成对应的用户名/部门名，目前仅文本/文本卡片/图文/图文（mpnews）这四种消息类型的部分字段支持。仅第三方应用需要用到，企业自建应用可以忽略。具体支持的范围和语法，请查看附录id转译说明。
   * 支持重复消息检查，当指定 "enable_duplicate_check": 1开启: 表示在一定时间间隔内，同样内容（请求json）的消息，不会重复收到；时间间隔可通过duplicate_check_interval指定，默认1800秒。
   * 从2021年2月4日开始，企业关联添加的「小程序」应用，也可以发送文本、图片、视频、文件、图文等各种类型的消息了。
   * 调用建议：大部分企业应用在每小时的0分或30分触发推送消息，容易造成资源挤占，从而投递不够及时，建议尽量避开这两个时间点进行调用。
   * 返回示例：
   *
   *  {
   *    "errcode" : 0,
   *    "errmsg" : "ok",
   *    "invaliduser" : "userid1|userid2",
   *    "invalidparty" : "partyid1|partyid2",
   *    "invalidtag": "tagid1|tagid2"
   *  }
   * 如果部分接收人无权限或不存在，发送仍然执行，但会返回无效的部分（即invaliduser或invalidparty或invalidtag），常见的原因是接收人不在应用的可见范围内。
   * 如果全部接收人无权限或不存在，则本次调用返回失败，errcode为81013。
   * 返回包中的userid，不区分大小写，统一转为小写
   *
   * @param param
   * @return
   */
  @RequestLine(MessageApiUris.API_APP_SEND_MESSAGE)
  AppMessageSendResp sentMessage(AppMessageDto param);

  /**
   * 发送互联企业消息
   *
   * 互联企业是企业微信提供的满足集团与子公司、企业与上下游供应商进行连接的功能，企业可以共享通讯录以及应用给互联企业，如需要，你可以前往管理后台-通讯录创建互联企业，之后你可以在自建应用的可见范围设置互联企业的通讯录；此接口主要满足开发者给互联企业成员推送消息的诉求。
   *
   * @param param
   * @return
   */
  @RequestLine(MessageApiUris.API_LINKEDCORP_SEND_MESSAGE)
  LinkedCorpMessageSendResp sentLinkedCorpMessage(LinkedCorpMessageDto param);

  /**
   * 查询应用消息发送统计
   *
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/message/get_statistics?access_token=ACCESS_TOKEN
   *
   * 请求示例：
   *
   * {
   *    "time_type": 0
   * }
   * 参数说明：
   *
   * 参数	必须	说明
   * access_token	是	调用接口凭证
   * time_type	否	查询哪天的数据，0：当天；1：昨天。默认为0。
   *
   * @param param
   * @return
   */
  @RequestLine(MessageApiUris.API_GET_SEND_STAT)
  MessageStatGetResp getSendStat(MessageStatGetParam param);

  /**
   * 更新任务卡片消息状态
   *
   * 应用可以发送任务卡片消息，发送之后可再通过接口更新用户任务卡片消息的替换文案信息。
   *
   * 请求方式：POST（HTTPS）
   * 请求地址： https://qyapi.weixin.qq.com/cgi-bin/message/update_taskcard?access_token=ACCESS_TOKEN
   *
   * 参数说明：
   *
   * 参数	是否必须	说明
   * access_token	是	调用接口凭证
   *
   * @param param
   * @return
   */
  @RequestLine(MessageApiUris.API_GET_SEND_STAT)
  AppTaskCardMessageUpdateResp getSendStat(AppTaskCardMessageUpdateParm param);


}
