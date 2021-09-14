package chat.qiye.wechat.sdk.api.wedrive.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FileUploadParam{

	@JsonProperty("spaceid")
	private String spaceid;

	@JsonProperty("file_name")
	private String fileName;

	@JsonProperty("file_base64_content")
	private String fileBase64Content;

	@JsonProperty("fatherid")
	private String fatherid;

	@JsonProperty("userid")
	private String userid;
}