package cn.tobdev.qy.weixin.sdk.api.thirdparty.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 企业授权信息接口请求参数
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @created : 2021/1/3
 */

@Data
public class CorpAuthInfoReqParam {
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
