package chat.qiye.wechat.sdk.api.corpgroup.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/8
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CorpGroupMiniProgramSessionResp extends RespStatus {

    private String userid;

    @JsonProperty("session_key")
    private String sessionKey;
}
