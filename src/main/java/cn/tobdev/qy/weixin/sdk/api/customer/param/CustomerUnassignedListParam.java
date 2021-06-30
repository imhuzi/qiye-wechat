package cn.tobdev.qy.weixin.sdk.api.customer.param;

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
public class CustomerUnassignedListParam {

  /**
   * pageId
   */
  @JsonProperty("page_id")
  private Integer pageId;

  /**
   * cursor
   */
  @JsonProperty("cursor")
  private String cursor;

  /**
   * pageSize
   */
  @JsonProperty("page_size")
  private Integer pageSize;
}
