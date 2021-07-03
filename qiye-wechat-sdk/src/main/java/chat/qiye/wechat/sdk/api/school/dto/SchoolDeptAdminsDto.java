package chat.qiye.wechat.sdk.api.school.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/3
 */
@NoArgsConstructor
@Data
public class SchoolDeptAdminsDto {
  /**
   * op=0表示新增或者更新，op=1表示删除管理员
   *  更新 部门信息时可以传此值
   */
  private Integer op;
  /**
   * userid
   */
  @JsonProperty("userid")
  private String userid;

  /**
   * type
   */
  @JsonProperty("type")
  private Integer type;

  /**
   * subject
   */
  @JsonProperty("subject")
  private String subject;
}
