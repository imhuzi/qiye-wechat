package cn.tobdev.qy.weixin.sdk.api.customer.param;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/29
 */
@NoArgsConstructor
@Data
public class CloseTempChatParam implements Serializable {

  /**
   * 企业成员的userid
   */
  @JsonProperty("userid")
  private String userid;

  /**
   * 客户的外部联系人userid
   */
  @JsonProperty("external_userid")
  private String externalUserid;
}
