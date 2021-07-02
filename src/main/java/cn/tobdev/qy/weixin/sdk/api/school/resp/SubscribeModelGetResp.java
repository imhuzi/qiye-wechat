package cn.tobdev.qy.weixin.sdk.api.school.resp;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class SubscribeModelGetResp extends RespStatus implements Serializable {

  /**
   * subscribe_mode
   */
  @JsonProperty("subscribe_mode")
  private Integer subscribeMode;


}
