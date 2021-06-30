package cn.tobdev.qy.weixin.sdk.api.message.dto.school;

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
   * pagepath
   */
  @JsonProperty("pagepath")
  private String pagepath;
}
