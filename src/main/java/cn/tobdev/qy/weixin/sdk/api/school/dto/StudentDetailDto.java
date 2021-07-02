package cn.tobdev.qy.weixin.sdk.api.school.dto;

import java.util.List;

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
public class StudentDetailDto {

  /**
   * studentUserid
   */
  @JsonProperty("student_userid")
  private String studentUserid;

  /**
   * name
   */
  @JsonProperty("name")
  private String name;

  /**
   * department
   */
  @JsonProperty("department")
  private List<Integer> department;

  /**
   * parents
   */
  @JsonProperty("parents")
  private List<ParentDetailDto> parents;
}
