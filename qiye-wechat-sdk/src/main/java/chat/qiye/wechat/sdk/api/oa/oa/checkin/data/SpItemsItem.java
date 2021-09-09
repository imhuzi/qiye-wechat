package chat.qiye.wechat.sdk.api.oa.oa.checkin.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SpItemsItem{

	@JsonProperty("duration")
	private int duration;

	@JsonProperty("time_type")
	private int timeType;

	@JsonProperty("count")
	private int count;

	@JsonProperty("name")
	private String name;

	@JsonProperty("vacation_id")
	private int vacationId;

	@JsonProperty("type")
	private int type;
}