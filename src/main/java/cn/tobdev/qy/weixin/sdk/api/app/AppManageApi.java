package cn.tobdev.qy.weixin.sdk.api.app;


import cn.tobdev.qy.weixin.sdk.api.BaseApi;
import cn.tobdev.qy.weixin.sdk.api.app.resp.AppInfoResp;
import cn.tobdev.qy.weixin.sdk.common.RespStatus;
import cn.tobdev.qy.weixin.sdk.constant.ApiUri;
import feign.Param;
import feign.RequestLine;

/**
 * 应用管理
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/6
 */
public interface AppManageApi extends BaseApi {

  @RequestLine(ApiUri.API_AGENT_GET)
  AppInfoResp get(@Param Integer agentid);

  RespStatus set();
}
