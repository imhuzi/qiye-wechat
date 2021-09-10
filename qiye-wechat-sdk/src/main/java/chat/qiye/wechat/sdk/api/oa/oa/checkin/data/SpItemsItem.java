package chat.qiye.wechat.sdk.api.oa.oa.checkin.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SpItemsItem{

	@JsonProperty("duration")
	private Integer duration;

	@JsonProperty("time_type")
	private Integer timeType;

	@JsonProperty("count")
	private Integer count;

	@JsonProperty("name")
	private String name;

	@JsonProperty("vacation_id")
	private Integer vacationId;

	@JsonProperty("type")
	private Integer type;
}