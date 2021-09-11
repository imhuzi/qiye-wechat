package chat.qiye.wechat.sdk.api.wedrive.resp;

import chat.qiye.wechat.sdk.api.wedrive.vo.WeDriveFileInfoVo;
import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class FileMoveResp extends RespStatus {

    @JsonProperty("file_list")
    private FileList fileList;

    @Data
    public static class FileList {
        private List<WeDriveFileInfoVo> item;
    }
}