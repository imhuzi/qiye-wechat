package cn.tobdev.qy.weixin.sdk.common.dto;

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
public class TextCardDto {

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
   * btntxt
   */
  @JsonProperty("btntxt")
  private String btntxt;
}
