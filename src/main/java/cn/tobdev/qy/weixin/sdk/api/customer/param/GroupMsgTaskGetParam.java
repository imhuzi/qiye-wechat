package cn.tobdev.qy.weixin.sdk.api.customer.param;

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
public class GroupMsgTaskGetParam {

  /**
   * msgid
   */
  @JsonProperty("msgid")
  private String msgid;

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
