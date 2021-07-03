package chat.qiye.wechat.sdk.api.school.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/3
 */
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class SchoolDeptDetailDto extends SchoolDeptDto{

  /**
   * isGraduated 是否是已毕业，1表示是，0表示不是。仅部门类型为年级时才返回该字段
   */
  @JsonProperty("is_graduated")
  private Integer isGraduated;

  /**
   * openGroupChat 是否开启班级群，1表示开启，0表示关闭。仅部门类型为班级时才返回该字段
   */
  @JsonProperty("open_group_chat")
  private Integer openGroupChat;

  /**
   * groupChatId 班级群id。仅部门类型为班级时且open_group_chat为1时才返回该字段
   */
  @JsonProperty("group_chat_id")
  private String groupChatId;
}
