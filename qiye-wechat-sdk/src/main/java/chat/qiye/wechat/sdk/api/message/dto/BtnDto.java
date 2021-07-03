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
public class BtnDto {
  /**
   * key
   */
  @JsonProperty("key")
  private String key;

  /**
   * name
   */
  @JsonProperty("name")
  private String name;

  /**
   * color
   */
  @JsonProperty("color")
  private String color;

  /**
   * isBold
   */
  @JsonProperty("is_bold")
  private Boolean isBold;
}
