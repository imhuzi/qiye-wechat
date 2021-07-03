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
public class GroupChatStatByOwnerItemDto {
  /**
   * owner
   */
  @JsonProperty("owner")
  private String owner;

  /**
   * data
   */
  @JsonProperty("data")
  private GroupChatStatDataDto data;
}
