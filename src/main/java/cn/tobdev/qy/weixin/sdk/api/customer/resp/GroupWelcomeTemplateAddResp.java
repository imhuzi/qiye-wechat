package cn.tobdev.qy.weixin.sdk.api.customer.resp;

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
 * @date  : 2021/6/30
 */
@Getter
@Setter
@ToString
public class GroupWelcomeTemplateAddResp   extends RespStatus implements Serializable {

  /**
   * templateId
   */
  @JsonProperty("template_id")
  private String templateId;
}
