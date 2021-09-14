package chat.qiye.wechat.sdk.api.oa.param;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PublicTelPhoneGetDialRecordParam{

	@JsonProperty("start_time")
	private int startTime;

	@JsonProperty("offset")
	private int offset;

	@JsonProperty("end_time")
	private int endTime;

	@JsonProperty("limit")
	private int limit;
}