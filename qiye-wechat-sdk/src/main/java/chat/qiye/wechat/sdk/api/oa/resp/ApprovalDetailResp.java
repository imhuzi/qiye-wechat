package chat.qiye.wechat.sdk.api.oa.resp;

import chat.qiye.wechat.sdk.api.oa.oa.UserIdItem;
import chat.qiye.wechat.sdk.api.oa.oa.approval.TitleItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ApprovalDetailResp{

	@JsonProperty("info")
	private Info info;

	@Data
	public static class Info {

		@JsonProperty("applyer")
		private Applyer applyer;

		@JsonProperty("comments")
		private List<CommentsItem> comments;

		@JsonProperty("sp_name")
		private String spName;

		@JsonProperty("sp_record")
		private List<SpRecordItem> spRecord;

		@JsonProperty("apply_data")
		private ApplyData applyData;

		@JsonProperty("notifyer")
		private List<UserIdItem> notifyer;

		@JsonProperty("template_id")
		private String templateId;

		@JsonProperty("apply_time")
		private Integer applyTime;

		@JsonProperty("sp_no")
		private String spNo;

		@JsonProperty("sp_status")
		private Integer spStatus;

		@Data
		public static class Applyer {

			@JsonProperty("partyid")
			private String partyid;

			@JsonProperty("userid")
			private String userid;
		}

		@Data
		public static class SpRecordItem{

			@JsonProperty("details")
			private List<DetailsItem> details;

			@JsonProperty("sp_status")
			private Integer spStatus;

			@JsonProperty("approverattr")
			private Integer approverattr;

			@Data
			public static class DetailsItem{

				@JsonProperty("approver")
				private UserIdItem approver;

				@JsonProperty("speech")
				private String speech;

				@JsonProperty("sptime")
				private Integer sptime;

				@JsonProperty("media_id")
				private List<String> mediaId;

				@JsonProperty("sp_status")
				private Integer spStatus;
			}
		}

		@Data
		public static class CommentsItem{

			@JsonProperty("commenttime")
			private Integer commenttime;

			@JsonProperty("commentcontent")
			private String commentcontent;

			@JsonProperty("commentUserInfo")
			private UserIdItem commentUserInfo;

			@JsonProperty("commentid")
			private String commentid;

			@JsonProperty("media_id")
			private List<String> mediaId;
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

				@JsonProperty("title")
				private List<TitleItem> title;

				@JsonProperty("value")
				private Value value;
			}

			public static class Value{

				@JsonProperty("stat_field")
				private List<Object> statField;

				@JsonProperty("children")
				private List<Object> children;

				@JsonProperty("members")
				private List<Object> members;

				@JsonProperty("files")
				private List<Object> files;

				@JsonProperty("text")
				private String text;

				@JsonProperty("departments")
				private List<Object> departments;

				@JsonProperty("tips")
				private List<Object> tips;
			}
		}
	}
}