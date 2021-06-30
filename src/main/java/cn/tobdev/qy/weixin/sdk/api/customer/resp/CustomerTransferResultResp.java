package cn.tobdev.qy.weixin.sdk.api.customer.resp;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.common.RespStatus;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/30
 */
@Getter
@Setter
@ToString
public class CustomerTransferResultResp   extends RespStatus implements Serializable {

  /**
   * customer
   */
  @JsonProperty("customer")
  private List<CustomerDto> customer;

  /**
   * nextCursor
   */
  @JsonProperty("next_cursor")
  private String nextCursor;


  @NoArgsConstructor
  @Data
  public static class CustomerDto {
    /**
     * externalUserid
     */
    @JsonProperty("external_userid")
    private String externalUserid;

    /**
     * status
     */
    @JsonProperty("status")
    private Integer status;

    /**
     * takeoverTime
     */
    @JsonProperty("takeover_time")
    private Integer takeoverTime;
  }

}
