package chat.qiye.wechat.sdk.api.kf.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/10
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class KfAddContactWayResp extends RespStatus {
    @JsonProperty("url")
    private String url;
}
