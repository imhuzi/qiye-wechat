package cn.tobdev.qy.weixin.sdk.api.school.resp;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class StudentBatchOperationResp extends RespStatus implements Serializable {

  /**
   * resultList
   */
  @JsonProperty("result_list")
  private List<ResultListDto> resultList;
}
