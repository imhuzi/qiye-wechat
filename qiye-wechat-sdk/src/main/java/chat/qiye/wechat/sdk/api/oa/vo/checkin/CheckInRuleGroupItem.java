package chat.qiye.wechat.sdk.api.oa.vo.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CheckInRuleGroupItem {

	@JsonProperty("create_userid")
	private String createUserid;

	@JsonProperty("need_photo")
	private Boolean needPhoto;

	@JsonProperty("reporterinfo")
	private Reporterinfo reporterinfo;

	@JsonProperty("option_out_range")
	private Integer optionOutRange;

	@JsonProperty("offwork_interval_time")
	private Integer offworkIntervalTime;

	@JsonProperty("allow_apply_bk_cnt")
	private Integer allowApplyBkCnt;

	@JsonProperty("range")
	private CheckInRuleRange range;

	@JsonProperty("spe_workdays")
	private List<SpeWorkdaysItem> speWorkdays;

	@JsonProperty("sync_holidays")
	private Boolean syncHolidays;

	@JsonProperty("type")
	private Integer type;

	@JsonProperty("allow_checkin_offworkday")
	private Boolean allowCheckinOffworkday;

	@JsonProperty("allow_apply_bk_day_limit")
	private Integer allowApplyBkDayLimit;

	@JsonProperty("grouptype")
	private Integer grouptype;

	@JsonProperty("allow_apply_offworkday")
	private Boolean allowApplyOffworkday;

	@JsonProperty("note_can_use_local_pic")
	private Boolean noteCanUseLocalPic;

	@JsonProperty("checkindate")
	private List<CheckindateItem> checkindate;

	@JsonProperty("create_time")
	private Integer createTime;

	@JsonProperty("update_userid")
	private String updateUserid;

	@JsonProperty("white_users")
	private List<String> whiteUsers;

	/**
	 * 排班信息，只有规则为按班次上下班打卡时才有该配置
	 */
	@JsonProperty("schedulelist")
	private List<SchedulelistItem> schedulelist;

	@JsonProperty("groupid")
	private Integer groupid;

	@JsonProperty("loc_infos")
	private List<LocInfosItem> locInfos;

	@JsonProperty("use_face_detect")
	private Boolean useFaceDetect;

	@JsonProperty("groupname")
	private String groupname;

	@JsonProperty("spe_offdays")
	private List<SpeOffdaysItem> speOffdays;

	@JsonProperty("wifimac_infos")
	private List<WifimacInfosItem> wifimacInfos;

	@JsonProperty("ot_info")
	private OtInfo otInfo;


}