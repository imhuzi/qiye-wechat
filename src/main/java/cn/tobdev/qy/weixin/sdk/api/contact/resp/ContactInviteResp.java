package cn.tobdev.qy.weixin.sdk.api.contact.resp;

import java.io.Serializable;
import java.util.List;

import cn.tobdev.qy.weixin.sdk.common.RespStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/5
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ContactInviteResp extends RespStatus implements Serializable {
  private List<String> invaliduser;
  private List<String> invalidparty;
  private List<String> invalidtag;
}
