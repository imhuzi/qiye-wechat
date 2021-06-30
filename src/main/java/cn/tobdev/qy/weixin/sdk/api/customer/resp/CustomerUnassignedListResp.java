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
 * @date  : 2021/7/1
 */
@Getter
@Setter
@ToString
public class CustomerUnassignedListResp  extends RespStatus implements Serializable {

  /**
   * info
   */
  @JsonProperty("info")
  private List<InfoDto> info;

  /**
   * isLast
   */
  @JsonProperty("is_last")
  private Boolean isLast;

  /**
   * nextCursor
   */
  @JsonProperty("next_cursor")
  private String nextCursor;

  @NoArgsConstructor
  @Data
  public static class InfoDto {
    /**
     * handoverUserid
     */
    @JsonProperty("handover_userid")
    private String handoverUserid;

    /**
     * externalUserid
     */
    @JsonProperty("external_userid")
    private String externalUserid;

    /**
     * dimissionTime
     */
    @JsonProperty("dimission_time")
    private Integer dimissionTime;
  }
}
