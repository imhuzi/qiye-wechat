package chat.qiye.wechat.sdk.api.wedrive.param;

import chat.qiye.wechat.sdk.api.wedrive.vo.AuthInfoItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class WeDriveFileAclParam {
    @JsonProperty("fileid")
    private String fileid;
    private String userid;

    @JsonProperty("auth_info")
    private List<AuthInfoItem> authInfo;
}