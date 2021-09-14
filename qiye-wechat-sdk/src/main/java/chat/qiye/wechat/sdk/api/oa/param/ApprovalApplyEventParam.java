package chat.qiye.wechat.sdk.api.oa.param;

import chat.qiye.wechat.sdk.api.oa.vo.approval.TitleItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ApprovalApplyEventParam{

	@JsonProperty("approver")
	private List<ApproverItem> approver;

	@JsonProperty("notify_type")
	private Integer notifyType;

	@JsonProperty("choose_department")
	private Integer chooseDepartment;

	@JsonProperty("apply_data")
	private ApplyData applyData;

	@JsonProperty("notifyer")
	private List<String> notifyer;

	@JsonProperty("creator_userid")
	private String creatorUserid;

	@JsonProperty("template_id")
	private String templateId;

	@JsonProperty("summary_list")
	private List<SummaryListItem> summaryList;

	@JsonProperty("use_template_approver")
	private Integer useTemplateApprover;

	@Data
	public static class ApproverItem{

		@JsonProperty("attr")
		private Integer attr;

		@JsonProperty("userid")
		private List<String> userid;
	}

	@Data
	public static class ApplyData{

		@JsonProperty("contents")
		private List<ContentsItem> contents;

		@Data
		public static class ContentsItem{

			@JsonProperty("control")
			private String control;

			@JsonProperty("id")
			private String id;

			@JsonProperty("value")
			private Value value;
		}
	}

	@Data
	public static class Value{

		@JsonProperty("text")
		private String text;
	}

	@Data
	public static class SummaryListItem{

		@JsonProperty("summary_info")
		private List<TitleItem> summaryInfo;
	}
}