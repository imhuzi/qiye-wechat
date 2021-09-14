package chat.qiye.wechat.sdk.api.app.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DataTemplateItem {

	@JsonProperty("pagepath")
	private String pagepath;

	@JsonProperty("jump_url")
	private String jumpUrl;

	@JsonProperty("url")
	private String url;

	@JsonProperty("key")
	private String key;

	@JsonProperty("data")
	private String data;



}