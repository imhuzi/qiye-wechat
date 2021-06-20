package cn.tobdev.qy.weixin.sdk.api.contact.resp;

import java.io.Serializable;

import cn.tobdev.qy.weixin.sdk.common.RespStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TagCreateResp extends RespStatus implements Serializable {
  private Integer tagid;
}
