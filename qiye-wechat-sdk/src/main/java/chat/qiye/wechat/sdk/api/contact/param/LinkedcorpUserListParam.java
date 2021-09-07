package chat.qiye.wechat.sdk.api.contact.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LinkedcorpUserListParam{

	@JsonProperty("fetch_child")
	private boolean fetchChild;

	@JsonProperty("department_id")
	private String departmentId;
}