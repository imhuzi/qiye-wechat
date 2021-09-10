package chat.qiye.wechat.sdk.api.oa.oa.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TimerulesItem{

	@JsonProperty("offwork_after_time")
	private Integer offworkAfterTime;

	@JsonProperty("onwork_flex_time")
	private Integer onworkFlexTime;
}