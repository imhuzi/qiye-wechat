package chat.qiye.wechat.sdk.api.wedrive.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class FileMoveParam{

	@JsonProperty("fatherid")
	private String fatherid;

	@JsonProperty("replace")
	private boolean replace;

	@JsonProperty("userid")
	private String userid;

	@JsonProperty("fileid")
	private List<String> fileid;
}