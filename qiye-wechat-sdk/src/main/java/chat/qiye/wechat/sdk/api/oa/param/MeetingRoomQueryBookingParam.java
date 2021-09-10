package chat.qiye.wechat.sdk.api.oa.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MeetingRoomQueryBookingParam{

	@JsonProperty("start_time")
	private Integer startTime;

	@JsonProperty("meetingroom_id")
	private Integer meetingroomId;

	@JsonProperty("city")
	private String city;

	@JsonProperty("end_time")
	private int endTime;

	@JsonProperty("floor")
	private String floor;

	@JsonProperty("building")
	private String building;
}