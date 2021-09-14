package chat.qiye.wechat.sdk.api.message;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.message.dto.school.SchoolMessageDto;
import chat.qiye.wechat.sdk.api.message.resp.SchoolMessageSendResp;
import chat.qiye.wechat.sdk.constant.MessageApiUris;
import feign.RequestLine;

/**
 * 家校消息推送
 *
 * https://work.weixin.qq.com/api/doc/90000/90135/91609
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/1
 */
@QiYeWeChatApi
public interface SchoolMessageApi {
  /**
   * 发送「学校通知」
   *
   * 学校可以通过此接口来给家长发送不同类型的学校通知，来满足多种场景下的学校通知需求。目前支持的消息类型为文本、图片、语音、视频、文件、图文。
   *
   * 接口定义
   * 请求方式：POST（HTTPS）
   * 请求地址： https://qyapi.weixin.qq.com/cgi-bin/externalcontact/message/send?access_token=ACCESS_TOKEN
   *
   * 参数说明：
   *
   * 参数	是否必须	说明
   * access_token	是	调用接口凭证
   * 各个消息类型的具体POST格式参考以下文档。
   * 支持id转译，将userid/部门id转成对应的企业通讯录内部的用户名/部门名，目前仅文本/图文/图文（mpnews）/小程序消息这四种消息类型的部分字段支持。具体支持的范围和语法，请查看附录id转译说明。
   * 支持重复消息检查，当指定 "enable_duplicate_check": 1开启: 表示在一定时间间隔内，同样内容（请求json）的消息，不会重复收到；时间间隔可通过duplicate_check_interval指定，默认1800秒。
   *
   * 权限说明：
   *
   * 学校管理员需要将应用配置在「家长可使用的应用」才可调用
   * 返回示例：
   *
   *  {
   *    "errcode" : 0,
   *    "errmsg" : "ok",
   *    "invalid_external_user" : ["external_userid1"],
   *    "invalid_parent_userid" : ["parent_userid1"],
   *    "invalid_student_userid" : ["student_userid1"],
   *    "invalid_party" : ["party1"]
   *  }
   * 如果部分接收人无权限或不存在，发送仍然执行，但会返回无效的部分（inavlid_external_user/invalid_parent_userid/invalid_student_userid/invalid_party）。
   *
   * @param param
   * @return
   */
  @RequestLine(MessageApiUris.API_SCHOOL_SEND_MESSAGE)
  SchoolMessageSendResp sentMessage(SchoolMessageDto param);

}
