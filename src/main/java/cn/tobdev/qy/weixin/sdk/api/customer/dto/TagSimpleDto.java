package cn.tobdev.qy.weixin.sdk.api.customer.dto;

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
public class TagSimpleDto {


  /**
   * name
   */
  @JsonProperty("name")
  private String name;

  /**
   * order
   */
  @JsonProperty("order")
  private Integer order;
;
}
