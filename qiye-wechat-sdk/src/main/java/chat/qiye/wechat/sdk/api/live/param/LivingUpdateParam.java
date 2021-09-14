package chat.qiye.wechat.sdk.api.live.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LivingUpdateParam{

	@JsonProperty("livingid")
	private String livingid;

	@JsonProperty("remind_time")
	private Integer remindTime;

	@JsonProperty("living_start")
	private Integer livingStart;

	@JsonProperty("description")
	private String description;

	@JsonProperty("theme")
	private String theme;

	@JsonProperty("type")
	private Integer type;

	@JsonProperty("living_duration")
	private Integer livingDuration;
}