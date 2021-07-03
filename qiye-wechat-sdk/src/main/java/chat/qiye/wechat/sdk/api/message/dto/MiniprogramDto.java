package chat.qiye.wechat.sdk.api.message.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/1
 */
@NoArgsConstructor
@Data
public class MiniprogramDto {

  /**
   * appid
   */
  @JsonProperty("appid")
  private String appid;

  /**
   * page
   */
  @JsonProperty("page")
  private String page;

  /**
   * title
   */
  @JsonProperty("title")
  private String title;

  /**
   * description
   */
  @JsonProperty("description")
  private String description;

  /**
   * emphasisFirstItem
   */
  @JsonProperty("emphasis_first_item")
  private Boolean emphasisFirstItem;

  /**
   * contentItem
   */
  @JsonProperty("content_item")
  private List<MiniprogramContentItemDto> contentItem;
}
