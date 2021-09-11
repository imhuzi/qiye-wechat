package chat.qiye.wechat.sdk.api.wedrive.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class FileDelParam {

	@JsonProperty("userid")
	private String userid;

	@JsonProperty("fileid")
	private List<String> fileid;
}