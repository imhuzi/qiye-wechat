package chat.qiye.wechat.sdk.api.oa.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MeetingRoomCancelBookingParam {

	@JsonProperty("keep_schedule")
	private int keepSchedule;

	@JsonProperty("meeting_id")
	private String meetingId;
}