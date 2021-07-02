package cn.tobdev.qy.weixin.sdk.api.school.resp;

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
 * @date  : 2021/7/3
 */
@Getter
@Setter
@ToString
public class SubscribeQrCodeResp  extends RespStatus implements Serializable {

  /**
   * qrcodeBig
   */
  @JsonProperty("qrcode_big")
  private String qrcodeBig;

  /**
   * qrcodeMiddle
   */
  @JsonProperty("qrcode_middle")
  private String qrcodeMiddle;

  /**
   * qrcodeThumb
   */
  @JsonProperty("qrcode_thumb")
  private String qrcodeThumb;
}
