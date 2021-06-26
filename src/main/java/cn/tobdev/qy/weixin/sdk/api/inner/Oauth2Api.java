package cn.tobdev.qy.weixin.sdk.api.inner;


import cn.tobdev.qy.weixin.sdk.api.BaseApi;
import cn.tobdev.qy.weixin.sdk.api.inner.resp.Oauth2UserInfoResp;
import cn.tobdev.qy.weixin.sdk.constant.BaseApiUris;
import feign.Param;
import feign.RequestLine;

public interface Oauth2Api extends BaseApi {

  String OAUTH2_URL = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=%s&redirect_uri=%s&response_type=code&scope=snsapi_base&state=STATE#wechat_redirect";
  String OAUTH2_QR_URL = "https://open.work.weixin.qq.com/wwopen/sso/qrConnect?appid=%s&agentid=%s&redirect_uri=%s&state=STATE";

  /**
   * Oauth 获取访问用户身份
   *
   * @param code 授权code
   * @return {@link Oauth2UserInfoResp}
   */
  @RequestLine(BaseApiUris.API_OAUTH2_USER_INFO)
  Oauth2UserInfoResp getUserInfo(@Param("code") String code);

  /**
   * 获取 Oauth2 url， 普通应用和家校应用
   *
   * @param corpId 企业id
   * @param  redirectUri 重定向 uri
   * @return 跳转到企业微信的 url
   */
  default String getOauth2Url(String corpId, String redirectUri) {
    return String.format(OAUTH2_URL, corpId, redirectUri);
  }

  /**
   * 获取 二维码扫描链接
   *
   * @param agentId 应用agentId
   * @param corpId 企业id
   * @param redirectUri 重定向uri
   * @return 跳转到企业微信的 url
   */
  default String getQrConnect2Url(Integer agentId, String corpId, String redirectUri) {
    return String.format(OAUTH2_QR_URL, corpId, agentId, redirectUri);
  }
}
