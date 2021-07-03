package chat.qiye.wechat.sdk.api.contact.resp;

import java.io.Serializable;

import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TagCreateResp extends RespStatus implements Serializable {
  private Integer tagid;
}
