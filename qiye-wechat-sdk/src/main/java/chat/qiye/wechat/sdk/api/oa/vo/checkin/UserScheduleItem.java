package chat.qiye.wechat.sdk.api.oa.vo.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserScheduleItem {

	@JsonProperty("schedule")
	private UserSchedule schedule;

	@JsonProperty("groupid")
	private Integer groupid;

	@JsonProperty("yearmonth")
	private Integer yearmonth;

	@JsonProperty("userid")
	private String userid;

	@JsonProperty("groupname")
	private String groupname;


}