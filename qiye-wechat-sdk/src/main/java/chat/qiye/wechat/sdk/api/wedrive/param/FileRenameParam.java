package chat.qiye.wechat.sdk.api.wedrive.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FileRenameParam {
    @JsonProperty("fileid")
    private String fileid;
    private String userid;
    @JsonProperty("new_name")
    private String newName;

}