package chat.qiye.wechat.sdk.api.wedrive.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FileListParam{

	@JsonProperty("spaceid")
	private String spaceid;

	@JsonProperty("sort_type")
	private String sortType;

	@JsonProperty("fatherid")
	private String fatherid;

	@JsonProperty("start")
	private String start;

	@JsonProperty("limit")
	private String limit;

	@JsonProperty("userid")
	private String userid;
}