package chat.qiye.wechat.sdk.api.live.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/10
 */
@Data
public class LivingIdParam {
    @JsonProperty("livingid")
    private String livingid;
}
