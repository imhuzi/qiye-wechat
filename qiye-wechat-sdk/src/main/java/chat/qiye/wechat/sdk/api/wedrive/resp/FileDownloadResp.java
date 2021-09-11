package chat.qiye.wechat.sdk.api.wedrive.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class FileDownloadResp extends RespStatus {

	@JsonProperty("download_url")
	private String downloadUrl;

	@JsonProperty("cookie_value")
	private String cookieValue;

	@JsonProperty("cookie_name")
	private String cookieName;
}