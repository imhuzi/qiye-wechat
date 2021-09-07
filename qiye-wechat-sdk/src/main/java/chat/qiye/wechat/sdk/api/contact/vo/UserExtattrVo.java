package chat.qiye.wechat.sdk.api.contact.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/5/29
 */
@Data
public class UserExtattrVo {
  @JsonProperty("attrs")
  private List<UserExtattrItemVo> attrs;
}
