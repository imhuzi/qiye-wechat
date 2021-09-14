package chat.qiye.wechat.sdk.api.oa.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetJournalDetailParam{

	@JsonProperty("journaluuid")
	private String journaluuid;
}