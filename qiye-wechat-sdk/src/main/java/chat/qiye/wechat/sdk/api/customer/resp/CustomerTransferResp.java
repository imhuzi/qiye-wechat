package chat.qiye.wechat.sdk.api.customer.resp;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import chat.qiye.wechat.sdk.common.RespStatus;
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
public class CustomerTransferResp   extends RespStatus implements Serializable {

  /**
   * customer
   */
  @JsonProperty("customer")
  private List<CustomerTransferResultDto> customer;


  @NoArgsConstructor
  @Data
  public static class CustomerTransferResultDto {
    /**
     * externalUserid
     */
    @JsonProperty("external_userid")
    private String externalUserid;

    /**
     * errcode
     */
    @JsonProperty("errcode")
    private Integer errcode;
  }
}
