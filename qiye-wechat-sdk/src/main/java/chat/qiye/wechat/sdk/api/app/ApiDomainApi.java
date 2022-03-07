package chat.qiye.wechat.sdk.api.app;


import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.app.resp.GetDomainIpResp;
import chat.qiye.wechat.sdk.constant.BaseApiUris;
import feign.RequestLine;

/**
 * 获取企业微信API域名IP段
 * <p>
 * https://developer.work.weixin.qq.com/document/path/92520
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2022/3/7
 */
@QiYeWeChatApi
public interface ApiDomainApi {
    /**
     * API域名IP即qyapi.weixin.qq.com的解析地址，由开发者调用企业微信端的接入IP。如果企业需要做防火墙配置，那么可以通过这个接口获取到所有相关的IP段。IP段有变更可能，当IP段变更时，新旧IP段会同时保留一段时间。建议企业每天定时拉取IP段，更新防火墙设置，避免因IP段变更导致网络不通。
     * <p>
     * 请求方式：GET（HTTPS）
     * 请求地址： https://qyapi.weixin.qq.com/cgi-bin/get_api_domain_ip?access_token=ACCESS_TOKEN （获取ACCESS_TOKEN）
     * <p>
     * 请求参数说明：
     * <p>
     * 参数	必须	说明
     * access_token	是	调用接口凭证
     *
     * @return
     */
    @RequestLine(BaseApiUris.API_GET_DOMAIN_IP)
    GetDomainIpResp getDomainIP();

}
