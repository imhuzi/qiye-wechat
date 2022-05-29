package chat.qiye.wechat.sdk.api.customer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import chat.qiye.wechat.sdk.api.contact.vo.UserExternalProfile;
import lombok.Data;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2022/5/29
 */
@Data
public class ExternalContactDto {
  @JsonProperty("external_userid")
  private String externalUserid;

  private String name;

  private String position;

  private String avatar;

  private Integer type;

  private String unionid;

  private Integer gender;

  @JsonProperty("corp_name")
  private String corpName;

  @JsonProperty("corp_full_name")
  private String corpFullName;

  @JsonProperty("external_profile")
  private UserExternalProfile externalProfile;

}
