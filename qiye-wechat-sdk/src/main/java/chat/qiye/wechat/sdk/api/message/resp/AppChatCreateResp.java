package chat.qiye.wechat.sdk.api.message.resp;

import java.io.Serializable;

import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/1
 */
@Getter
@Setter
@ToString
public class AppChatCreateResp extends RespStatus implements Serializable {

  private String chatid;
}
