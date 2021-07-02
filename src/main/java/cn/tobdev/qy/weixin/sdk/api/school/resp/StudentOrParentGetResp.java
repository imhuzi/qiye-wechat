package cn.tobdev.qy.weixin.sdk.api.school.resp;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.api.school.dto.ParentDetailDto;
import cn.tobdev.qy.weixin.sdk.api.school.dto.StudentDetailDto;
import cn.tobdev.qy.weixin.sdk.api.school.dto.StudentDto;
import cn.tobdev.qy.weixin.sdk.common.RespStatus;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/3
 */
@Getter
@Setter
@ToString
public class StudentOrParentGetResp extends RespStatus implements Serializable {

  public static final int USER_TYPE_STUDENT = 1;

  public static final int USER_TYPE_PARENT = 2;

  /**
   * userType
   */
  @JsonProperty("user_type")
  private Integer userType;

  private StudentDetailDto student;

  private ParentDetailDto parent;

  public  boolean isStudent() {
    return USER_TYPE_STUDENT == userType;
  }
}
