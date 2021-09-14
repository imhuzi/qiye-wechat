package chat.qiye.wechat.sdk.api.oa.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class GetCheckInDataParam{

	@JsonProperty("useridlist")
	private List<String> useridlist;

	@JsonProperty("endtime")
	private Integer endtime;

	@JsonProperty("opencheckindatatype")
	private Integer opencheckindatatype;

	@JsonProperty("starttime")
	private Integer starttime;
}