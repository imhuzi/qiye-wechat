package chat.qiye.wechat.sdk.api.customer.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TagGroupStrategyItem extends TagGroupDto implements Serializable {
    private int strategyId;
}