package chat.qiye.wechat.sdk.api.oa.oa.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserScheduleItem {

	@JsonProperty("schedule")
	private UserSchedule schedule;

	@JsonProperty("groupid")
	private int groupid;

	@JsonProperty("yearmonth")
	private int yearmonth;

	@JsonProperty("userid")
	private String userid;

	@JsonProperty("groupname")
	private String groupname;


}