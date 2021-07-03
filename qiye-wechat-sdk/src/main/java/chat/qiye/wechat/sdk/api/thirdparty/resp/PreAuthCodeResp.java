package chat.qiye.wechat.sdk.api.thirdparty.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 预授权码接口响应数据
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @created : 2021/1/3
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class PreAuthCodeResp extends RespStatus implements Serializable {
  @JsonProperty("pre_auth_code")
  private String preAuthCode;

  @JsonProperty("expires_in")
  private Integer expiresIn;
}
