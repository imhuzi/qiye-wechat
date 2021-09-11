package chat.qiye.wechat.sdk.api.wedrive.param;

import chat.qiye.wechat.sdk.api.wedrive.vo.AuthInfoItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class WeDriveSpaceAclParam {
    @JsonProperty("spaceid")
    private String spaceid;
    private String userid;

    @JsonProperty("auth_info")
    private List<AuthInfoItem> authInfo;
}