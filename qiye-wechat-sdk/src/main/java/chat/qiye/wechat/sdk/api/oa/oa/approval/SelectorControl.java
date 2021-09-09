package chat.qiye.wechat.sdk.api.oa.oa.approval;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class SelectorControl {

    public static final String TYPE_SINGLE = "single";
    public static final String TYPE_MULTI = "multi";


    @JsonProperty("options")
    private List<OptionsItem> options;

    @JsonProperty("type")
    private String type;

    @JsonProperty("exp_type")
    private int expType;

    @Data
    public static class OptionsItem {

        @JsonProperty("value")
        private List<ValueItem> value;

        @JsonProperty("key")
        private String key;
    }

    @Data
    public static class ValueItem {

        @JsonProperty("text")
        private String text;

        @JsonProperty("lang")
        private String lang;
    }
}