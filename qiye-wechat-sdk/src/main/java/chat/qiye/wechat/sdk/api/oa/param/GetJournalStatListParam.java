package chat.qiye.wechat.sdk.api.oa.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetJournalStatListParam{

	@JsonProperty("endtime")
	private Integer endtime;

	@JsonProperty("template_id")
	private String templateId;

	@JsonProperty("starttime")
	private Integer starttime;
}