package chat.qiye.wechat.sdk.api.oa.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class GetApprovalApplyNumListParam {

	@JsonProperty("cursor")
	private int cursor;

	@JsonProperty("size")
	private int size;

	@JsonProperty("endtime")
	private String endtime;

	@JsonProperty("starttime")
	private String starttime;

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