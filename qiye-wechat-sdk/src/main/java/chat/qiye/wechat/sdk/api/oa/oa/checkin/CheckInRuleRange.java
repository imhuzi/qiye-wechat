package chat.qiye.wechat.sdk.api.oa.oa.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CheckInRuleRange {

	@JsonProperty("tagid")
	private List<Integer> tagid;

	@JsonProperty("partyid")
	private List<Integer> partyid;

	@JsonProperty("userid")
	private List<String> userid;
}