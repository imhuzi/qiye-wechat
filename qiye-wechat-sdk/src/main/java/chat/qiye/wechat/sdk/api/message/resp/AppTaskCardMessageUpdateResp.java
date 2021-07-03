package chat.qiye.wechat.sdk.api.message.resp;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class AppTaskCardMessageUpdateResp extends RespStatus implements Serializable {

  /**
   * invaliduser
   */
  @JsonProperty("invaliduser")
  private List<String> invaliduser;
}
