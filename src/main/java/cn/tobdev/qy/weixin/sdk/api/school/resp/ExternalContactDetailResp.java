package cn.tobdev.qy.weixin.sdk.api.school.resp;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.api.school.dto.ExternalContactDto;
import cn.tobdev.qy.weixin.sdk.api.school.dto.FollowUserDto;
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
 * @date  : 2021/7/3
 */
@Getter
@Setter
@ToString
public class ExternalContactDetailResp  extends RespStatus implements Serializable {

  /**
   * externalContact
   */
  @JsonProperty("external_contact")
  private ExternalContactDto externalContact;

  /**
   * followUser
   */
  @JsonProperty("follow_user")
  private List<FollowUserDto> followUser;
}
