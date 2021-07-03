package chat.qiye.wechat.sdk.api.school.dto;

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
public class ExternalContactDto {
  /**
   * externalUserid
   */
  @JsonProperty("external_userid")
  private String externalUserid;

  /**
   * name
   */
  @JsonProperty("name")
  private String name;

  /**
   * foreignKey
   */
  @JsonProperty("foreign_key")
  private String foreignKey;

  /**
   * position
   */
  @JsonProperty("position")
  private String position;

  /**
   * avatar
   */
  @JsonProperty("avatar")
  private String avatar;

  /**
   * corpName
   */
  @JsonProperty("corp_name")
  private String corpName;

  /**
   * corpFullName
   */
  @JsonProperty("corp_full_name")
  private String corpFullName;

  /**
   * type
   */
  @JsonProperty("type")
  private Integer type;

  /**
   * gender
   */
  @JsonProperty("gender")
  private Integer gender;

  /**
   * unionid
   */
  @JsonProperty("unionid")
  private String unionid;

  /**
   * subscriberInfo
   */
  @JsonProperty("subscriber_info")
  private SubscriberInfoDto subscriberInfo;

  /**
   * externalProfile
   */
  @JsonProperty("external_profile")
  private ExternalProfileDto externalProfile;
}
