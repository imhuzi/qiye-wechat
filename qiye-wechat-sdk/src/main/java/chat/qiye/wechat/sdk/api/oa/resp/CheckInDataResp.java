package chat.qiye.wechat.sdk.api.oa.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class CheckInDataResp extends RespStatus {

    @JsonProperty("checkindata")
    private List<CheckindataItem> checkindata;

    @Data
    public static class CheckindataItem {

        @JsonProperty("checkin_time")
        private int checkinTime;

        @JsonProperty("wifiname")
        private String wifiname;

        @JsonProperty("notes")
        private String notes;

        @JsonProperty("lng")
        private int lng;

        @JsonProperty("location_detail")
        private String locationDetail;

        @JsonProperty("groupid")
        private int groupid;

        @JsonProperty("userid")
        private String userid;

        @JsonProperty("groupname")
        private String groupname;

        @JsonProperty("deviceid")
        private String deviceid;

        @JsonProperty("checkin_type")
        private String checkinType;

        @JsonProperty("exception_type")
        private String exceptionType;

        @JsonProperty("location_title")
        private String locationTitle;

        @JsonProperty("wifimac")
        private String wifimac;

        @JsonProperty("mediaids")
        private List<String> mediaids;

        @JsonProperty("timeline_id")
        private int timelineId;

        @JsonProperty("schedule_id")
        private int scheduleId;

        @JsonProperty("lat")
        private int lat;

        @JsonProperty("sch_checkin_time")
        private int schCheckinTime;
    }
}