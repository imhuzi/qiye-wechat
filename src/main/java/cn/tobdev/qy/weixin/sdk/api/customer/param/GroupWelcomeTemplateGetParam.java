package cn.tobdev.qy.weixin.sdk.api.customer.param;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.common.dto.ImageDto;
import cn.tobdev.qy.weixin.sdk.common.dto.LinkDto;
import cn.tobdev.qy.weixin.sdk.common.dto.MiniprogramDto;
import cn.tobdev.qy.weixin.sdk.common.dto.TextDto;
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
public class GroupWelcomeTemplateGetParam {

  /**
   * 模板id
   */
  @JsonProperty("template_id")
  private String templateId;

}
