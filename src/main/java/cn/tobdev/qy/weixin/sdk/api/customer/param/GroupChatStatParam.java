package cn.tobdev.qy.weixin.sdk.api.customer.param;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.api.customer.dto.OwnerFilterDto;
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
public class GroupChatStatParam {

  /**
   * dayBeginTime
   */
  @JsonProperty("day_begin_time")
  private Integer dayBeginTime;

  /**
   * dayEndTime
   */
  @JsonProperty("day_end_time")
  private Integer dayEndTime;

  /**
   * ownerFilter
   */
  @JsonProperty("owner_filter")
  private OwnerFilterDto ownerFilter;

  /**
   * orderBy
   */
  @JsonProperty("order_by")
  private Integer orderBy;

  /**
   * orderAsc
   */
  @JsonProperty("order_asc")
  private Integer orderAsc;

  /**
   * offset
   */
  @JsonProperty("offset")
  private Integer offset;

  /**
   * limit
   */
  @JsonProperty("limit")
  private Integer limit;
}
