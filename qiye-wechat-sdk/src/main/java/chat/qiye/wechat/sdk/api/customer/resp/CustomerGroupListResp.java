package chat.qiye.wechat.sdk.api.customer.resp;

import chat.qiye.wechat.sdk.common.RespStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
public class CustomerGroupListResp extends RespStatus implements Serializable {

    @JsonProperty("group_chat_list")
    private List<GroupChatItem> groupChatList;

    @JsonProperty("next_cursor")
    private String nextCursor;

    @Data
    public static class GroupChatItem {
        @JsonProperty("chat_id")
        private String chatId;

        private Integer status;
    }
}
