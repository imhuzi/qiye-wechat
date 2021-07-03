package chat.qiye.wechat.sdk.api.message.resp;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/1
 */
@Getter
@Setter
@ToString
public class SchoolMessageSendResp   extends RespStatus implements Serializable {

  /**
   * invalidExternalUser
   */
  @JsonProperty("invalid_external_user")
  private List<String> invalidExternalUser;

  /**
   * invalidParentUserid
   */
  @JsonProperty("invalid_parent_userid")
  private List<String> invalidParentUserid;

  /**
   * invalidStudentUserid
   */
  @JsonProperty("invalid_student_userid")
  private List<String> invalidStudentUserid;

  /**
   * invalidParty
   */
  @JsonProperty("invalid_party")
  private List<String> invalidParty;
}
