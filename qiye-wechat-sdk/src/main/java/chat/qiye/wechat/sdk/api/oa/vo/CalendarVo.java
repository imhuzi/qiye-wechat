package chat.qiye.wechat.sdk.api.oa.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CalendarVo {

    @JsonProperty("cal_id")
    private String calId;

    @JsonProperty("summary")
    private String summary;

    @JsonProperty("shares")
    private List<SharesItem> shares;

    @JsonProperty("readonly")
    private Integer readonly;

    @JsonProperty("set_as_default")
    private Integer setAsDefault;

    @JsonProperty("color")
    private String color;

    @JsonProperty("organizer")
    private String organizer;

    @JsonProperty("description")
    private String description;

    @Data
    public static class SharesItem{

        @JsonProperty("readonly")
        private Integer readonly;

        @JsonProperty("userid")
        private String userid;
    }
}