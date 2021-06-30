package cn.tobdev.qy.weixin.sdk.api.message;

import cn.tobdev.qy.weixin.sdk.api.BaseApi;
import cn.tobdev.qy.weixin.sdk.api.message.param.AppChatCreateParam;
import cn.tobdev.qy.weixin.sdk.api.message.param.AppChatUpdateParam;
import cn.tobdev.qy.weixin.sdk.api.message.dto.MessageDto;
import cn.tobdev.qy.weixin.sdk.api.message.resp.AppChatCreateResp;
import cn.tobdev.qy.weixin.sdk.api.message.resp.AppChatGetResp;
import cn.tobdev.qy.weixin.sdk.common.RespStatus;
import cn.tobdev.qy.weixin.sdk.constant.MessageApiUris;
import feign.Param;
import feign.RequestLine;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/1
 */
public interface AppChatMessageApi extends BaseApi {
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

  @RequestLine(MessageApiUris.API_APP_CHAT_UPDATE)
  RespStatus update(AppChatUpdateParam param);

  @RequestLine(MessageApiUris.API_APP_CHAT_GET)
  AppChatGetResp get(@Param("chatid") String chatid);

  @RequestLine(MessageApiUris.API_APP_CHAT_SEND_MESSAGE)
  AppChatCreateResp sentMessage(MessageDto param);



}
