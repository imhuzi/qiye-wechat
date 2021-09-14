package chat.qiye.wechat.sdk.api.oa.resp;

import chat.qiye.wechat.sdk.api.oa.vo.checkin.UserCheckInRuleItem;
import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/8
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserCheckInRuleResp extends RespStatus {
    private List<UserCheckInRuleItem> info;
}
