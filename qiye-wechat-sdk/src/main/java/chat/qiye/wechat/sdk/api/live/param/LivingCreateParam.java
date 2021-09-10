package chat.qiye.wechat.sdk.api.live.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class LivingCreateParam{

	@JsonProperty("agentid")
	private Integer agentid;

	@JsonProperty("remind_time")
	private Integer remindTime;

	@JsonProperty("activity_cover_mediaid")
	private String activityCoverMediaid;

	@JsonProperty("living_start")
	private Integer livingStart;

	@JsonProperty("description")
	private String description;

	@JsonProperty("activity_detail")
	private ActivityDetail activityDetail;

	@JsonProperty("theme")
	private String theme;

	@JsonProperty("activity_share_mediaid")
	private String activityShareMediaid;

	@JsonProperty("type")
	private Integer type;

	@JsonProperty("anchor_userid")
	private String anchorUserid;

	@JsonProperty("living_duration")
	private Integer livingDuration;

	@Data
	public static class ActivityDetail{

		@JsonProperty("description")
		private String description;

		@JsonProperty("image_list")
		private List<String> imageList;
	}
}