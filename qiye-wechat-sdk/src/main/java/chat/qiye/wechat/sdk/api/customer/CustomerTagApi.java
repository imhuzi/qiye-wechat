package chat.qiye.wechat.sdk.api.customer;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.customer.param.CustomerTagAddParam;
import chat.qiye.wechat.sdk.api.customer.param.CustomerTagDelParam;
import chat.qiye.wechat.sdk.api.customer.param.CustomerTagEditParam;
import chat.qiye.wechat.sdk.api.customer.param.CustomerTagGetParam;
import chat.qiye.wechat.sdk.api.customer.param.CustomerTagMarkParam;
import chat.qiye.wechat.sdk.api.customer.resp.CustomerTagGetResp;
import chat.qiye.wechat.sdk.api.customer.resp.CustomerTagListResp;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import chat.qiye.wechat.sdk.constant.CustomerApiUris;
import feign.RequestLine;

/**
 *
 * 管理企业标签
 *
 * https://work.weixin.qq.com/api/doc/90000/90135/92116
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/26
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_CUSTOMER)
public interface CustomerTagApi {
  /**
   * 获取企业标签库
   * 企业可通过此接口获取企业客户标签详情。
   *
   * 请求方式: POST(HTTP)
   *
   * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_corp_tag_list?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_TAG_LIST)
  CustomerTagListResp getAllList(CustomerTagGetParam param);

  /**
   * 添加企业客户标签
   * 企业可通过此接口向客户标签库中添加新的标签组和标签，每个企业最多可配置3000个企业标签。
   *
   * 请求方式: POST(HTTP)
   *
   * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/externalcontact/add_corp_tag?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_TAG_ADD)
  CustomerTagGetResp addTag(CustomerTagAddParam param);

  /**
   * 编辑企业客户标签
   * 企业可通过此接口编辑客户标签/标签组的名称或次序值。
   *
   * 请求方式: POST(HTTP)
   *
   * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/externalcontact/edit_corp_tag?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_TAG_EDIT)
  RespStatus editTag(CustomerTagEditParam param);

  /**
   * 删除企业客户标签
   * 企业可通过此接口删除客户标签库中的标签，或删除整个标签组。
   *
   * 请求方式: POST(HTTP)
   *
   * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/externalcontact/del_corp_tag?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_TAG_DEL)
  RespStatus delTag(CustomerTagDelParam param);

  /**
   * 编辑客户企业标签
   * 调试工具
   * 企业可通过此接口为指定成员的客户添加上由企业统一配置的标签。
   *
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/externalcontact/mark_tag?access_token=ACCESS_TOKEN
   *
   * @param param
   * @return
   */
  @RequestLine(CustomerApiUris.API_CUSTOMER_TAG_MARK)
  RespStatus markTag(CustomerTagMarkParam param);



}
