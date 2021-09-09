package chat.qiye.wechat.sdk.api.oa.oa.approval;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/9
 */
@Data
public class AttendanceControl {

    public static final String DATE_RANGE_TYPE_HALFDAY = "halfday";
    public static final String DATE_RANGE_TYPE_HOUR = "hour";

    public static final int TYPE_LEAVE = 1;
    public static final int TYPE_EVECTION = 3;
    public static final int TYPE_GO_OUT = 4;
    public static final int TYPE_OVERTIME = 5;


    @JsonProperty("date_range")
    private DateRange dateRange;

    // 1-请假，3-出差，4-外出，5-加班
    private int type;


    @Data
    public static class DateRange {
        private String type;
    }
}
