package chat.qiye.wechat.sdk.api.wedrive.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeDriveSpaceShareParam {
    @JsonProperty("spaceid")
    private String spaceid;
    private String userid;
}