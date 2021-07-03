package chat.qiye.wechat.sdk.common.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/29
 */
@NoArgsConstructor
@Data
public class FileDto implements Serializable {
  /**
   * mediaId
   */
  @JsonProperty("media_id")
  private String mediaId;
}
