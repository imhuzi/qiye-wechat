package chat.qiye.wechat.sdk.api.oa.oa.checkin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/8
 */
@Data
public class UserCheckInRuleItem {

    @JsonProperty("userid")
    private String userid;

    @JsonProperty("group")
    private List<CheckInRuleGroupItem> group;

}
