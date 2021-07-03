package chat.qiye.wechat.sdk.api.school.resp;

import java.io.Serializable;
import java.util.List;

import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.api.school.dto.StudentDetailDto;
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
@Getter
@Setter
@ToString
public class StudentListResp  extends RespStatus implements Serializable {
  List<StudentDetailDto> students;
}
