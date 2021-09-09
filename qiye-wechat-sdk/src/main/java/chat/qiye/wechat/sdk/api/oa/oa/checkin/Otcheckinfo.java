package chat.qiye.wechat.sdk.api.oa.oa.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Otcheckinfo{

	@JsonProperty("ot_workingday_time_start")
	private int otWorkingdayTimeStart;

	@JsonProperty("ot_nonworkingday_spanday_time")
	private int otNonworkingdaySpandayTime;

	@JsonProperty("ot_workingday_time_min")
	private int otWorkingdayTimeMin;

	@JsonProperty("ot_workingday_time_max")
	private int otWorkingdayTimeMax;

	@JsonProperty("ot_nonworkingday_restinfo")
	private OtNonworkingdayRestinfo otNonworkingdayRestinfo;

	@JsonProperty("ot_nonworkingday_time_max")
	private int otNonworkingdayTimeMax;

	@JsonProperty("ot_nonworkingday_time_min")
	private int otNonworkingdayTimeMin;

	@JsonProperty("ot_workingday_restinfo")
	private OtWorkingdayRestinfo otWorkingdayRestinfo;
}