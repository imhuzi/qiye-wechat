package chat.qiye.wechat.sdk.api.school;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.customer.CustomerApi;
import chat.qiye.wechat.sdk.api.school.param.SchoolContactSyncModelSetParam;
import chat.qiye.wechat.sdk.api.school.param.SubscribeModelSetParam;
import chat.qiye.wechat.sdk.api.school.resp.ExternalContactDetailResp;
import chat.qiye.wechat.sdk.api.school.resp.ExternalcontactListResp;
import chat.qiye.wechat.sdk.api.school.resp.SubscribeModelGetResp;
import chat.qiye.wechat.sdk.api.school.resp.SubscribeQrCodeResp;
import chat.qiye.wechat.sdk.common.RespStatus;
import feign.Param;
import feign.RequestLine;

/**
 * 家校 沟通相关 API
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/3
 */
@QiYeWeChatApi
public interface SchoolApi {
  /**
   * 获取「学校通知」二维码
   * 学校可通过此接口获取「学校通知」二维码，家长可通过扫描此二维码关注「学校通知」并接收学校推送的消息。
   *
   * https://work.weixin.qq.com/api/doc/90000/90135/92320
   *
   * @return
   */
  @RequestLine(SchoolApiUris.API_GET_SUBSCRIBE_QR_CODE)
  SubscribeQrCodeResp getSubscribeQrCode();

  /**
   * 设置： 管理「学校通知」的关注模式
   * @param param
   * @return
   */
  @RequestLine(SchoolApiUris.API_SET_SUBSCRIBE_MODEL)
  RespStatus setSubscribeModel(SubscribeModelSetParam param);

  /**
   * 获取 管理「学校通知」的关注模式
   *
   * @return
   */
  @RequestLine(SchoolApiUris.API_GET_SUBSCRIBE_MODEL)
  SubscribeModelGetResp getSubscribeModel();

  /**
   * https://open.work.weixin.qq.com/api/doc/90000/90135/92345
   *
   * 设置家校通讯录自动同步模式
   * 企业和第三方可通过此接口修改家校通讯录与班级标签之间的自动同步模式，注意，一旦设置禁止自动同步，将无法再次开启。
   *
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/set_arch_sync_mode?access_token=ACCESS_TOKEN
   *
   * 请求参数：
   *
   * {
   *    "arch_sync_mode":1,
   * }
   * 参数说明：
   *
   * 参数	必须	说明
   * access_token	是	调用接口凭证
   * arch_sync_mode	是	家校通讯录同步模式：1-禁止将标签同步至家校通讯录，2-禁止将家校通讯录同步至标签，3-禁止家校通讯录和标签相互同步
   *
   * @param param
   * @return
   */
  @RequestLine(SchoolApiUris.API_SET_ARCH_SYNC_MODE)
  RespStatus setArchSyncMode(SchoolContactSyncModelSetParam param);

  /**
   * 获取外部联系人详情
   * {@link CustomerApi } get 方法一样,但是返回 数据字段不一样
   *
   * @return
   */
  @RequestLine(SchoolApiUris.API_EXTERNALCONTACT_GET)
  ExternalContactDetailResp getExternalContactDetail(@Param("external_userid") String externalUserid);

  /**
   * 获取外部联系人列表
   * 学校可通过此接口获取指定成员添加的家长列表。家长是指配置了家校沟通功能的成员所添加的外部联系人。没有配置家校沟通功能的成员，所添加的外部联系人将不会作为家长返回。
   *
   * 请求方式：GET（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/list?access_token=ACCESS_TOKEN&userid=USERID
   *
   * https://work.weixin.qq.com/api/doc/16684
   *
   * 和 {@link CustomerApi } list 方法一样
   *
   * @param userid
   * @return
   */
  @RequestLine(SchoolApiUris.API_EXTERNALCONTACT_LIST)
  ExternalcontactListResp getExternalContactList(@Param("userid") String userid);

}
