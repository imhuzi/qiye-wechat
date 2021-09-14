package chat.qiye.wechat.sdk.api.oa.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class MeetingGetUserMeetingResp extends RespStatus {

	@JsonProperty("next_cursor")
	private String nextCursor;

	@JsonProperty("meetingid_list")
	private List<String> meetingidList;
}