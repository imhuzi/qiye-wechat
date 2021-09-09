package chat.qiye.wechat.sdk.api.oa.oa.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CheckInRuleGroupItem {

	@JsonProperty("create_userid")
	private String createUserid;

	@JsonProperty("need_photo")
	private boolean needPhoto;

	@JsonProperty("reporterinfo")
	private Reporterinfo reporterinfo;

	@JsonProperty("option_out_range")
	private int optionOutRange;

	@JsonProperty("offwork_interval_time")
	private int offworkIntervalTime;

	@JsonProperty("allow_apply_bk_cnt")
	private int allowApplyBkCnt;

	@JsonProperty("range")
	private CheckInRuleRange range;

	@JsonProperty("spe_workdays")
	private List<SpeWorkdaysItem> speWorkdays;

	@JsonProperty("sync_holidays")
	private boolean syncHolidays;

	@JsonProperty("type")
	private int type;

	@JsonProperty("allow_checkin_offworkday")
	private boolean allowCheckinOffworkday;

	@JsonProperty("allow_apply_bk_day_limit")
	private int allowApplyBkDayLimit;

	@JsonProperty("grouptype")
	private int grouptype;

	@JsonProperty("allow_apply_offworkday")
	private boolean allowApplyOffworkday;

	@JsonProperty("note_can_use_local_pic")
	private boolean noteCanUseLocalPic;

	@JsonProperty("checkindate")
	private List<CheckindateItem> checkindate;

	@JsonProperty("create_time")
	private int createTime;

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
	private int groupid;

	@JsonProperty("loc_infos")
	private List<LocInfosItem> locInfos;

	@JsonProperty("use_face_detect")
	private boolean useFaceDetect;

	@JsonProperty("groupname")
	private String groupname;

	@JsonProperty("spe_offdays")
	private List<SpeOffdaysItem> speOffdays;

	@JsonProperty("wifimac_infos")
	private List<WifimacInfosItem> wifimacInfos;

	@JsonProperty("ot_info")
	private OtInfo otInfo;


}