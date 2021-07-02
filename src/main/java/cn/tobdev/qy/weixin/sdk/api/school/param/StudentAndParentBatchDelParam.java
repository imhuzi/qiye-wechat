package cn.tobdev.qy.weixin.sdk.api.school.param;

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
public class StudentAndParentBatchDelParam {

  /**
   * useridlist
   */
  @JsonProperty("useridlist")
  private List<String> useridlist;
}
