package cn.tobdev.qy.weixin.sdk.model.appauth.token;

import cn.tobdev.qy.weixin.sdk.model.BaseResp;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * https://work.weixin.qq.com/api/doc/90001/90143/91200
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @created : 2021/1/3
 */

@Data
public class ProviderAccessTokenReqParam implements Serializable {

    private String corpid;

    @JsonProperty("provider_secret")
    private String providerSecret;
}
