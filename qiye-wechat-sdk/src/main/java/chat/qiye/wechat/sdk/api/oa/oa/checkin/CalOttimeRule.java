package chat.qiye.wechat.sdk.api.oa.oa.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CalOttimeRule{

	@JsonProperty("items")
	private List<ItemsItem> items;


	public static class ItemsItem{

		@JsonProperty("ot_time")
		private int otTime;

		@JsonProperty("rest_time")
		private int restTime;
	}
}