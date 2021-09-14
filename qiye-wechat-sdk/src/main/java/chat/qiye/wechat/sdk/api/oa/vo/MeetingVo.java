package chat.qiye.wechat.sdk.api.oa.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class MeetingVo{

	@JsonProperty("meetingid")
	private String meetingid;

	@JsonProperty("agentid")
	private Integer agentid;

	@JsonProperty("meeting_start")
	private Integer meetingStart;

	@JsonProperty("remind_time")
	private Integer remindTime;

	@JsonProperty("attendees")
	private Attendees attendees;

	@JsonProperty("creator_userid")
	private String creatorUserid;

	@JsonProperty("description")
	private String description;

	@JsonProperty("meeting_duration")
	private Integer meetingDuration;

	@JsonProperty("title")
	private String title;

	@JsonProperty("type")
	private Integer type;

	@Data
	public static class Attendees{

		@JsonProperty("external_userid")
		private List<String> externalUserid;

		@JsonProperty("device_sn")
		private List<String> deviceSn;

		@JsonProperty("userid")
		private List<String> userid;
	}
}