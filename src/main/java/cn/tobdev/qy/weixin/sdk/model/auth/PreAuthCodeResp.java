package cn.tobdev.qy.weixin.sdk.model.auth;

import cn.tobdev.qy.weixin.sdk.model.BaseResp;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class PreAuthCodeResp extends BaseResp implements Serializable {
    private String preAuthCode;
    private Integer expiresIn;
}
