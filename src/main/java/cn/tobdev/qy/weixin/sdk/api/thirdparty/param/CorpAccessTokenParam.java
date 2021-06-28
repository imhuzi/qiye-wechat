package cn.tobdev.qy.weixin.sdk.api.thirdparty.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * https://work.weixin.qq.com/api/doc/90001/90143/90605
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @created : 2021/1/3
 */

@Data
public class CorpAccessTokenParam implements Serializable {
    @JsonProperty("auth_corpid")
    private String authCorpid;

    @JsonProperty("permanent_code")
    private String permanentCode;

}
