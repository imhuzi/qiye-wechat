package chat.qiye.wechat.sdk.api.customer.resp.strategy;

import chat.qiye.wechat.sdk.api.customer.dto.TagGroupStrategyItem;
import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class StrategyTagListResp extends RespStatus implements Serializable {
	private List<TagGroupStrategyItem> tagGroup;
}