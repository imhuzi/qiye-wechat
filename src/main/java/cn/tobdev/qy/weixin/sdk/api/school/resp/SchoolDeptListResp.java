package cn.tobdev.qy.weixin.sdk.api.school.resp;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.api.school.dto.SchoolDeptDetailDto;
import cn.tobdev.qy.weixin.sdk.common.RespStatus;
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
public class SchoolDeptListResp extends RespStatus implements Serializable {

  /**
   * id
   */
  @JsonProperty("departments")
  private List<SchoolDeptDetailDto> departments;


}
