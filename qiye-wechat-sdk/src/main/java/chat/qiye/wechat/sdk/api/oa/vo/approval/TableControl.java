package chat.qiye.wechat.sdk.api.oa.vo.approval;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/9
 */
@Data
public class TableControl {

    @JsonProperty("children")
    private List<ChildrenItem> children;


    @JsonProperty("stat_field")
    private List<Object> stat_field;


    @Data
    public static class ChildrenItem {

        @JsonProperty("property")
        private ApprovalTemplateProperty property;

    }

}
