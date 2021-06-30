package cn.tobdev.qy.weixin.sdk.api.message.param;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/1
 */
@NoArgsConstructor
@Data
public class AppTaskCardMessageUpdateParm {

  /**
   * userids
   */
  @JsonProperty("userids")
  private List<String> userids;

  /**
   * agentid
   */
  @JsonProperty("agentid")
  private Integer agentid;

  /**
   * taskId
   */
  @JsonProperty("task_id")
  private String taskId;

  /**
   * replaceName
   */
  @JsonProperty("replace_name")
  private String replaceName;
}
