package chat.qiye.wechat.sdk.api.contact.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class LinkedcorpUserSimplelistItem {

	@JsonProperty("corpid")
	private String corpid;

	@JsonProperty("name")
	private String name;

	@JsonProperty("department")
	private List<String> department;

	@JsonProperty("userid")
	private String userid;
}