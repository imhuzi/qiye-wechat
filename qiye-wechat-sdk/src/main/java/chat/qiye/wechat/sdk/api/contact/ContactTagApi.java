package chat.qiye.wechat.sdk.api.contact;


import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.contact.param.TagMemberUpdateParam;
import chat.qiye.wechat.sdk.api.contact.resp.TagCreateResp;
import chat.qiye.wechat.sdk.api.contact.resp.TagListResp;
import chat.qiye.wechat.sdk.api.contact.resp.TagMemberListResp;
import chat.qiye.wechat.sdk.api.contact.vo.TagVo;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import chat.qiye.wechat.sdk.constant.BaseApiUris;
import feign.Param;
import feign.RequestLine;

/**
 * 通讯录 标签 相关接口
 *
 * https://work.weixin.qq.com/api/doc/90000/90135/90209
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/3
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_CONTACT)
public interface ContactTagApi {

  /**
   * 获取 标签列表
   *
   * @return {@link TagListResp}
   */
  @RequestLine(BaseApiUris.API_TAG_LIST)
  TagListResp list();

  /**
   * 创建标签
   *
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/tag/create?access_token=ACCESS_TOKEN
   *
   * 请求包体：
   *
   * {
   *    "tagname": "UI",
   *    "tagid": 12
   * }
   * 参数说明：
   *
   * 参数	必须	说明
   * access_token	是	调用接口凭证
   * tagname	是	标签名称，长度限制为32个字以内（汉字或英文字母），标签名不可与其他标签重名。
   * tagid	否	标签id，非负整型，指定此参数时新增的标签会生成对应的标签id，不指定时则以目前最大的id自增。
   *
   * @param tag 标签参数
   * @return {@link TagCreateResp}
   */
  @RequestLine(BaseApiUris.API_TAG_CREATE)
  TagCreateResp create(TagVo tag);

  /**
   * 更新标签名字
   *
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/tag/update?access_token=ACCESS_TOKEN
   *
   * 请求包体：
   *
   * {
   *    "tagid": 12,
   *    "tagname": "UI design"
   * }
   * 参数说明：
   *
   * 参数	必须	说明
   * access_token	是	调用接口凭证
   * tagid	是	标签ID
   * tagname	是	标签名称，长度限制为32个字（汉字或英文字母），标签不可与其他标签重名。
   *
   * @param tag
   * @return
   */
  @RequestLine(BaseApiUris.API_TAG_UPDATE)
  RespStatus update(TagVo tag);

  @RequestLine(BaseApiUris.API_TAG_DELETE)
  RespStatus delete(@Param("tagid") Integer tagid);

  @RequestLine(BaseApiUris.API_TAG_GET)
  TagMemberListResp getMemberList(@Param("tagid") Integer tagid);

  @RequestLine(BaseApiUris.API_TAG_DELTAGUSERS)
  RespStatus deleteMembers(TagMemberUpdateParam param);

  @RequestLine(BaseApiUris.API_TAG_ADDTAGUSERS)
  RespStatus addMembers(TagMemberUpdateParam param);
}
