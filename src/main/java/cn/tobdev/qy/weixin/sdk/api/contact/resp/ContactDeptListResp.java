package cn.tobdev.qy.weixin.sdk.api.contact.resp;


import java.io.Serializable;
import java.util.List;


import cn.tobdev.qy.weixin.sdk.api.contact.vo.ContactDeptVo;
import cn.tobdev.qy.weixin.sdk.common.BaseResp;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ContactDeptListResp extends BaseResp implements Serializable {
    /**
     * 部门列表
     */
    private List<ContactDeptVo> department;
}
