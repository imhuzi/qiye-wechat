package chat.qiye.wechat.sdk.api.customer.resp;

import chat.qiye.wechat.sdk.common.RespStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class CustomerGroupResp extends RespStatus implements Serializable {

    @JsonProperty("group_chat")
    private GroupChat groupChat;

    @Data
    public static class GroupChat {

        @JsonProperty("chat_id")
        private String chatId;

        private String name;

        private String owner;

        private String notice;

        @JsonProperty("create_time")
        private Long chatCreatetime;

        @JsonProperty("member_list")
        private List<MemberListItem> memberList = new ArrayList<>();

        @JsonProperty("admin_list")
        private List<UserItem> adminList = new ArrayList<>();

    }


    @Data
    public static class MemberListItem {
        @JsonProperty("userid")
        private String userId;

        @JsonProperty("unionid")
        private String unionId;

        @JsonProperty("join_time")
        private Long joinTime;

        @JsonProperty("join_scene")
        private Long joinScene;

        @JsonProperty("group_nickname")
        private String groupNickname;

        @JsonProperty("name")
        private String name;

        private Integer type;

        private UserItem invitor;
    }


    @Data
    public static class UserItem {
        @JsonProperty("userid")
        private String userId;
    }


}
