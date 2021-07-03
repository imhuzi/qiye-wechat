package chat.qiye.wechat.sdk.api.contact.resp;


import java.io.Serializable;
import java.util.List;


import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.api.contact.vo.ContactDeptVo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ContactDeptListResp extends RespStatus implements Serializable {
    /**
     * 部门列表
     */
    private List<ContactDeptVo> department;
}
