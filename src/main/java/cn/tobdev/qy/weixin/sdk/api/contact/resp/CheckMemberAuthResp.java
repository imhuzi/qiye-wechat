package cn.tobdev.qy.weixin.sdk.api.contact.resp;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.common.RespStatus;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/5
 */
@Getter
@Setter
@ToString
public class CheckMemberAuthResp extends RespStatus implements Serializable {
  /**
   * 当用户为某个企业内部成员时返回。全局唯一，对于同一个服务商不同的应用open_userid是相同的；同一用户，对于不同服务商open_userid是不同的
   */
  @JsonProperty("is_member_auth")
  private boolean isMemberAuth;

}
