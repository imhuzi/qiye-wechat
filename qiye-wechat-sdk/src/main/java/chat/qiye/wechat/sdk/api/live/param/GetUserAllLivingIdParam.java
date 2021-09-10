package chat.qiye.wechat.sdk.api.live.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetUserAllLivingIdParam{

	@JsonProperty("cursor")
	private String cursor;

	@JsonProperty("limit")
	private int limit = 20;

	@JsonProperty("userid")
	private String userid;
}