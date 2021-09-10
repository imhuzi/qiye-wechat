package chat.qiye.wechat.sdk.api.oa.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ScheduleGetByCalendarParam{

	@JsonProperty("offset")
	private Integer offset;

	@JsonProperty("cal_id")
	private String calId;

	@JsonProperty("limit")
	private Integer limit;
}