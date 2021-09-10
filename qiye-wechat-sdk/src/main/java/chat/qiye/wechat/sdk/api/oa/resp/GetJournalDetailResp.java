package chat.qiye.wechat.sdk.api.oa.resp;

import chat.qiye.wechat.sdk.api.oa.oa.UserIdItem;
import chat.qiye.wechat.sdk.api.oa.oa.approval.TitleItem;
import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class GetJournalDetailResp extends RespStatus {

	@JsonProperty("info")
	private Info info;


	@Data
	public static class Info {

		@JsonProperty("submitter")
		private UserIdItem submitter;

		@JsonProperty("template_name")
		private String templateName;

		@JsonProperty("comments")
		private List<CommentsItem> comments;

		@JsonProperty("report_time")
		private int reportTime;

		@JsonProperty("receivers")
		private List<UserIdItem> receivers;

		@JsonProperty("readed_receivers")
		private List<UserIdItem> readedReceivers;

		@JsonProperty("apply_data")
		private ApplyData applyData;

		@JsonProperty("journal_uuid")
		private String journalUuid;


		@Data
		public static class CommentsItem {

			@JsonProperty("comment_time")
			private Integer commentTime;

			@JsonProperty("tocommentid")
			private Integer tocommentid;

			@JsonProperty("commentid")
			private Long commentid;

			@JsonProperty("comment_userinfo")
			private CommentUserinfo commentUserinfo;

			@JsonProperty("content")
			private String content;

			@Data
			public static class CommentUserinfo {

				@JsonProperty("userid")
				private String userid;
			}
		}

		@Data
		public static class ApplyData {

			@JsonProperty("contents")
			private List<ContentsItem> contents;

			@Data
			public static class ContentsItem {

				@JsonProperty("control")
				private String control;

				@JsonProperty("id")
				private String id;

				@JsonProperty("title")
				private List<TitleItem> title;

				@JsonProperty("value")
				private Value value;

				/**
				 * todo 需完善
				 */
				@Data
				public static class Value {

					@JsonProperty("stat_field")
					private List<Object> statField;

					@JsonProperty("children")
					private List<Object> children;

					@JsonProperty("members")
					private List<Object> members;

					@JsonProperty("related_approval")
					private List<Object> relatedApproval;

					@JsonProperty("classes")
					private List<Object> classes;

					@JsonProperty("files")
					private List<Object> files;

					@JsonProperty("students")
					private List<Object> students;

					@JsonProperty("text")
					private String text;

					@JsonProperty("departments")
					private List<Object> departments;

					@JsonProperty("tips")
					private List<Object> tips;

					@JsonProperty("sum_field")
					private List<Object> sumField;
				}
			}
		}
	}
}