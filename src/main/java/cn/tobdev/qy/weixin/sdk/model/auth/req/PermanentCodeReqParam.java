package cn.tobdev.qy.weixin.sdk.model.auth.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PermanentCodeReqParam {
    /**
     * 临时授权码，会在授权成功时附加在redirect_uri中跳转回第三方服务商网站，或通过授权成功通知回调推送给服务商。长度为64至512个字节
     */
    @JsonProperty(value = "auth_code")
    private String authCode;
}
