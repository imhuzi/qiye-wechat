package chat.qiye.wechat.sdk.api.app.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SetAppAgentParam {

	@JsonProperty("isreportenter")
	private int isreportenter;

	@JsonProperty("agentid")
	private int agentid;

	@JsonProperty("redirect_domain")
	private String redirectDomain;

	@JsonProperty("home_url")
	private String homeUrl;

	@JsonProperty("name")
	private String name;

	@JsonProperty("description")
	private String description;

	@JsonProperty("report_location_flag")
	private int reportLocationFlag;

	@JsonProperty("logo_mediaid")
	private String logoMediaid;
}