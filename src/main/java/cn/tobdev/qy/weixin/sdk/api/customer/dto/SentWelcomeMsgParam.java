package cn.tobdev.qy.weixin.sdk.api.customer.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.common.dto.AttachmentsDto;
import cn.tobdev.qy.weixin.sdk.common.dto.TextDto;
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
public class SentWelcomeMsgParam {

  /**
   * welcomeCode
   */
  @JsonProperty("welcome_code")
  private String welcomeCode;

  /**
   * text
   */
  @JsonProperty("text")
  private TextDto text;

  /**
   * attachments
   */
  @JsonProperty("attachments")
  private List<AttachmentsDto> attachments;
}
