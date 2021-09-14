package chat.qiye.wechat.sdk.api.oa.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PublicTelPhoneGetDialRecordResp extends RespStatus {

	@JsonProperty("record")
	private List<RecordItem> record;

    @Data
    public static class RecordItem {

        @JsonProperty("caller")
        private Caller caller;

        @JsonProperty("total_duration")
        private int totalDuration;

        @JsonProperty("callee")
        private List<CalleeItem> callee;

        @JsonProperty("call_time")
        private int callTime;

        @JsonProperty("call_type")
        private int callType;

        @Data
        public static class Caller {

            @JsonProperty("duration")
            private int duration;

            @JsonProperty("userid")
            private String userid;
        }

        @Data
        public static class CalleeItem {

            @JsonProperty("duration")
            private int duration;

            @JsonProperty("userid")
            private String userid;

            @JsonProperty("phone")
            private int phone;
        }
    }
}