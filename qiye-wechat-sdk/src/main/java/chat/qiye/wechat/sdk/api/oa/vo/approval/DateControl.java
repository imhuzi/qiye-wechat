package chat.qiye.wechat.sdk.api.oa.vo.approval;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/9
 */
@Data
public class DateControl {

    public static final String TYPE_DAY = "day";
    public static final String TYPE_HOUR = "hour";

    /**
     * 时间展示类型：day-日期；hour-日期+时间
     */
    @JsonProperty("type")
    private String type;
}
