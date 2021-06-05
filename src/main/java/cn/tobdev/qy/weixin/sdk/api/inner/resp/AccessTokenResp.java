package cn.tobdev.qy.weixin.sdk.api.inner.resp;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.common.RespStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AccessTokenResp extends RespStatus {

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("expires_in")
    private Integer expiresIn;
}
