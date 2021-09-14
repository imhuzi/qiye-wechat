package chat.qiye.wechat.sdk.api.live.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetLivingWatchStatParam {
    private String livingid;

    @JsonProperty("next_key")
    private String nextKey;
}
