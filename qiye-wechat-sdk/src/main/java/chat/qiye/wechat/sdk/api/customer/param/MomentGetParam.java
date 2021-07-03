package chat.qiye.wechat.sdk.api.customer.param;

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
public class MomentGetParam {

  /**
   * momentId
   */
  @JsonProperty("moment_id")
  private String momentId;

  /**
   * cursor
   */
  @JsonProperty("cursor")
  private String cursor;

  /**
   * limit
   */
  @JsonProperty("limit")
  private Integer limit;
}
