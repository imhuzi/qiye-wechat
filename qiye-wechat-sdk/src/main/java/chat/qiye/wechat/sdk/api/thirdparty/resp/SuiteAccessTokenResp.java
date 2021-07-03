package chat.qiye.wechat.sdk.api.thirdparty.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * https://work.weixin.qq.com/api/doc/90001/90143/90600
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @created : 2021/1/3
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class SuiteAccessTokenResp extends RespStatus implements Serializable {
    @JsonProperty("suite_access_token")
    private String suiteAccessToken;
    @JsonProperty("expires_in")
    private int expiresIn = -1;
}
