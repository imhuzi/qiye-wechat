package chat.qiye.wechat.sdk.api.customer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/29
 */
@NoArgsConstructor
@Data
public class GroupChatStatDataDto {
  /**
   * newChatCnt
   */
  @JsonProperty("new_chat_cnt")
  private Integer newChatCnt;

  /**
   * chatTotal
   */
  @JsonProperty("chat_total")
  private Integer chatTotal;

  /**
   * chatHasMsg
   */
  @JsonProperty("chat_has_msg")
  private Integer chatHasMsg;

  /**
   * newMemberCnt
   */
  @JsonProperty("new_member_cnt")
  private Integer newMemberCnt;

  /**
   * memberTotal
   */
  @JsonProperty("member_total")
  private Integer memberTotal;

  /**
   * memberHasMsg
   */
  @JsonProperty("member_has_msg")
  private Integer memberHasMsg;

  /**
   * msgTotal
   */
  @JsonProperty("msg_total")
  private Integer msgTotal;
}
