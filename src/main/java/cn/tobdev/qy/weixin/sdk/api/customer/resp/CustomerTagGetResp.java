package cn.tobdev.qy.weixin.sdk.api.customer.resp;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.api.customer.dto.TagGroupDto;
import cn.tobdev.qy.weixin.sdk.common.RespStatus;
import lombok.Getter;
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
public class CustomerTagGetResp extends RespStatus implements Serializable {

  /**
   * tagGroup
   */
  @JsonProperty("tag_group")
  private TagGroupDto tagGroup;
}
