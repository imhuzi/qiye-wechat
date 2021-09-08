package chat.qiye.wechat.sdk.api.corpgroup.resp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CorpListItem{

	@JsonProperty("agentid")
	private int agentid;

	@JsonProperty("corpid")
	private String corpid;

	@JsonProperty("corp_name")
	private String corpName;
}