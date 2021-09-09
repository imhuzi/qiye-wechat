package chat.qiye.wechat.sdk.api.oa.oa.approval;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApprovalTemplateConfig {

	@JsonProperty("selector")
	private SelectorControl selector;

	@JsonProperty("date")
	private DateControl date;

	@JsonProperty("contact")
	private ContactControl contact;


	@JsonProperty("table")
	private TableControl table;


	@JsonProperty("attendance")
	private AttendanceControl attendance;


	@JsonProperty("vacation_list")
	private VacationControl vacationList;



}