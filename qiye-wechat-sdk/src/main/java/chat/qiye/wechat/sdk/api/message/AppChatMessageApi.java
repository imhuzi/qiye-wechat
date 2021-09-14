package chat.qiye.wechat.sdk.api.message;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.message.dto.MessageDto;
import chat.qiye.wechat.sdk.api.message.param.AppChatCreateParam;
import chat.qiye.wechat.sdk.api.message.param.AppChatUpdateParam;
import chat.qiye.wechat.sdk.api.message.resp.AppChatCreateResp;
import chat.qiye.wechat.sdk.api.message.resp.AppChatGetResp;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.MessageApiUris;
import feign.Param;
import feign.RequestLine;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/1
 */
@QiYeWeChatApi
public interface AppChatMessageApi {
  /**
   * 创建群聊会话
   *
   * 请求方式： POST（HTTPS）
   * 请求地址： https://qyapi.weixin.qq.com/cgi-bin/appchat/create?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(MessageApiUris.API_APP_CHAT_CREATE)
  AppChatCreateResp create(AppChatCreateParam param);

  /**
   * 修改群聊会话
   *
   * 请求方式： POST（HTTPS）
   * 请求地址： https://qyapi.weixin.qq.com/cgi-bin/appchat/update?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(MessageApiUris.API_APP_CHAT_UPDATE)
  RespStatus update(AppChatUpdateParam param);

  /**
   * 获取群聊会话
   *
   * 请求方式： GET（HTTPS）
   * 请求地址： https://qyapi.weixin.qq.com/cgi-bin/appchat/get?access_token=ACCESS_TOKEN&chatid=CHATID
   *
   * @param chatid
   * @return
   */
  @RequestLine(MessageApiUris.API_APP_CHAT_GET)
  AppChatGetResp get(@Param("chatid") String chatid);

  /**
   * 应用推送消息
   * 应用支持推送文本、图片、视频、文件、图文等类型。
   *
   * 请求方式： POST（HTTPS）
   * 请求地址： https://qyapi.weixin.qq.com/cgi-bin/appchat/send?access_token=ACCESS_TOKEN
   *
   * 请求包体:
   *
   * 各个消息类型的具体POST格式参考后面消息类型说明
   *
   * @param param
   * @return
   */
  @RequestLine(MessageApiUris.API_APP_CHAT_SEND_MESSAGE)
  AppChatCreateResp sentMessage(MessageDto param);



}
