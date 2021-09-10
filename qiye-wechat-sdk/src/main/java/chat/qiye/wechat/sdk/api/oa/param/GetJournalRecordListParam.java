package chat.qiye.wechat.sdk.api.oa.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class GetJournalRecordListParam{

	@JsonProperty("cursor")
	private Integer cursor;

	@JsonProperty("limit")
	private Integer limit;

	@JsonProperty("endtime")
	private Integer endtime;

	@JsonProperty("starttime")
	private Integer starttime;

	@JsonProperty("filters")
	private List<FiltersItem> filters;

	@Data
	public static class FiltersItem{

		@JsonProperty("value")
		private String value;

		@JsonProperty("key")
		private String key;
	}
}