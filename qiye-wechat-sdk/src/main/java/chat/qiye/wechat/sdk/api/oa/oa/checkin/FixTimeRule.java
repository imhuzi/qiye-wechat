package chat.qiye.wechat.sdk.api.oa.oa.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FixTimeRule{

	@JsonProperty("fix_time_begin_sec")
	private int fixTimeBeginSec;

	@JsonProperty("fix_time_end_sec")
	private int fixTimeEndSec;
}