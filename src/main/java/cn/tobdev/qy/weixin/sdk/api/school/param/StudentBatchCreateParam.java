package cn.tobdev.qy.weixin.sdk.api.school.param;

import java.util.Set;

import cn.tobdev.qy.weixin.sdk.api.school.dto.StudentDto;
import lombok.Data;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/3
 */
@Data
public class StudentBatchCreateParam {
  private Set<StudentDto> students;
}
