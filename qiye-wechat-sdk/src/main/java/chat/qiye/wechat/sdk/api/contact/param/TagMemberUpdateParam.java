package chat.qiye.wechat.sdk.api.contact.param;

import java.io.Serializable;

import lombok.Data;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/18
 */
@Data
public class TagMemberUpdateParam implements Serializable {
  /**
   * 标签ID
   */
  private Integer tagid;

  /**
   * 企业成员ID列表，注意：userlist、partylist不能同时为空，单次请求个数不超过1000
   */
  private Integer[] userlist;

  /**
   * 企业部门ID列表，注意：userlist、partylist不能同时为空，单次请求个数不超过100
   */
  private Integer[] partylist;
}
