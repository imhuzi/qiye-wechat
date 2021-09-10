package chat.qiye.wechat.sdk.api.wedrive.param;

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

    @Data
    public static class AuthInfoItem {
        private Integer auth;
        private String departmentid;
        private Integer type;
        private String userid;
    }
}