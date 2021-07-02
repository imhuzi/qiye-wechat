package cn.tobdev.qy.weixin.sdk.api.school.param;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.api.school.dto.StudentDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/3
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class StudentUpdateParam extends StudentDto {
  @JsonProperty("new_student_userid")
  private String newStudentUserid;
}
