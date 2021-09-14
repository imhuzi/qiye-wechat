package chat.qiye.wechat.sdk.api.contact.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CallbackVo {

	@JsonProperty("encodingaeskey")
	private String encodingaeskey;

	@JsonProperty("url")
	private String url;

	@JsonProperty("token")
	private String token;
}