package cn.tobdev.qy.weixin.sdk.api.customer.resp;

import java.io.Serializable;

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
 * @date  : 2021/6/29
 */
@Getter
@Setter
@ToString
public class ContactWaySetResp extends RespStatus implements Serializable {

  /**
   * configId
   */
  @JsonProperty("config_id")
  private String configId;

  /**
   * qrCode
   */
  @JsonProperty("qr_code")
  private String qrCode;
}
