package chat.qiye.wechat.sdk.api.contact.resp;

import java.io.Serializable;
import java.util.List;

import chat.qiye.wechat.sdk.api.contact.vo.ContactDeptDetailVo;
import chat.qiye.wechat.sdk.api.contact.vo.ContactDeptVo;
import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2022/4/17
 */
@Getter
@Setter
@ToString
public class ContactDeptDetailResp extends RespStatus implements Serializable {
  private List<ContactDeptDetailVo> department;
}
