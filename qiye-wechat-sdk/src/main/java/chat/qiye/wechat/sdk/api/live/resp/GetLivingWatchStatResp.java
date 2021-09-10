package chat.qiye.wechat.sdk.api.live.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class GetLivingWatchStatResp extends RespStatus {

	@JsonProperty("ending")
	private int ending;

	@JsonProperty("next_key")
	private String nextKey;

	@JsonProperty("stat_info")
	private StatInfo statInfo;

	@Data
	public static class StatInfo{

		@JsonProperty("external_users")
		private List<ExternalUsersItem> externalUsers;

		@JsonProperty("users")
		private List<UsersItem> users;

		@Data
		public static class UsersItem{

			@JsonProperty("watch_time")
			private int watchTime;

			@JsonProperty("is_comment")
			private int isComment;

			@JsonProperty("is_mic")
			private int isMic;

			@JsonProperty("userid")
			private String userid;
		}

		@Data
		public static class ExternalUsersItem{

			@JsonProperty("external_userid")
			private String externalUserid;

			@JsonProperty("watch_time")
			private int watchTime;

			@JsonProperty("name")
			private String name;

			@JsonProperty("is_comment")
			private int isComment;

			@JsonProperty("type")
			private int type;

			@JsonProperty("is_mic")
			private int isMic;
		}
	}
}