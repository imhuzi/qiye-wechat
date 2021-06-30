package cn.tobdev.qy.weixin.sdk.api.customer.param;

import java.util.List;

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
public class CustomerTagMarkParam {
  /**
   * userid
   */
  @JsonProperty("userid")
  private String userid;

  /**
   * externalUserid
   */
  @JsonProperty("external_userid")
  private String externalUserid;

  /**
   * addTag
   */
  @JsonProperty("add_tag")
  private List<String> addTag;

  /**
   * removeTag
   */
  @JsonProperty("remove_tag")
  private List<String> removeTag;
}
