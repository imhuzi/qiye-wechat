package cn.tobdev.qy.weixin.sdk.api.contact.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/5/29
 */
@Data
public class UserExternalProfile {

  @JsonProperty("external_corp_name")
  private String externalCorpName;

  @JsonProperty("external_attr")
  private List<UserExtattrItemVo> externalAttr;


}
