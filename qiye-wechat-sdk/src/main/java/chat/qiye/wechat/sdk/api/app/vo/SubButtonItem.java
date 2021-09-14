package chat.qiye.wechat.sdk.api.app.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SubButtonItem {

    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private String type;

    @JsonProperty("key")
    private String key;

    @JsonProperty("pagepath")
    private String pagepath;

    @JsonProperty("appid")
    private String appid;


    @JsonProperty("url")
    private String url;
}