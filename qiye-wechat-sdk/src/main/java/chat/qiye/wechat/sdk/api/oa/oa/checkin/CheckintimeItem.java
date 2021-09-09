package chat.qiye.wechat.sdk.api.oa.oa.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CheckintimeItem{

	@JsonProperty("remind_work_sec")
	private int remindWorkSec;

	@JsonProperty("off_work_sec")
	private int offWorkSec;

	@JsonProperty("work_sec")
	private int workSec;

	@JsonProperty("remind_off_work_sec")
	private int remindOffWorkSec;
}