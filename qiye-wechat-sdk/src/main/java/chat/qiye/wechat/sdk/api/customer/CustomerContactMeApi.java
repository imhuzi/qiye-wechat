package chat.qiye.wechat.sdk.api.customer;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.customer.dto.ContactWayDto;
import chat.qiye.wechat.sdk.api.customer.param.CloseTempChatParam;
import chat.qiye.wechat.sdk.api.customer.param.ContactWayConfigIdParam;
import chat.qiye.wechat.sdk.api.customer.resp.ContactWayGetResp;
import chat.qiye.wechat.sdk.api.customer.resp.ContactWaySetResp;
import chat.qiye.wechat.sdk.api.customer.resp.FollowUserListResp;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import chat.qiye.wechat.sdk.constant.CustomerApiUris;
import feign.RequestLine;

/**
 *
 * 企业服务人员管理
 *
 * https://work.weixin.qq.com/api/doc/90000/90135/92570
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/26
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_CUSTOMER)
public interface CustomerContactMeApi {
  /**
   * 获取配置了客户联系功能的成员列表
   *
   * 企业和第三方服务商可通过此接口获取配置了客户联系功能的成员列表。
   *
   * 请求方式：GET（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_follow_user_list?access_token=ACCESS_TOKEN
   *
   * @return {@link FollowUserListResp}
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_FOLLOW_LIST)
  FollowUserListResp getAllFollowUser();

  /**
   * 配置客户联系「联系我」方式
   * 企业可以在管理后台-客户联系-加客户中配置成员的「联系我」的二维码或者小程序按钮，客户通过扫描二维码或点击小程序上的按钮，即可获取成员联系方式，主动联系到成员。
   * 企业可通过此接口为具有客户联系功能的成员生成专属的「联系我」二维码或者「联系我」按钮。
   * 如果配置的是「联系我」按钮，需要开发者的小程序接入小程序插件。
   *
   * 注意:
   * 通过API添加的「联系我」不会在管理端进行展示，每个企业可通过API最多配置50万个「联系我」。
   * 用户需要妥善存储返回的config_id，config_id丢失可能导致用户无法编辑或删除「联系我」。
   * 临时会话模式不占用「联系我」数量，但每日最多添加10万个，并且仅支持单人。
   * 临时会话模式的二维码，添加好友完成后该二维码即刻失效。
   *
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/add_contact_way?access_token=ACCESS_TOKEN
   * @param param {@link ContactWayDto}
   * @return {@link ContactWaySetResp}
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_CONTACT_WAY_SET)
  ContactWaySetResp addContactWay(ContactWayDto param);

  /**
   * 获取企业已配置的「联系我」方式
   * 获取企业配置的「联系我」二维码和「联系我」小程序按钮。
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_contact_way?access_token=ACCESS_TOKEN
   *
   * @param param {@link ContactWayConfigIdParam}
   * @return {@link ContactWayGetResp}
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_CONTACT_WAY_GET)
  ContactWayGetResp getContactWay(ContactWayConfigIdParam param);

  /**
   * 更新企业已配置的「联系我」方式
   * 更新企业配置的「联系我」二维码和「联系我」小程序按钮中的信息，如使用人员和备注等。
   *
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/update_contact_way?access_token=ACCESS_TOKEN
   *
   * @return {@link RespStatus}
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_CONTACT_WAY_UPDATE)
  RespStatus updateContactWay(ContactWayDto param);

  /**
   * 删除企业已配置的「联系我」方式
   * 删除一个已配置的「联系我」二维码或者「联系我」小程序按钮。
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/del_contact_way?access_token=ACCESS_TOKEN
   *
   * @return {@link RespStatus}
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_CONTACT_WAY_DEL)
  RespStatus delContactWay(ContactWayConfigIdParam param);

  /**
   * 结束临时会话
   * 将指定的企业成员和客户之前的临时会话断开，断开前会自动下发已配置的结束语。
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/close_temp_chat?access_token=ACCESS_TOKEN
   *
   * @param  param {@link CloseTempChatParam}
   * @return {@link RespStatus}
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_CLOSE_TEMP_CHAT)
  RespStatus closeTempChat(CloseTempChatParam param);
}
