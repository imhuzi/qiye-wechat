package chat.qiye.wechat.sdk.api.oa.vo.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Reporterinfo{

	@JsonProperty("reporters")
	private List<ReportersItem> reporters;

	@JsonProperty("updatetime")
	private Integer updatetime;
}