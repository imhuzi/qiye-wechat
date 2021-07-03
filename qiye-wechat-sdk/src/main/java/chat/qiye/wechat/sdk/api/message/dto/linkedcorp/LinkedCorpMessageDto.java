package chat.qiye.wechat.sdk.api.message.dto.linkedcorp;

import java.util.List;

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
public class LinkedCorpMessageDto {

  /**
   * 成员ID列表（消息接收者，最多支持1000个）。每个元素的格式为： corpid/userid，其中，corpid为该互联成员所属的企业，userid为该互联成员所属企业中的帐号。如果是本企业的成员，则直接传userid即可
   */
  @JsonProperty("touser")
  private List<String> touser;

  /**
   * 成员ID列表（消息接收者，最多支持1000个）。每个元素的格式为： corpid/userid，其中，corpid为该互联成员所属的企业，userid为该互联成员所属企业中的帐号。如果是本企业的成员，则直接传userid即可
   */
  @JsonProperty("toparty")
  private List<String> toparty;

  /**
   * 本企业的标签ID列表，最多支持100个。
   */
  @JsonProperty("totag")
  private List<String> totag;

  /**
   * 1表示发送给应用可见范围内的所有人（包括互联企业的成员），默认为0
   */
  private Integer toall;

  /**
   * msgtype
   */
  @JsonProperty("msgtype")
  private String msgtype;

  /**
   * agentid
   */
  @JsonProperty("agentid")
  private Integer agentid;

  /**
   * safe
   */
  @JsonProperty("safe")
  private Integer safe;

  /**
   * enableIdTrans
   */
  @JsonProperty("enable_id_trans")
  private Integer enableIdTrans;

  /**
   * enableDuplicateCheck
   */
  @JsonProperty("enable_duplicate_check")
  private Integer enableDuplicateCheck;

  /**
   * duplicateCheckInterval
   */
  @JsonProperty("duplicate_check_interval")
  private Integer duplicateCheckInterval;
}
