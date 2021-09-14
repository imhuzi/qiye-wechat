package chat.qiye.wechat.sdk.api.live.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
public class LivingDetailResp extends RespStatus {

    @JsonProperty("living_info")
    private LivingInfo livingInfo;

    public static class LivingInfo {

        @JsonProperty("comment_num")
        private Integer commentNum;

        @JsonProperty("status ")
        private Integer status;

        @JsonProperty("description")
        private String description;

        @JsonProperty("main_department")
        private Integer mainDepartment;

        @JsonProperty("type")
        private Integer type;

        @JsonProperty("viewer_num")
        private Integer viewerNum;

        @JsonProperty("living_duration")
        private Integer livingDuration;

        @JsonProperty("online_count")
        private Integer onlineCount;

        @JsonProperty("open_replay")
        private Integer openReplay;

        @JsonProperty("reserve_living_duration")
        private Integer reserveLivingDuration;

        @JsonProperty("living_start")
        private Integer livingStart;

        @JsonProperty("replay_status")
        private Integer replayStatus;

        @JsonProperty("theme")
        private String theme;

        @JsonProperty("reserve_start")
        private Integer reserveStart;

        @JsonProperty("mic_num")
        private Integer micNum;

        @JsonProperty("push_stream_url")
        private String pushStreamUrl;

        @JsonProperty("subscribe_count")
        private Integer subscribeCount;

        @JsonProperty("anchor_userid")
        private String anchorUserid;
    }
}