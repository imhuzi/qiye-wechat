package chat.qiye.wechat.sdk.api.customer.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/26
 */
@NoArgsConstructor
@Data
public class ContactWayDto implements Serializable {

  /**
   * configId
   */
  @JsonProperty("config_id")
  private String configId;

  /**
   * type
   */
  @JsonProperty("type")
  private Integer type;

  /**
   * scene
   */
  @JsonProperty("scene")
  private Integer scene;

  /**
   * style
   */
  @JsonProperty("style")
  private Integer style;

  /**
   * remark
   */
  @JsonProperty("remark")
  private String remark;

  /**
   * skipVerify
   */
  @JsonProperty("skip_verify")
  private Boolean skipVerify;

  /**
   * state
   */
  @JsonProperty("state")
  private String state;

  /**
   * user
   */
  @JsonProperty("user")
  private List<String> user;

  /**
   * party
   */
  @JsonProperty("party")
  private List<Integer> party;

  /**
   * isTemp
   */
  @JsonProperty("is_temp")
  private Boolean isTemp;

  /**
   * expiresIn
   */
  @JsonProperty("expires_in")
  private Integer expiresIn;

  /**
   * chatExpiresIn
   */
  @JsonProperty("chat_expires_in")
  private Integer chatExpiresIn;

  /**
   * unionid
   */
  @JsonProperty("unionid")
  private String unionid;

  /**
   * conclusions
   */
  @JsonProperty("conclusions")
  private ConclusionsDto conclusions;
}
