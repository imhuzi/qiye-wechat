package chat.qiye.wechat.sdk.api.contact.resp;

import chat.qiye.wechat.sdk.api.contact.vo.LinkedcorpUserInfo;
import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class LinkedcorpUserGetResp extends RespStatus {

	@JsonProperty("user_info")
	private LinkedcorpUserInfo userInfo;
}