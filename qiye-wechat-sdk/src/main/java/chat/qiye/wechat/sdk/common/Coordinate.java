package chat.qiye.wechat.sdk.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Coordinate{

	@JsonProperty("latitude")
	private String latitude;

	@JsonProperty("longitude")
	private String longitude;
}