package chat.qiye.wechat.sdk.api.contact.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ExportContactParam {

	@JsonProperty("encoding_aeskey")
	private String encodingAeskey;

	@JsonProperty("block_size")
	private int blockSize;
}