package chat.qiye.wechat.sdk.api.oa.vo.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OtInfo{

	@JsonProperty("allow_ot_nonworkingday")
	private Boolean allowOtNonworkingday;

	@JsonProperty("otapplyinfo")
	private Otapplyinfo otapplyinfo;

	@JsonProperty("allow_ot_workingday")
	private Boolean allowOtWorkingday;

	@JsonProperty("type")
	private Integer type;

	@JsonProperty("otcheckinfo")
	private Otcheckinfo otcheckinfo;

	@JsonProperty("uptime")
	private Integer uptime;
}