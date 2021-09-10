package chat.qiye.wechat.sdk.api.oa.param;

import chat.qiye.wechat.sdk.api.oa.oa.MeetingRoomEquipment;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/10
 */
@Data
public class MeetingRoomListParam {

    @JsonProperty("city")
    private String city;

    @JsonProperty("floor")
    private String floor;

    @JsonProperty("building")
    private String building;
    /**
     * 支持 的设备类型
     * {@link  MeetingRoomEquipment}
     */
    @JsonProperty("equipment")
    private List<Integer> equipment;

}
