package chat.qiye.wechat.sdk.api.oa.vo.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class UserSchedule {

	@JsonProperty("scheduleList")
	private List<ScheduleItem> scheduleList;

	/**
	 * @author : Hui.Wang [huzi.wh@gmail.com]
	 * @version : 1.0
	 * @date : 2021/9/9
	 */
	@Data
	public static class ScheduleItem {

		@JsonProperty("schedule_info")
		private ScheduleInfo scheduleInfo;

		@JsonProperty("day")
		private Integer day;

		@Data
		public static class ScheduleInfo{

			@JsonProperty("time_section")
			private List<TimeSectionItem> timeSection;

			@JsonProperty("schedule_id")
			private Integer scheduleId;

			@JsonProperty("schedule_name")
			private String scheduleName;
		}
	}
}