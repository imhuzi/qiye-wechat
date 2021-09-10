package chat.qiye.wechat.sdk.api.live.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class GetLivingCodeResp extends RespStatus {
	@JsonProperty("living_code")
	private String livingCode;
}