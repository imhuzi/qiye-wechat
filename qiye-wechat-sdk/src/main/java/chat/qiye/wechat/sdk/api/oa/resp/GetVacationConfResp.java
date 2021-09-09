package chat.qiye.wechat.sdk.api.oa.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class GetVacationConfResp{

	@JsonProperty("lists")
	private List<ListsItem> lists;

	@Data
	public static class ListsItem{

		@JsonProperty("perday_duration")
		private int perdayDuration;

		@JsonProperty("time_attr")
		private int timeAttr;

		@JsonProperty("duration_type")
		private int durationType;

		@JsonProperty("name")
		private String name;

		@JsonProperty("id")
		private int id;

		@JsonProperty("quota_attr")
		private QuotaAttr quotaAttr;

		@Data
		public static class QuotaAttr{

			@JsonProperty("autoreset_duration")
			private int autoresetDuration;

			@JsonProperty("autoreset_time")
			private int autoresetTime;

			@JsonProperty("type")
			private int type;
		}
	}
}