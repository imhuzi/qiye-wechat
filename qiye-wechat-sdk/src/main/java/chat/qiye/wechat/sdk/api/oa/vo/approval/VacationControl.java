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
public class VacationControl {

    @JsonProperty("item")
    private List<Item> item;

    @Data
    public static class Item {

        @JsonProperty("id")
        private Integer id;

        @JsonProperty("name")
        private List<TitleItem> name;

    }

}
