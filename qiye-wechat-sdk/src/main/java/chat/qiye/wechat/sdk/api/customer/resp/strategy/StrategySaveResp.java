package chat.qiye.wechat.sdk.api.customer.resp.strategy;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/3/8
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class StrategySaveResp extends RespStatus implements Serializable {


    @JsonProperty("strategy_id")
    private int strategyId;

}