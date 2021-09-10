package chat.qiye.wechat.sdk.api.oa.oa.checkin.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BaseInfo{

	@JsonProperty("date")
	private Integer date;

	@JsonProperty("day_type")
	private Integer dayType;

	@JsonProperty("name_ex")
	private String nameEx;

	@JsonProperty("name")
	private String name;

	@JsonProperty("departs_name")
	private String departsName;

	@JsonProperty("rule_info")
	private RuleInfo ruleInfo;

	@JsonProperty("acctid")
	private String acctid;

	@JsonProperty("record_type")
	private Integer recordType;
}