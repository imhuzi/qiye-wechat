package chat.qiye.wechat.sdk.api.corpgroup.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetCorpGroupMiniprogramSessionParam{

	@JsonProperty("session_key")
	private String sessionKey;

	@JsonProperty("userid")
	private String userid;
}