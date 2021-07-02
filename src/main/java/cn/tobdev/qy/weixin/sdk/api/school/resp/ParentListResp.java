package cn.tobdev.qy.weixin.sdk.api.school.resp;

import java.io.Serializable;
import java.util.List;

import cn.tobdev.qy.weixin.sdk.api.school.dto.ParentDetailDto;
import cn.tobdev.qy.weixin.sdk.api.school.dto.StudentDetailDto;
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
public class ParentListResp extends RespStatus implements Serializable {
  private List<ParentDetailDto> parents;
}
