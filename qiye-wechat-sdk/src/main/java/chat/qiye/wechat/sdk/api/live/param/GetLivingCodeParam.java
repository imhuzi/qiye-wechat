package chat.qiye.wechat.sdk.api.live.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetLivingCodeParam{

	@JsonProperty("livingid")
	private String livingid;

	@JsonProperty("openid")
	private String openid;
}