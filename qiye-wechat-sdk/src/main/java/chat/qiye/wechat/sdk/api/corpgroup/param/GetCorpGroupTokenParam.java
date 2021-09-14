package chat.qiye.wechat.sdk.api.corpgroup.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetCorpGroupTokenParam{

	@JsonProperty("agentid")
	private int agentid;

	@JsonProperty("corpid")
	private String corpid;
}