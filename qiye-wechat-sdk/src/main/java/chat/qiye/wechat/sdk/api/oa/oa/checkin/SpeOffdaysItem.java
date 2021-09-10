package chat.qiye.wechat.sdk.api.oa.oa.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class SpeOffdaysItem{

	@JsonProperty("notes")
	private String notes;

	@JsonProperty("checkintime")
	private List<Object> checkintime;

	@JsonProperty("timestamp")
	private Integer timestamp;
}