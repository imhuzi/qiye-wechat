package cn.tobdev.qy.weixin.sdk.model.auth.resp;

import cn.tobdev.qy.weixin.sdk.model.BaseResp;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class PreAuthCodeResp extends BaseResp implements Serializable {
    private String preAuthCode;
    private Integer expiresIn;
}
