package cn.tobdev.qy.weixin.sdk.api.customer.resp;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.common.RespStatus;
import cn.tobdev.qy.weixin.sdk.common.dto.ImageDto;
import cn.tobdev.qy.weixin.sdk.common.dto.LinkDto;
import cn.tobdev.qy.weixin.sdk.common.dto.MiniprogramDto;
import cn.tobdev.qy.weixin.sdk.common.dto.TextDto;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/30
 */
@Getter
@Setter
@ToString
public class GroupWelcomeTemplateGetResp   extends RespStatus implements Serializable {


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


}
