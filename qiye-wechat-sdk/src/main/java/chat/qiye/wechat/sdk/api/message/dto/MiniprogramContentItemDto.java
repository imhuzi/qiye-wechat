package chat.qiye.wechat.sdk.api.message.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/1
 */
@NoArgsConstructor
@Data
public class MiniprogramContentItemDto {
  /**
   * key
   */
  @JsonProperty("key")
  private String key;

  /**
   * value
   */
  @JsonProperty("value")
  private String value;
}
