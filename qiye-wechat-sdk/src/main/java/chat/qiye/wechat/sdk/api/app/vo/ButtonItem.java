package chat.qiye.wechat.sdk.api.app.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ButtonItem{

	@JsonProperty("name")
	private String name;

	@JsonProperty("sub_button")
	private List<SubButtonItem> subButton;

	@JsonProperty("type")
	private String type;

	@JsonProperty("key")
	private String key;
}