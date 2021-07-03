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
public class MomentListParam {

  /**
   * startTime
   */
  @JsonProperty("start_time")
  private Integer startTime;

  /**
   * endTime
   */
  @JsonProperty("end_time")
  private Integer endTime;

  /**
   * creator
   */
  @JsonProperty("creator")
  private String creator;

  /**
   * filterType
   */
  @JsonProperty("filter_type")
  private Integer filterType;

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
