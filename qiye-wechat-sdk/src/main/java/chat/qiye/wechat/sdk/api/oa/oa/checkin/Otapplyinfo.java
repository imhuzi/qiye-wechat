package chat.qiye.wechat.sdk.api.oa.oa.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Otapplyinfo{

	@JsonProperty("ot_nonworkingday_spanday_time")
	private int otNonworkingdaySpandayTime;

	@JsonProperty("allow_ot_nonworkingday")
	private boolean allowOtNonworkingday;

	@JsonProperty("allow_ot_workingday")
	private boolean allowOtWorkingday;

	@JsonProperty("ot_nonworkingday_restinfo")
	private OtNonworkingdayRestinfo otNonworkingdayRestinfo;

	@JsonProperty("ot_workingday_restinfo")
	private OtWorkingdayRestinfo otWorkingdayRestinfo;

	@JsonProperty("uptime")
	private int uptime;
}