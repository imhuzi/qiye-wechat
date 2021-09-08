package chat.qiye.wechat.sdk.api.app.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WorkbenchTemplate {

    @JsonProperty("type")
    private String type;

    @JsonProperty("image")
    private DataTemplateItem image;


    @JsonProperty("webview")
    private DataTemplateItem webview;

    @JsonProperty("keydata")
    private DataTemplateItemList keydata;

    @JsonProperty("list")
    private DataTemplateItemList list;

    @JsonProperty("agentid")
    private int agentid;

    @JsonProperty("replace_user_data")
    private boolean replaceUserData;


}