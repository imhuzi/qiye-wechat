package chat.qiye.wechat.sdk.api.app;


import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.BaseApiUris;
import chat.qiye.wechat.sdk.api.BaseApi;
import chat.qiye.wechat.sdk.api.app.resp.AppInfoResp;
import feign.Param;
import feign.RequestLine;

/**
 * 应用管理
 *
 * https://work.weixin.qq.com/api/doc/90000/90135/90226
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/6
 */
public interface AppManageApi extends BaseApi {

  @RequestLine(BaseApiUris.API_AGENT_GET)
  AppInfoResp get(@Param Integer agentid);

  RespStatus set();

}
