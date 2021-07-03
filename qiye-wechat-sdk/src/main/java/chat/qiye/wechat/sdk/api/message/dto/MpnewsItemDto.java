package chat.qiye.wechat.sdk.api.message.dto;

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
public class MpnewsItemDto {
  /**
   * title
   */
  @JsonProperty("title")
  private String title;

  /**
   * thumbMediaId
   */
  @JsonProperty("thumb_media_id")
  private String thumbMediaId;

  /**
   * author
   */
  @JsonProperty("author")
  private String author;

  /**
   * contentSourceUrl
   */
  @JsonProperty("content_source_url")
  private String contentSourceUrl;

  /**
   * content
   */
  @JsonProperty("content")
  private String content;

  /**
   * digest
   */
  @JsonProperty("digest")
  private String digest;
}
