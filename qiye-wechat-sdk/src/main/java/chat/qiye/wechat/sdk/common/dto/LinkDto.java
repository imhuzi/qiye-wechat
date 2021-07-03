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
public class LinkDto implements Serializable {
  /**
   * title
   */
  @JsonProperty("title")
  private String title;

  /**
   * picurl
   */
  @JsonProperty("picurl")
  private String picurl;

  /**
   * desc
   */
  @JsonProperty("desc")
  private String desc;

  /**
   * url
   */
  @JsonProperty("url")
  private String url;
}
