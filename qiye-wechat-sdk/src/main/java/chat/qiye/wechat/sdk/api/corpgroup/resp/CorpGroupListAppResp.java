package chat.qiye.wechat.sdk.api.corpgroup.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class CorpGroupListAppResp extends RespStatus {

	@JsonProperty("corp_list")
	private List<CorpListItem> corpList;
}