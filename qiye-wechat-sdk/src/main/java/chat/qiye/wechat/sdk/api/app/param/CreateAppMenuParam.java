package chat.qiye.wechat.sdk.api.app.param;

import chat.qiye.wechat.sdk.api.app.vo.ButtonItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CreateAppMenuParam {

	@JsonProperty("button")
	private List<ButtonItem> button;
}