package chat.qiye.wechat.sdk.api.oa.oa.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LocInfosItem{

	@JsonProperty("loc_title")
	private String locTitle;

	@JsonProperty("lng")
	private int lng;

	@JsonProperty("distance")
	private int distance;

	@JsonProperty("loc_detail")
	private String locDetail;

	@JsonProperty("lat")
	private int lat;
}