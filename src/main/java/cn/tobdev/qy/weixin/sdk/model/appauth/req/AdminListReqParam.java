package cn.tobdev.qy.weixin.sdk.model.appauth.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 获取应用的管理员列表接口响应
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @created : 2021/1/3
 */
@Data
public class AdminListReqParam {
    @JsonProperty(value = "auth_corpid")
    private String authCorpid;
    private Integer agentid;
}
