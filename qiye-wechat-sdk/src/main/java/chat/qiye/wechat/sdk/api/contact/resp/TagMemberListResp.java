package chat.qiye.wechat.sdk.api.contact.resp;

import java.io.Serializable;
import java.util.List;

import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/18
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TagMemberListResp extends RespStatus implements Serializable {
  private String tagname;
  private List<MemberItem> userlist;
  private List<Integer> partylist;

  @Data
  static class MemberItem {
    private String userid;
    private String name;
  }
}
