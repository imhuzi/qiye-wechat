package chat.qiye.wechat.sdk.api.contact.resp;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/5
 */
@Getter
@Setter
@ToString
public class AuthMemberListResp  extends RespStatus implements Serializable {
  /**
   * 当前数据最后一个key值，如果下次调用带上该值则从该key值往后拉，用于实现分页拉取，返回空字符串代表已经是最后一页
   */
  @JsonProperty("next_cursor")
  private String nextCursor;

  /**
   * 成员授权列表
   */
  @JsonProperty("member_auth_list")
  private List<AuthMemberItem> memberAuthList;


  @Data
  static class AuthMemberItem {
    /**
     * 当用户为某个企业内部成员时返回。全局唯一，对于同一个服务商不同的应用open_userid是相同的；同一用户，对于不同服务商open_userid是不同的
     */
    @JsonProperty("open_userid")
    private String openUserid;
  }
}
