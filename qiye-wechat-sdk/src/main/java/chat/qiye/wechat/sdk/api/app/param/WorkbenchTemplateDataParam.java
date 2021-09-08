package chat.qiye.wechat.sdk.api.app.param;

import chat.qiye.wechat.sdk.api.app.vo.DataTemplateItem;
import chat.qiye.wechat.sdk.api.app.vo.DataTemplateItemList;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WorkbenchTemplateDataParam {

    @JsonProperty("agentid")
    private int agentid;

    @JsonProperty("userid")
    private String userid;

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


}