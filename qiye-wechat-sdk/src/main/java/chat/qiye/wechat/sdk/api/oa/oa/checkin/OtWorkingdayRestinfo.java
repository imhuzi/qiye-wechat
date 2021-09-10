package chat.qiye.wechat.sdk.api.oa.oa.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OtWorkingdayRestinfo{

	@JsonProperty("fix_time_rule")
	private FixTimeRule fixTimeRule;

	@JsonProperty("type")
	private Integer type;

	@JsonProperty("cal_ottime_rule")
	private CalOttimeRule calOttimeRule;
}