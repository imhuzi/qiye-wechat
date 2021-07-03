package chat.qiye.wechat.sdk.common.dto;

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
public class LocationDto {
  /**
   * latitude
   */
  @JsonProperty("latitude")
  private String latitude;

  /**
   * longitude
   */
  @JsonProperty("longitude")
  private String longitude;

  /**
   * name
   */
  @JsonProperty("name")
  private String name;
}
