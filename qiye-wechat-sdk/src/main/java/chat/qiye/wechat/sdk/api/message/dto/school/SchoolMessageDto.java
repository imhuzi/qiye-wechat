package chat.qiye.wechat.sdk.api.message.dto.school;

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
public class SchoolMessageDto {
  /**
   * 已关注「学校通知」的家长列表，即将废弃（最多支持1000个）
   */
  @JsonProperty("to_external_user")
  private List<String> toExternalUser;

  /**
   * 家校通讯录家长列表（最多支持1000个）
   */
  @JsonProperty("to_parent_userid")
  private List<String> toParentUserid;

  /**
   * 家校通讯录学生列表，表示发给学生的所有家长（最多支持1000个）
   */
  @JsonProperty("to_student_userid")
  private List<String> toStudentUserid;

  /**
   * 家校通讯录部门列表，表示发给班级的所有家长（最多支持100个）
   */
  @JsonProperty("toparty")
  private List<String> toparty;


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
