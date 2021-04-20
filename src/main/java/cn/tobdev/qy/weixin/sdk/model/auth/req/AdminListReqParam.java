package cn.tobdev.qy.weixin.sdk.model.auth.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AdminListReqParam {
    @JsonProperty(value = "auth_corpid")
    private String authCorpid;
    private Integer agentid;
}
