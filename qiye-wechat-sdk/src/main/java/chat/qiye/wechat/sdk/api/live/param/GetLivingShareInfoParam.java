package chat.qiye.wechat.sdk.api.live.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetLivingShareInfoParam {

	@JsonProperty("ww_share_code")
	private String wwShareCode;
}