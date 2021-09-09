package chat.qiye.wechat.sdk.api.oa.oa.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TimeSectionItem{

	@JsonProperty("id")
	private int id;

	@JsonProperty("time_id")
	private int timeId;

	@JsonProperty("remind_work_sec")
	private int remindWorkSec;

	@JsonProperty("off_work_sec")
	private int offWorkSec;

	@JsonProperty("rest_begin_time")
	private int restBeginTime;

	@JsonProperty("work_sec")
	private int workSec;

	@JsonProperty("remind_off_work_sec")
	private int remindOffWorkSec;

	@JsonProperty("allow_rest")
	private boolean allowRest;

	@JsonProperty("rest_end_time")
	private int restEndTime;
}