package chat.qiye.wechat.sdk.api.oa.vo.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 晚走晚到时间规则信息
 */
@Data
public class CheckInLateRule {

	@JsonProperty("timerules")
	private List<TimerulesItem> timerules;

	@JsonProperty("allow_offwork_after_time")
	private Boolean allowOffworkAfterTime;
}