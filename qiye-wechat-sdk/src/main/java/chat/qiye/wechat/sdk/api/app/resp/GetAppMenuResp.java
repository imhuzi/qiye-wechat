package chat.qiye.wechat.sdk.api.app.resp;

import chat.qiye.wechat.sdk.api.app.vo.ButtonItem;
import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class GetAppMenuResp extends RespStatus {

	@JsonProperty("button")
	private List<ButtonItem> button;
}