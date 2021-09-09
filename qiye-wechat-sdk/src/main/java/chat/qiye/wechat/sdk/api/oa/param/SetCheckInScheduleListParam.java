package chat.qiye.wechat.sdk.api.oa.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class SetCheckInScheduleListParam {

	@JsonProperty("groupid")
	private int groupid;

	@JsonProperty("yearmonth")
	private int yearmonth;

	@JsonProperty("items")
	private List<ItemsItem> items;

    public static class ItemsItem{

        @JsonProperty("userid")
        private String userid;

        @JsonProperty("day")
        private int day;

        @JsonProperty("schedule_id")
        private int scheduleId;
    }
}