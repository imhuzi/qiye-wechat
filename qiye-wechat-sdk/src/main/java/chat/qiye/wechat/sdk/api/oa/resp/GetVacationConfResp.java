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
		private Integer perdayDuration;

		@JsonProperty("time_attr")
		private Integer timeAttr;

		@JsonProperty("duration_type")
		private Integer durationType;

		@JsonProperty("name")
		private String name;

		@JsonProperty("id")
		private Integer id;

		@JsonProperty("quota_attr")
		private QuotaAttr quotaAttr;

		@Data
		public static class QuotaAttr{

			@JsonProperty("autoreset_duration")
			private Integer autoresetDuration;

			@JsonProperty("autoreset_time")
			private Integer autoresetTime;

			@JsonProperty("type")
			private Integer type;
		}
	}
}