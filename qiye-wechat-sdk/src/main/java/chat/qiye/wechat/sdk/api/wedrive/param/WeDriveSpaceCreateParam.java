package chat.qiye.wechat.sdk.api.wedrive.param;

import chat.qiye.wechat.sdk.api.wedrive.vo.AuthInfoItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class WeDriveSpaceCreateParam {
    @JsonProperty("space_name")
    private String spaceName;
    @JsonProperty("auth_info")
    private List<AuthInfoItem> authInfo;
    private String userid;
}