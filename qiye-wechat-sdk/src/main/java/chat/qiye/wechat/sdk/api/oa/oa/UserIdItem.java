package chat.qiye.wechat.sdk.api.oa.oa;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserIdItem {

	@JsonProperty("userid")
	private String userid;
}