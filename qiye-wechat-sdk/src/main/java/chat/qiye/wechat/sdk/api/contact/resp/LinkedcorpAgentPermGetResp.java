package chat.qiye.wechat.sdk.api.contact.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class LinkedcorpAgentPermGetResp extends RespStatus {

	@JsonProperty("userids")
	private List<String> userids;

	@JsonProperty("department_ids")
	private List<String> departmentIds;
}