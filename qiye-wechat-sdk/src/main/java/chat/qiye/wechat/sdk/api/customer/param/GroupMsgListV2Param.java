package chat.qiye.wechat.sdk.api.customer.param;

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
public class GroupMsgListV2Param {
  /**
   * chatType
   */
  @JsonProperty("chat_type")
  private String chatType;

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
   * limit
   */
  @JsonProperty("limit")
  private Integer limit;

  /**
   * cursor
   */
  @JsonProperty("cursor")
  private String cursor;
}
