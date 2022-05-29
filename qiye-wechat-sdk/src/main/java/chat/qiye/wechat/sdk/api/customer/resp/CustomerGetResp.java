package chat.qiye.wechat.sdk.api.customer.resp;

import chat.qiye.wechat.sdk.api.customer.dto.ExternalContactDto;
import chat.qiye.wechat.sdk.api.customer.dto.FollowUserDto;
import chat.qiye.wechat.sdk.common.RespStatus;

import com.fasterxml.jackson.annotation.JsonProperty;

import chat.qiye.wechat.sdk.common.dto.WechatChannelsDto;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class CustomerGetResp extends RespStatus implements Serializable {

    @JsonProperty("next_cursor")
    private String nextCursor;

    @JsonProperty("external_contact")
    private ExternalContactDto externalContact;

    @JsonProperty("follow_user")
    private List<FollowUserDto> followUser = new ArrayList<>();

}
