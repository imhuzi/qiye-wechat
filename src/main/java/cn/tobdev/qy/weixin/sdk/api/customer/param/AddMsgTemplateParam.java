package cn.tobdev.qy.weixin.sdk.api.customer.param;

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
 * @date  : 2021/6/29
 */
@NoArgsConstructor
@Data
public class AddMsgTemplateParam {

  /**
   * chatType
   */
  @JsonProperty("chat_type")
  private String chatType;

  /**
   * externalUserid
   */
  @JsonProperty("external_userid")
  private List<String> externalUserid;

  /**
   * sender
   */
  @JsonProperty("sender")
  private String sender;

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
