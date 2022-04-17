package chat.qiye.wechat.sdk.api.contact.resp;


import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import chat.qiye.wechat.sdk.api.contact.vo.ContactDeptVo;
import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ContactDeptSimpleListResp extends RespStatus implements Serializable {
    /**
     * 部门列表
     */
    @JsonProperty("department_id")
    private List<ContactDeptVo> departmentId;


}
