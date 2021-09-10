package chat.qiye.wechat.sdk.api.oa.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class MeetingRoomBookingResp extends RespStatus {

	@JsonProperty("meeting_id")
	private String meetingId;

	@JsonProperty("schedule_id")
	private String scheduleId;
}