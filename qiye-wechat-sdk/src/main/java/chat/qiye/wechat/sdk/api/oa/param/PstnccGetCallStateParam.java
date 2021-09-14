package chat.qiye.wechat.sdk.api.oa.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PstnccGetCallStateParam{

	@JsonProperty("callid")
	private String callid;

	@JsonProperty("callee_userid")
	private String calleeUserid;
}