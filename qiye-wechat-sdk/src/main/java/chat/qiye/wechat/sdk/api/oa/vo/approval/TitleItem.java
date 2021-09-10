package chat.qiye.wechat.sdk.api.oa.vo.approval;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/9
 */
@Data
public class TitleItem {
    @JsonProperty("text")
    private String text;

    @JsonProperty("lang")
    private String lang;
}
