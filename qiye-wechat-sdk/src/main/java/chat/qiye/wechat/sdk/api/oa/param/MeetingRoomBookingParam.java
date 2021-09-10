package chat.qiye.wechat.sdk.api.oa.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class MeetingRoomBookingParam{

	@JsonProperty("start_time")
	private Integer startTime;

	@JsonProperty("meetingroom_id")
	private Integer meetingroomId;

	@JsonProperty("subject")
	private String subject;

	@JsonProperty("attendees")
	private List<String> attendees;

	@JsonProperty("end_time")
	private Integer endTime;

	@JsonProperty("booker")
	private String booker;
}