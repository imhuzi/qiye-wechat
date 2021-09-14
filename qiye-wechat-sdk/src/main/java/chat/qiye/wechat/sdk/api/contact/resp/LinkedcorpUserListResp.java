package chat.qiye.wechat.sdk.api.contact.resp;

import chat.qiye.wechat.sdk.api.contact.vo.LinkedcorpUserInfo;
import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/7
 */
public class LinkedcorpUserListResp extends RespStatus {

    @JsonProperty("userlist")
    private List<LinkedcorpUserInfo> userlist;

}
