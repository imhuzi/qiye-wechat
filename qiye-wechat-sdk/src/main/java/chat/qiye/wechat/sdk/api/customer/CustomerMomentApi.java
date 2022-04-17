package chat.qiye.wechat.sdk.api.customer;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.customer.param.MomentCommentGetParam;
import chat.qiye.wechat.sdk.api.customer.param.MomentGetParam;
import chat.qiye.wechat.sdk.api.customer.param.MomentListParam;
import chat.qiye.wechat.sdk.api.customer.resp.MomentCommentsResp;
import chat.qiye.wechat.sdk.api.customer.resp.MomentListResp;
import chat.qiye.wechat.sdk.api.customer.resp.MomentTaskStatusResp;
import chat.qiye.wechat.sdk.api.customer.resp.MomentViewCustomerResp;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import chat.qiye.wechat.sdk.constant.CustomerApiUris;
import feign.RequestLine;

/**
 *
 * 客户朋友圈
 *
 * https://work.weixin.qq.com/api/doc/90000/90135/93332
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/26
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_CUSTOMER)
public interface CustomerMomentApi {

  /**
   * 获取企业全部的发表列表
   * 企业和第三方应用可通过该接口获取企业全部的发表内容。
   *
   * 请求方式：POST(HTTPS)
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_moment_list?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_MOMENT_LIST)
  MomentListResp getAllList(MomentListParam param);

  /**
   * 获取客户朋友圈企业发表的列表
   *
   * 企业和第三方应用可通过该接口获取企业发表的朋友圈成员执行情况
   *
   * 请求方式：POST(HTTPS)
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_moment_task?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_MOMENT_TASK_STATUS)
  MomentTaskStatusResp getSendTaskStatus(MomentGetParam param);

  /**
   * 获取客户朋友圈发表时选择的可见范围
   *
   * 企业和第三方应用可通过该接口获取客户朋友圈创建时，选择的客户可见范围
   * 请求方式：POST(HTTPS)
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_moment_customer_list?access_token=ACCESS_TOKEN
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_MOMENT_VIEW_LIST)
  MomentViewCustomerResp getViewRange(MomentGetParam param);

  /**
   * 获取客户朋友圈发表后的可见客户列表
   *
   * 企业和第三方应用可通过该接口获取客户朋友圈发表后，可在微信朋友圈中查看的客户列表
   *
   * 请求方式：POST(HTTPS)
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_moment_send_result?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_MOMENT_SEND_RESULT)
  MomentViewCustomerResp getSendAfterViewRange(MomentGetParam param);

  /**
   * 获取客户朋友圈的互动数据
   * 企业和第三方应用可通过此接口获取客户朋友圈的互动数据。
   *
   * 请求方式：POST(HTTPS)
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_moment_comments?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_MOMENT_COMMENTS)
  MomentCommentsResp getComments(MomentCommentGetParam param);


}
