package chat.qiye.wechat.sdk.api.customer.resp.strategy;

import java.io.Serializable;
import java.util.List;

import chat.qiye.wechat.sdk.api.customer.dto.StrategyRangeItemDto;
import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/3/8
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GetStrategyRangeResp extends RespStatus implements Serializable {


	@JsonProperty("next_cursor")
	private String nextCursor;


	@JsonProperty("range")
	private List<StrategyRangeItemDto> range;

}