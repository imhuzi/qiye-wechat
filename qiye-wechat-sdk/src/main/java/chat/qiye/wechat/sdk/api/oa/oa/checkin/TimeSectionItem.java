package chat.qiye.wechat.sdk.api.oa.oa.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TimeSectionItem{

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("time_id")
	private Integer timeId;

	@JsonProperty("remind_work_sec")
	private Integer remindWorkSec;

	@JsonProperty("off_work_sec")
	private Integer offWorkSec;

	@JsonProperty("rest_begin_time")
	private Integer restBeginTime;

	@JsonProperty("work_sec")
	private Integer workSec;

	@JsonProperty("remind_off_work_sec")
	private Integer remindOffWorkSec;

	@JsonProperty("allow_rest")
	private Boolean allowRest;

	@JsonProperty("rest_end_time")
	private Integer restEndTime;
}