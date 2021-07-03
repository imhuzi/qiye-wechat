package chat.qiye.wechat.sdk.api.message.dto.app;

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
public class AppMessageDto {

  /**
   * 成员ID列表（消息接收者，多个接收者用‘|’分隔，最多支持1000个）。特殊情况：指定为@all，则向关注该企业应用的全部成员发送
   */
  @JsonProperty("touser")
  private String touser;

  /**
   * 部门ID列表，多个接收者用‘|’分隔，最多支持100个。当touser为@all时忽略本参数
   */
  @JsonProperty("toparty")
  private String toparty;

  /**
   * 标签ID列表，多个接收者用‘|’分隔，最多支持100个。当touser为@all时忽略本参数
   */
  @JsonProperty("totag")
  private String totag;

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
