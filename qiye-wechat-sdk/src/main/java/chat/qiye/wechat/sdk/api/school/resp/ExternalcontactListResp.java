package chat.qiye.wechat.sdk.api.school.resp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ExternalcontactListResp extends RespStatus implements Serializable {

    @JsonProperty("external_userid")
    private List<String> externalUserid = new ArrayList<>();
}
