package chat.qiye.wechat.sdk.api.oa.param;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import chat.qiye.wechat.sdk.api.oa.vo.UserIdItem;
import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/10
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ScheduleSaveAttendeesParam extends RespStatus {
    @JsonProperty("schedule_id")
    private String scheduleId;

    @JsonProperty("attendees")
    private List<UserIdItem> attendees;
}
