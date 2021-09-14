package chat.qiye.wechat.sdk.api.oa.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class MeetingDetailResp extends RespStatus {

	@JsonProperty("meeting_start")
	private Integer meetingStart;

	@JsonProperty("remind_time")
	private Integer remindTime;

	@JsonProperty("reserve_meeting_start ")
	private Integer reserveMeetingStart;

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

	@JsonProperty("main_department")
	private Integer mainDepartment;

	@JsonProperty("type")
	private Integer type;

	@JsonProperty("reserve_meeting_duration")
	private Integer reserveMeetingDuration;

	@JsonProperty("status")
	private Integer status;

	@Data
    public static class Attendees{

        @JsonProperty("member")
        private List<MemberItem> member;

        @JsonProperty("external_user")
        private List<ExternalUserItem> externalUser;

        @JsonProperty("device")
        private List<DeviceItem> device;

        @Data
        public static class DeviceItem{

            @JsonProperty("device_sn")
            private String deviceSn;

            @JsonProperty("status")
            private Integer status;
        }

        @Data
        public static class ExternalUserItem{

            @JsonProperty("external_userid")
            private String externalUserid;

            @JsonProperty("status")
            private Integer status;
        }

        @Data
        public static class MemberItem{

            @JsonProperty("userid")
            private String userid;

            @JsonProperty("status")
            private Integer status;
        }
    }
}