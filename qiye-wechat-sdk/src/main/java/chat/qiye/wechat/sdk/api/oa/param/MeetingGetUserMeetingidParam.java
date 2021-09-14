package chat.qiye.wechat.sdk.api.oa.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MeetingGetUserMeetingidParam{

	@JsonProperty("cursor")
	private String cursor;

	@JsonProperty("end_time")
	private Integer endTime;

	@JsonProperty("limit")
	private Integer limit;

	@JsonProperty("begin_time")
	private Integer beginTime;

	@JsonProperty("userid")
	private String userid;
}