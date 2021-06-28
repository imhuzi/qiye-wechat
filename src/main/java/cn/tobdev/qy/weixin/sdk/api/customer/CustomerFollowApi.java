package cn.tobdev.qy.weixin.sdk.api.customer;

import cn.tobdev.qy.weixin.sdk.api.BaseApi;
import cn.tobdev.qy.weixin.sdk.api.customer.param.CustomerGroupListParam;
import cn.tobdev.qy.weixin.sdk.api.customer.resp.CustomerGroupListResp;
import cn.tobdev.qy.weixin.sdk.api.customer.resp.FollowUserListResp;
import cn.tobdev.qy.weixin.sdk.constant.CustomerApiUris;
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
public interface CustomerFollowApi extends BaseApi {
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
  FollowUserListResp list();


  @RequestLine(CustomerApiUris.API_CUSTOMER_FOLLOW_LIST)
  FollowUserListResp addContactWay();

  @RequestLine(CustomerApiUris.API_CUSTOMER_FOLLOW_LIST)
  FollowUserListResp getContactWay();

  @RequestLine(CustomerApiUris.API_CUSTOMER_FOLLOW_LIST)
  FollowUserListResp updateContactWay();

  @RequestLine(CustomerApiUris.API_CUSTOMER_FOLLOW_LIST)
  FollowUserListResp delContactWay();

  @RequestLine(CustomerApiUris.API_CUSTOMER_FOLLOW_LIST)
  FollowUserListResp closeTempChat();


}
