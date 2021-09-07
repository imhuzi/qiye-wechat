package chat.qiye.wechat.sdk.api.contact.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ExportDataItemVo{

	@JsonProperty("size")
	private String size;

	@JsonProperty("url")
	private String url;

	@JsonProperty("md5")
	private String md5;
}