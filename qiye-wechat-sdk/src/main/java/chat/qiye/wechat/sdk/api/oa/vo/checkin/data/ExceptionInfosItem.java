package chat.qiye.wechat.sdk.api.oa.vo.checkin.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExceptionInfosItem{

	@JsonProperty("duration")
	private Integer duration;

	@JsonProperty("exception")
	private Integer exception;

	@JsonProperty("count")
	private Integer count;
}