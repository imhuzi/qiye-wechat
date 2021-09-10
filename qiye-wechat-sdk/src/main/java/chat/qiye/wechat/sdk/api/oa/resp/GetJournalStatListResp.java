package chat.qiye.wechat.sdk.api.oa.resp;

import chat.qiye.wechat.sdk.api.oa.oa.DeptIdItem;
import chat.qiye.wechat.sdk.api.oa.oa.UserIdItem;
import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class GetJournalStatListResp extends RespStatus {

	@JsonProperty("stat_list")
	private List<StatListItem> statList;

    @Data
    public static class StatListItem{

        @JsonProperty("cycle_end_time")
        private int cycleEndTime;

        @JsonProperty("unreport_list")
        private List<ReportListItem> unreportList;

        @JsonProperty("template_name")
        private String templateName;

        @JsonProperty("white_range")
        private WhiteRange whiteRange;

        @JsonProperty("stat_begin_time")
        private int statBeginTime;

        @JsonProperty("report_list")
        private List<ReportListItem> reportList;

        @JsonProperty("cycle_begin_time")
        private int cycleBeginTime;

        @JsonProperty("stat_end_time")
        private int statEndTime;

        @JsonProperty("receivers")
        private Receivers receivers;

        @JsonProperty("template_id")
        private String templateId;

        @JsonProperty("report_type")
        private int reportType;

        @JsonProperty("report_range")
        private ReportRange reportRange;

        @Data
        public static class WhiteRange{

            @JsonProperty("tag_list")
            private List<Object> tagList;

            @JsonProperty("party_list")
            private List<Object> partyList;

            @JsonProperty("user_list")
            private List<Object> userList;
        }

        @Data
        public static class ReportRange{

            @JsonProperty("tag_list")
            private List<Object> tagList;

            @JsonProperty("party_list")
            private List<DeptIdItem> partyList;

            @JsonProperty("user_list")
            private List<UserIdItem> userList;
        }

        @Data
        public static class Receivers{

            @JsonProperty("tag_list")
            private List<Object> tagList;

            @JsonProperty("leader_list")
            private List<Object> leaderList;

            @JsonProperty("user_list")
            private List<UserIdItem> userList;
        }

        @Data
        public static class ReportListItem{

            @JsonProperty("itemlist")
            private List<ItemlistItem> itemlist;

            @JsonProperty("user")
            private UserIdItem user;

            @Data
            public static class ItemlistItem{

                @JsonProperty("journaluuid")
                private String journaluuid;

                @JsonProperty("flag")
                private int flag;

                @JsonProperty("reporttime")
                private int reporttime;
            }
        }
    }
}