package chat.qiye.wechat.sdk.api.oa.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AddCheckInUserFaceParam{

	@JsonProperty("userid")
	private String userid;

	@JsonProperty("userface")
	private String userface;
}