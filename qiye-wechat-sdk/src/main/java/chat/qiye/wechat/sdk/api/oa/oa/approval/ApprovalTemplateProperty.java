package chat.qiye.wechat.sdk.api.oa.oa.approval;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ApprovalTemplateProperty {

	@JsonProperty("un_print")
	private int unPrint;

	@JsonProperty("control")
	private String control;

	@JsonProperty("require")
	private int require;

	@JsonProperty("id")
	private String id;

	@JsonProperty("placeholder")
	private List<PlaceholderItem> placeholder;

	@JsonProperty("title")
	private List<TitleItem> title;

	@Data
	public static class PlaceholderItem{

		@JsonProperty("text")
		private String text;

		@JsonProperty("lang")
		private String lang;
	}
}