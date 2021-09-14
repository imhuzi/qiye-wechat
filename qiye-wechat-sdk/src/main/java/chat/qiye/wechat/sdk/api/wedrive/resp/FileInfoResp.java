package chat.qiye.wechat.sdk.api.wedrive.resp;

import chat.qiye.wechat.sdk.api.wedrive.vo.WeDriveFileInfoVo;
import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class FileInfoResp extends RespStatus {

	@JsonProperty("file_info")
	private WeDriveFileInfoVo fileInfo;
}