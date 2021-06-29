package cn.tobdev.qy.weixin.sdk.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.common.dto.ImageDto;
import cn.tobdev.qy.weixin.sdk.common.dto.LinkDto;
import cn.tobdev.qy.weixin.sdk.common.dto.MiniprogramDto;
import cn.tobdev.qy.weixin.sdk.common.dto.VideoDto;
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
public class AttachmentsDto {
  /**
   * msgtype
   */
  @JsonProperty("msgtype")
  private String msgtype;

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
   * video
   */
  @JsonProperty("video")
  private VideoDto video;
}
