package chat.qiye.wechat.sdk.api.wedrive.resp;

import chat.qiye.wechat.sdk.api.wedrive.vo.WeDriveFileInfoVo;
import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class FileRenameResp extends RespStatus {

	@JsonProperty("file")
	private WeDriveFileInfoVo file;
}