package chat.qiye.wechat.sdk.api.app.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class DataTemplateItemList {

    @JsonProperty("items")
    private List<DataTemplateItem> items;

}