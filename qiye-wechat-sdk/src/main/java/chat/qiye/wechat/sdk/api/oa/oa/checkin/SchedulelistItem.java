package chat.qiye.wechat.sdk.api.oa.oa.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 排班信息，只有规则为按班次上下班打卡时才有该配置
 */
@Data
public class SchedulelistItem{

	@JsonProperty("limit_offtime")
	private int limitOfftime;

	@JsonProperty("flex_on_duty_time")
	private int flexOnDutyTime;

	@JsonProperty("time_section")
	private List<TimeSectionItem> timeSection;

	@JsonProperty("max_allow_arrive_early")
	private int maxAllowArriveEarly;

	@JsonProperty("limit_aheadtime")
	private int limitAheadtime;

	@JsonProperty("flex_off_duty_time")
	private int flexOffDutyTime;

	@JsonProperty("late_rule")
	private CheckInLateRule lateRule;

	@JsonProperty("schedule_id")
	private int scheduleId;

	@JsonProperty("schedule_name")
	private String scheduleName;

	@JsonProperty("max_allow_arrive_late")
	private int maxAllowArriveLate;

	@JsonProperty("noneed_offwork")
	private boolean noneedOffwork;

	@JsonProperty("allow_flex")
	private boolean allowFlex;
}