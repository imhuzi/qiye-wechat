package chat.qiye.wechat.sdk.api.customer.param;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/30
 */
@NoArgsConstructor
@Data
public class CustomerTagGetParam {

  /**
   * tagId
   */
  @JsonProperty("tag_id")
  private List<String> tagId;

  /**
   * groupId
   */
  @JsonProperty("group_id")
  private List<String> groupId;
}
