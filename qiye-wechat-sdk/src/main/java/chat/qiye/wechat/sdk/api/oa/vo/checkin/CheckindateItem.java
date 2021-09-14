package chat.qiye.wechat.sdk.api.oa.vo.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 工作日上下班打卡时间信息
 */
@Data
public class CheckindateItem{

	@JsonProperty("workdays")
	private List<Integer> workdays;

	@JsonProperty("flex_on_duty_time")
	private Integer flexOnDutyTime;

	@JsonProperty("limit_aheadtime")
	private Integer limitAheadtime;

	@JsonProperty("flex_off_duty_time")
	private Integer flexOffDutyTime;

	@JsonProperty("checkintime")
	private List<CheckintimeItem> checkintime;

	@JsonProperty("noneed_offwork")
	private Boolean noneedOffwork;
}