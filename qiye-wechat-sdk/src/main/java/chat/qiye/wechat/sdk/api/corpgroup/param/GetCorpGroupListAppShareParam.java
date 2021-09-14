package chat.qiye.wechat.sdk.api.corpgroup.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetCorpGroupListAppShareParam{

	@JsonProperty("agentid")
	private int agentid;
}