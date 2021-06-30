package cn.tobdev.qy.weixin.sdk.api.customer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/30
 */
@NoArgsConstructor
@Data
public class MomentLikeListDto {
  /**
   * externalUserid
   */
  @JsonProperty("external_userid")
  private String externalUserid;

  /**
   * createTime
   */
  @JsonProperty("create_time")
  private Integer createTime;

  /**
   * userid
   */
  @JsonProperty("userid")
  private String userid;
}
