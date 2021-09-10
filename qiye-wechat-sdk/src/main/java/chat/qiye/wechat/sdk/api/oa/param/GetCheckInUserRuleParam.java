package chat.qiye.wechat.sdk.api.oa.param;

import lombok.Data;

import java.util.List;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/8
 */
@Data
public class GetCheckInUserRuleParam {
    private Integereger datetime;
    private List<String> useridlist;
}
