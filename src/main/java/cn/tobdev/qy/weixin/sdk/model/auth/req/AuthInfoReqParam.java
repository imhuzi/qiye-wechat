package cn.tobdev.qy.weixin.sdk.model.auth.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 企业授权信息接口请求参数
 */
@Data
public class AuthInfoReqParam {
    /**
     * 授权企业id
     */
    @JsonProperty(value = "auth_corpid")
    private String authCorpid;
    /**
     * 永久授权码
     */
    @JsonProperty(value = "permanent_code")
    private String permanentCode;
}
