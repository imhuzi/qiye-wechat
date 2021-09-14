package chat.qiye.wechat.sdk.api.oa.vo.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WifimacInfosItem{

	@JsonProperty("wifiname")
	private String wifiname;

	@JsonProperty("wifimac")
	private String wifimac;
}