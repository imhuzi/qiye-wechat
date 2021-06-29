package cn.tobdev.qy.weixin.sdk.api.customer.dto;

import java.io.Serializable;

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
 * @date  : 2021/6/29
 */
@Getter
@Setter
@ToString
public class TaskListDto extends RespStatus implements Serializable {
  /**
   * userid
   */
  @JsonProperty("userid")
  private String userid;

  /**
   * status
   */
  @JsonProperty("status")
  private Integer status;

  /**
   * sendTime
   */
  @JsonProperty("send_time")
  private Integer sendTime;
}
