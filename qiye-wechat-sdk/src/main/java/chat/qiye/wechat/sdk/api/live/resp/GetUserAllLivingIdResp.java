package chat.qiye.wechat.sdk.api.live.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class GetUserAllLivingIdResp extends RespStatus {

    @JsonProperty("next_cursor")
    private String nextCursor;

    @JsonProperty("livingid_list")
    private List<String> livingidList;
}