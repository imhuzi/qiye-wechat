package chat.qiye.wechat.sdk.api.oa.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PstnccCallParam{

	@JsonProperty("callee_userid")
	private List<String> calleeUserid;
}