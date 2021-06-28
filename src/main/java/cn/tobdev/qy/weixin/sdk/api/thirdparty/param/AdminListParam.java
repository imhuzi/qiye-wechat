package cn.tobdev.qy.weixin.sdk.api.thirdparty.param;

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
public class AdminListParam {
    @JsonProperty(value = "auth_corpid")
    private String authCorpid;
    private Integer agentid;
}
