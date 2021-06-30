package cn.tobdev.qy.weixin.sdk.api.customer.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.common.dto.ImageDto;
import cn.tobdev.qy.weixin.sdk.common.dto.LinkDto;
import cn.tobdev.qy.weixin.sdk.common.dto.LocationDto;
import cn.tobdev.qy.weixin.sdk.common.dto.TextDto;
import cn.tobdev.qy.weixin.sdk.common.dto.VideoDto;
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
public class MomentListDto {
  /**
   * momentId
   */
  @JsonProperty("moment_id")
  private String momentId;

  /**
   * creator
   */
  @JsonProperty("creator")
  private String creator;

  /**
   * createTime
   */
  @JsonProperty("create_time")
  private String createTime;

  /**
   * createType
   */
  @JsonProperty("create_type")
  private Integer createType;

  /**
   * visibleType
   */
  @JsonProperty("visible_type")
  private Integer visibleType;

  /**
   * text
   */
  @JsonProperty("text")
  private TextDto text;

  /**
   * image
   */
  @JsonProperty("image")
  private List<ImageDto> image;

  /**
   * video
   */
  @JsonProperty("video")
  private VideoDto video;

  /**
   * link
   */
  @JsonProperty("link")
  private LinkDto link;

  /**
   * location
   */
  @JsonProperty("location")
  private LocationDto location;
}
