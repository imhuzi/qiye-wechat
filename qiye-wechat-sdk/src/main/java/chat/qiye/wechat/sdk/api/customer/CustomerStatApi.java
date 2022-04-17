package chat.qiye.wechat.sdk.api.customer;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.customer.param.GroupChatStatParam;
import chat.qiye.wechat.sdk.api.customer.param.UserBehaviorDataGetParam;
import chat.qiye.wechat.sdk.api.customer.resp.GroupChatStatByDayResp;
import chat.qiye.wechat.sdk.api.customer.resp.GroupChatStatByOwnerResp;
import chat.qiye.wechat.sdk.api.customer.resp.UserBehaviorDataGetResp;
import chat.qiye.wechat.sdk.constant.CustomerApiUris;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import feign.RequestLine;

/**
 *  客户管理 统计管理
 *
 *  https://work.weixin.qq.com/api/doc/90000/90135/92131
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/26
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_CUSTOMER)
public interface CustomerStatApi {
  /**
   * 获取「联系客户统计」数据
   *
   * 企业可通过此接口获取成员联系客户的数据，包括发起申请数、新增客户数、聊天数、发送消息数和删除/拉黑成员的客户数等指标。
   *
   * 请求方式: POST(HTTP)
   *
   * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_user_behavior_data?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_BEHAVIOR_DATA)
  UserBehaviorDataGetResp getUserBehaviorData(UserBehaviorDataGetParam param);

  /**
   * 按群主聚合的方式
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_GROUP_CHAT_STAT)
  GroupChatStatByOwnerResp getGroupChatStatByOwner(GroupChatStatParam param);

  /**
   * 按自然日聚合的方式
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_GROUP_CHAT_STAT_BY_DAY)
  GroupChatStatByDayResp getGroupChatStatByDay(GroupChatStatParam param);
}
