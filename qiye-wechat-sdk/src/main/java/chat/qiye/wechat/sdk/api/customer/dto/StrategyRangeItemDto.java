package chat.qiye.wechat.sdk.api.customer.dto;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/3/8
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class StrategyRangeItemDto extends RespStatus implements Serializable {
    @JsonProperty("type")
    private int type;

    @JsonProperty("partyid")
    private int partyid;

    @JsonProperty("userid")
    private String userid;
}
