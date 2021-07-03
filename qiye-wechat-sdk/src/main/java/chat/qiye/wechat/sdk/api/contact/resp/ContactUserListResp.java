package chat.qiye.wechat.sdk.api.contact.resp;


import java.io.Serializable;
import java.util.List;

import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ContactUserListResp extends RespStatus implements Serializable {
    /**
     * 用户列表
     */
    private List<ContactUserGetResp> userlist;
}
