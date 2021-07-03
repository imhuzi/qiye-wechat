package chat.qiye.wechat.sdk.api.customer.resp;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.api.customer.dto.TagGroupDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/30
 */
@Getter
@Setter
@ToString
public class CustomerTagGetResp extends RespStatus implements Serializable {

  /**
   * tagGroup
   */
  @JsonProperty("tag_group")
  private TagGroupDto tagGroup;
}
