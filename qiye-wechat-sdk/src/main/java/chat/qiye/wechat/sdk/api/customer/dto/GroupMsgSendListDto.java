package chat.qiye.wechat.sdk.api.customer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/30
 */
@NoArgsConstructor
@Data
public class GroupMsgSendListDto {
  /**
   * externalUserid
   */
  @JsonProperty("external_userid")
  private String externalUserid;

  /**
   * chatId
   */
  @JsonProperty("chat_id")
  private String chatId;

  /**
   * userid
   */
  @JsonProperty("userid")
  private String userid;

  /**
   * status
   */
  @JsonProperty("status")
  private Integer status;

  /**
   * sendTime
   */
  @JsonProperty("send_time")
  private Integer sendTime;
}
