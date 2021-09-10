package chat.qiye.wechat.sdk.api.oa.resp;

import chat.qiye.wechat.sdk.api.oa.oa.MeetingRoom;
import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/10
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MeetingRoomListResp extends RespStatus {

    @JsonProperty("meetingroom_list")
    private List<MeetingRoom> meetingroomList;
}
