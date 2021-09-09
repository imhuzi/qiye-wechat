package chat.qiye.wechat.sdk.api.oa.oa.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OtInfo{

	@JsonProperty("allow_ot_nonworkingday")
	private boolean allowOtNonworkingday;

	@JsonProperty("otapplyinfo")
	private Otapplyinfo otapplyinfo;

	@JsonProperty("allow_ot_workingday")
	private boolean allowOtWorkingday;

	@JsonProperty("type")
	private int type;

	@JsonProperty("otcheckinfo")
	private Otcheckinfo otcheckinfo;

	@JsonProperty("uptime")
	private int uptime;
}