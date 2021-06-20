package cn.tobdev.qy.weixin.sdk.api.thirdparty.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/16
 */
@Data
public class DealerCorpInfoVo {
  private String corpid;
  
  @JsonProperty("corp_name")
  private String corpName;
}
