package chat.qiye.wechat.sdk.api.wedrive.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FileCreateParam{

	@JsonProperty("spaceid")
	private String spaceid;

	@JsonProperty("file_type")
	private String fileType;

	@JsonProperty("file_name")
	private String fileName;

	@JsonProperty("fatherid")
	private String fatherid;

	@JsonProperty("userid")
	private String userid;
}