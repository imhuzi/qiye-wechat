package chat.qiye.wechat.sdk.api.oa.oa.checkin.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExceptionInfosItem{

	@JsonProperty("duration")
	private int duration;

	@JsonProperty("exception")
	private int exception;

	@JsonProperty("count")
	private int count;
}