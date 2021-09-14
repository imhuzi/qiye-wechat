package chat.qiye.wechat.sdk.api.wedrive.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeDriveSpaceIdParam {

	@JsonProperty("spaceid")
	private String spaceid;

	@JsonProperty("userid")
	private String userid;
}