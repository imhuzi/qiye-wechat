package chat.qiye.wechat.sdk.api.oa.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
public class ScheduleGetListResp extends RespStatus {

	@JsonProperty("schedule_list")
	private List<ScheduleListItem> scheduleList;

	@Data
	public static class ScheduleListItem{

		@JsonProperty("summary")
		private String summary;

		@JsonProperty("reminders")
		private Reminders reminders;

		@JsonProperty("start_time")
		private int startTime;

		@JsonProperty("cal_id")
		private String calId;

		@JsonProperty("organizer")
		private String organizer;

		@JsonProperty("attendees")
		private List<AttendeesItem> attendees;

		@JsonProperty("end_time")
		private int endTime;

		@JsonProperty("description")
		private String description;

		@JsonProperty("location")
		private String location;

		@JsonProperty("schedule_id")
		private String scheduleId;

		@JsonProperty("status")
		private int status;

		@Data
		public static class AttendeesItem{

			@JsonProperty("response_status")
			private int responseStatus;

			@JsonProperty("userid")
			private String userid;
		}

		@Data
		public static class Reminders{

			@JsonProperty("remind_before_event_secs")
			private int remindBeforeEventSecs;

			@JsonProperty("is_repeat")
			private int isRepeat;

			@JsonProperty("remind_time_diffs")
			private List<Integer> remindTimeDiffs;

			@JsonProperty("repeat_type")
			private int repeatType;

			@JsonProperty("timezone")
			private int timezone;

			@JsonProperty("exclude_time_list")
			private List<ExcludeTimeListItem> excludeTimeList;

			@JsonProperty("repeat_until")
			private int repeatUntil;

			@JsonProperty("is_remind")
			private int isRemind;

			@JsonProperty("repeat_interval")
			private int repeatInterval;

			@JsonProperty("repeat_day_of_month")
			private List<Integer> repeatDayOfMonth;

			@JsonProperty("repeat_day_of_week")
			private List<Integer> repeatDayOfWeek;

			@JsonProperty("is_custom_repeat")
			private int isCustomRepeat;

			@Data
			public static class ExcludeTimeListItem{

				@JsonProperty("start_time")
				private int startTime;
			}
		}
	}
}