package chat.qiye.wechat.sdk.api.wedrive.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FileSettingParam{

	@JsonProperty("auth")
	private int auth;

	@JsonProperty("auth_scope")
	private String authScope;

	@JsonProperty("userid")
	private String userid;

	@JsonProperty("fileid")
	private String fileid;
}