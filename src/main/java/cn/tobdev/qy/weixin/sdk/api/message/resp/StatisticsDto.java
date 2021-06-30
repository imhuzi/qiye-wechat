package cn.tobdev.qy.weixin.sdk.api.message.resp;

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
public class StatisticsDto {
  /**
   * agentid
   */
  @JsonProperty("agentid")
  private Integer agentid;

  /**
   * appName
   */
  @JsonProperty("app_name")
  private String appName;

  /**
   * count
   */
  @JsonProperty("count")
  private Integer count;
}
