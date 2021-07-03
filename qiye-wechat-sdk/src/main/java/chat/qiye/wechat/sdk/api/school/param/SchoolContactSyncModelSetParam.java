package chat.qiye.wechat.sdk.api.school.param;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/3
 */
@NoArgsConstructor
@Data
public class SchoolContactSyncModelSetParam {

  /**
   * archSyncMode
   */
  @JsonProperty("arch_sync_mode")
  private Integer archSyncMode;
}
