package chat.qiye.wechat.sdk.api.oa.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SetVacationUserQuotaParam{

	@JsonProperty("time_attr")
	private int timeAttr;

	@JsonProperty("vacation_id")
	private int vacationId;

	@JsonProperty("userid")
	private String userid;

	@JsonProperty("leftduration")
	private int leftduration;

	@JsonProperty("remarks")
	private String remarks;
}