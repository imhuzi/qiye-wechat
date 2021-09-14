package chat.qiye.wechat.sdk.api.oa.vo;

import chat.qiye.wechat.sdk.common.Coordinate;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class MeetingRoom {

    @JsonProperty("meetingroom_id")
    private Integer meetingroomId;


    @JsonProperty("coordinate")
    private Coordinate coordinate;

    @JsonProperty("city")
    private String city;

    @JsonProperty("name")
    private String name;
    /**
     * 支持 的设备类型
     * {@link  MeetingRoomEquipment}
     */
    @JsonProperty("equipment")
    private List<Integer> equipment;

    @JsonProperty("floor")
    private String floor;

    @JsonProperty("building")
    private String building;

    @JsonProperty("capacity")
    private Integer capacity;

    @JsonProperty("need_approval")
    private Integer needApproval;
}