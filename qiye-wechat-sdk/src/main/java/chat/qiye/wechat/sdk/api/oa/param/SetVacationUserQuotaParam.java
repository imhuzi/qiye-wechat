package chat.qiye.wechat.sdk.api.oa.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SetVacationUserQuotaParam{

	@JsonProperty("time_attr")
	private Integer timeAttr;

	@JsonProperty("vacation_id")
	private Integer vacationId;

	@JsonProperty("userid")
	private String userid;

	@JsonProperty("leftduration")
	private Integer leftduration;

	@JsonProperty("remarks")
	private String remarks;
}