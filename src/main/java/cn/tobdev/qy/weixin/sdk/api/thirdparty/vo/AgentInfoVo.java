package cn.tobdev.qy.weixin.sdk.api.thirdparty.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import netscape.security.Privilege;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/16
 */
@Data
public class AgentInfoVo {
  /**
   *  "agentid":1,
   *                 "name":"NAME",
   *                 "round_logo_url":"xxxxxx",
   *                 "square_logo_url":"yyyyyy",
   *                 "appid":1,
   *                 "auth_mode":1,
   *                 "privilege":
   */
  private Integer agentid;

  @JsonProperty("round_logo_url")
  private String roundLogoUrl;

  @JsonProperty("square_logo_url")
  private String squareLogoUrl;

  private Integer appid;

  @JsonProperty("auth_mode")
  private Integer authMode;

  private Privilege privilege;

  private SharedFrom sharedFrom;

  /**
   *  "level":1,
   *                     "allow_party":[1,2,3],
   *                     "allow_user":["zhansan","lisi"],
   *                     "allow_tag":[1,2,3],
   *                     "extra_party":[4,5,6],
   *                     "extra_user":["wangwu"],
   *                     "extra_tag":[4,5,6]
   */
  @Data
  public static class Privilege {
    private Integer level;

    @JsonProperty("allow_party")
    private Integer[] allowParty;

    @JsonProperty("allow_user")
    private String[] allowUser;

    @JsonProperty("allow_tag")
    private Integer[] allowTag;

    @JsonProperty("extra_party")
    private Integer[] extraParty;

    @JsonProperty("extra_user")
    private String[] extraUser;

    @JsonProperty("extra_tag")
    private Integer[] extraTag;
  }

  @Data
  public static class SharedFrom {
    private String corpid;
  }
}
