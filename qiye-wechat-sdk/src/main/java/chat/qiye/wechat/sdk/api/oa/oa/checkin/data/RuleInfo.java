package chat.qiye.wechat.sdk.api.oa.oa.checkin.data;

import chat.qiye.wechat.sdk.api.oa.oa.checkin.CheckintimeItem;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RuleInfo{

	@JsonProperty("schedulename")
	private String schedulename;

	@JsonProperty("groupid")
	private Integer groupid;

	@JsonProperty("groupname")
	private String groupname;

	@JsonProperty("checkintime")
	private List<CheckintimeItem> checkintime;

	@JsonProperty("scheduleid")
	private Integer scheduleid;
}