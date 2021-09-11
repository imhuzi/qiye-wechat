package chat.qiye.wechat.sdk.api.wedrive.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeDriveSpaceSettingParam{

	@JsonProperty("share_url_no_approve_default_auth")
	private int shareUrlNoApproveDefaultAuth;

	@JsonProperty("spaceid")
	private String spaceid;

	@JsonProperty("enable_watermark")
	private boolean enableWatermark;

	@JsonProperty("share_url_no_approve")
	private boolean shareUrlNoApprove;

	@JsonProperty("add_member_only_admin")
	private boolean addMemberOnlyAdmin;

	@JsonProperty("userid")
	private String userid;

	@JsonProperty("enable_share_url")
	private boolean enableShareUrl;
}