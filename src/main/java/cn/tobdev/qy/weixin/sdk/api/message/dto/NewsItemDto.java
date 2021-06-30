package cn.tobdev.qy.weixin.sdk.api.message.dto;

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
public class NewsItemDto {

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
   * url
   */
  @JsonProperty("url")
  private String url;

  /**
   * picurl
   */
  @JsonProperty("picurl")
  private String picurl;
}
