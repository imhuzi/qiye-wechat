package chat.qiye.wechat.sdk.api.customer.param.strategy;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;


/**
 * 获取规则详情 参数
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2022/3/8
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class StrategyTagParam extends StrategyIdParam implements Serializable {

    @JsonProperty("tag_id")
    private String[] tagId;

    @JsonProperty("group_id")
    private String[] groupId;

}