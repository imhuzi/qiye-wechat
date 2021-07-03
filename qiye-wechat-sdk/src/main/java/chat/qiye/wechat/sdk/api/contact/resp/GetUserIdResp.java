package chat.qiye.wechat.sdk.api.contact.resp;

import java.io.Serializable;

import chat.qiye.wechat.sdk.common.RespStatus;
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
public class GetUserIdResp extends RespStatus implements Serializable {
  private String userid;
}
