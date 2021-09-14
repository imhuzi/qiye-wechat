package chat.qiye.wechat.sdk.api.oa.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PstnccCallResp extends RespStatus {

	@JsonProperty("states")
	private List<StatesItem> states;

	@Data
	public static class StatesItem{

		@JsonProperty("callid")
		private String callid;

		@JsonProperty("code")
		private Integer code;

		@JsonProperty("userid")
		private String userid;
	}
}