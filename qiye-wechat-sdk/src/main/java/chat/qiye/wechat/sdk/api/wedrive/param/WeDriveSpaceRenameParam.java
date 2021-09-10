package chat.qiye.wechat.sdk.api.wedrive.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeDriveSpaceRenameParam{

	@JsonProperty("spaceid")
	private String spaceid;

	@JsonProperty("space_name")
	private String spaceName;

	@JsonProperty("userid")
	private String userid;
}