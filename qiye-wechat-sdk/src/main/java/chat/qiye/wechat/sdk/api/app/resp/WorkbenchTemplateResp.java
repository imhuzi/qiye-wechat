package chat.qiye.wechat.sdk.api.app.resp;

import chat.qiye.wechat.sdk.api.app.vo.DataTemplateItem;
import chat.qiye.wechat.sdk.api.app.vo.DataTemplateItemList;
import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/8
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class WorkbenchTemplateResp extends RespStatus {
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
