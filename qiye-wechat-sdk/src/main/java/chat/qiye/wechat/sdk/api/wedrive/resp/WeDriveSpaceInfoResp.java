package chat.qiye.wechat.sdk.api.wedrive.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class WeDriveSpaceInfoResp extends RespStatus {

	@JsonProperty("space_info")
	private SpaceInfo spaceInfo;

	@Data
	public static class SpaceInfo {

		@JsonProperty("spaceid")
		private String spaceid;

		@JsonProperty("space_name")
		private String spaceName;

		@JsonProperty("auth_list")
		private AuthList authList;

		@Data
		public static class AuthList {

			@JsonProperty("auth_info")
			private List<AuthInfoItem> authInfo;

			@JsonProperty("quit_userid")
			private List<String> quitUserid;

			@Data
			public static class AuthInfoItem {

				@JsonProperty("auth")
				private Integer auth;

				@JsonProperty("departmentid")
				private String departmentid;

				@JsonProperty("type")
				private Integer type;

				@JsonProperty("userid")
				private String userid;
			}
		}
	}
}