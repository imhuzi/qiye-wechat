package chat.qiye.wechat.sdk.api.customer.resp;

import chat.qiye.wechat.sdk.api.customer.dto.ExternalContactDto;
import chat.qiye.wechat.sdk.api.customer.dto.FollowUserDto;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.api.contact.vo.UserExternalProfile;

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
public class CustomerBatchResp extends RespStatus implements Serializable {

    @JsonProperty("next_cursor")
    private String nextCursor;

    @JsonProperty("external_contact_list")
    private List<ExternalContactItem> externalContactList;

    @Data
    public static class ExternalContactItem {

        @JsonProperty("external_contact")
        private ExternalContactDto externalContact;

        @JsonProperty("follow_info")
        private FollowUserDto followInfo;
    }

}
