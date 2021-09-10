package chat.qiye.wechat.sdk.api.live.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class GetLivingShareInfoResp extends RespStatus {

	@JsonProperty("livingid")
	private String livingid;

	@JsonProperty("viewer_external_userid")
	private String viewerExternalUserid;

	@JsonProperty("viewer_userid")
	private String viewerUserid;

	@JsonProperty("invitor_external_userid")
	private String invitorExternalUserid;

	@JsonProperty("invitor_userid")
	private String invitorUserid;
}