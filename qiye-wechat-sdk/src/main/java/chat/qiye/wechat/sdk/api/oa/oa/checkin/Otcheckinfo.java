package chat.qiye.wechat.sdk.api.oa.oa.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Otcheckinfo{

	@JsonProperty("ot_workingday_time_start")
	private Integer otWorkingdayTimeStart;

	@JsonProperty("ot_nonworkingday_spanday_time")
	private Integer otNonworkingdaySpandayTime;

	@JsonProperty("ot_workingday_time_min")
	private Integer otWorkingdayTimeMin;

	@JsonProperty("ot_workingday_time_max")
	private Integer otWorkingdayTimeMax;

	@JsonProperty("ot_nonworkingday_restinfo")
	private OtNonworkingdayRestinfo otNonworkingdayRestinfo;

	@JsonProperty("ot_nonworkingday_time_max")
	private Integer otNonworkingdayTimeMax;

	@JsonProperty("ot_nonworkingday_time_min")
	private Integer otNonworkingdayTimeMin;

	@JsonProperty("ot_workingday_restinfo")
	private OtWorkingdayRestinfo otWorkingdayRestinfo;
}