package chat.qiye.wechat.sdk.api.oa.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class MeetingRoomQueryBookingResp extends RespStatus {

	@JsonProperty("booking_list")
	private List<BookingListItem> bookingList;

	@Data
	public static class BookingListItem{

		@JsonProperty("schedule")
		private List<ScheduleItem> schedule;

		@JsonProperty("meetingroom_id")
		private Integer meetingroomId;

		@Data
		public static class ScheduleItem{

			@JsonProperty("start_time")
			private Integer startTime;

			@JsonProperty("meeting_id")
			private String meetingId;

			@JsonProperty("end_time")
			private Integer endTime;

			@JsonProperty("schedule_id")
			private String scheduleId;

			@JsonProperty("booker")
			private String booker;
		}
	}
}