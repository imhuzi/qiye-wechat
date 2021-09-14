package chat.qiye.wechat.sdk.api.oa.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class GetJournalRecordListResp extends RespStatus {

	@JsonProperty("next_cursor")
	private int nextCursor;

	@JsonProperty("journaluuid_list")
	private List<String> journaluuidList;

	@JsonProperty("endflag")
	private int endflag;
}