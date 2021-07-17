package chat.qiye.wechat.sdk.api.customer.param;

import com.fasterxml.jackson.annotation.JsonProperty;

import chat.qiye.wechat.sdk.common.dto.FileDto;
import chat.qiye.wechat.sdk.common.dto.ImageDto;
import chat.qiye.wechat.sdk.common.dto.TextDto;
import chat.qiye.wechat.sdk.common.dto.LinkDto;
import chat.qiye.wechat.sdk.common.dto.MiniprogramDto;
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
public class GroupWelcomeTemplateParam {

  /**
   * 模板id
   */
  @JsonProperty("template_id")
  private String templateId;

  /**
   * text
   */
  @JsonProperty("text")
  private TextDto text;

  /**
   * image
   */
  @JsonProperty("image")
  private ImageDto image;

  /**
   * link
   */
  @JsonProperty("link")
  private LinkDto link;

  /**
   * miniprogram
   */
  @JsonProperty("miniprogram")
  private MiniprogramDto miniprogram;

  /**
   * file
   */
  @JsonProperty("file")
  private FileDto file;

  /**
   * video
   */
  @JsonProperty("video")
  private FileDto video;

  /**
   * agentid
   */
  @JsonProperty("agentid")
  private Integer agentid;

  /**
   * notify
   */
  @JsonProperty("notify")
  private Integer notify;
}
