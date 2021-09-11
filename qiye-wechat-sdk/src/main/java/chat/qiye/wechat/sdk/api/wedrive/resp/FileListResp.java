package chat.qiye.wechat.sdk.api.wedrive.resp;

import chat.qiye.wechat.sdk.api.wedrive.vo.WeDriveFileInfoVo;
import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class FileListResp extends RespStatus {

    @JsonProperty("next_start")
    private int nextStart;

    @JsonProperty("file_list")
    private FileList fileList;

    @JsonProperty("has_more")
    private boolean hasMore;

    @Data
    public static class FileList {
        private List<WeDriveFileInfoVo> item;
    }
}