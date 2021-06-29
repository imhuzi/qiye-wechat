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
 * @date  : 2021/6/29
 */
@NoArgsConstructor
@Data
public class GroupMsgListDto {
  /**
   * msgid
   */
  @JsonProperty("msgid")
  private String msgid;

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
