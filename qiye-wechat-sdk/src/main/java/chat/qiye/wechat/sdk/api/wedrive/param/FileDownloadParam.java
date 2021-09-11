package chat.qiye.wechat.sdk.api.wedrive.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FileDownloadParam {
    @JsonProperty("fileid")
    private String fileid;
    private String userid;
}