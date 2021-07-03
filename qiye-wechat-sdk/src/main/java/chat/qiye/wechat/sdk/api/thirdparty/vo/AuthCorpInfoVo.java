package chat.qiye.wechat.sdk.api.thirdparty.vo;

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
public class AuthCorpInfoVo {
  /**
   *  "corpid": "xxxx",
   *         "corp_name": "name",
   *         "corp_type": "verified",
   *         "corp_square_logo_url": "yyyyy",
   *         "corp_user_max": 50,
   *         "corp_agent_max": 30,
   *         "corp_full_name":"full_name",
   *         "verified_end_time":1431775834,
   *         "subject_type": 1,
   *         "corp_wxqrcode": "zzzzz",
   *         "corp_scale": "1-50人",
   *         "corp_industry": "IT服务",
   *         "corp_sub_industry": "计算机软件/硬件/信息服务",
   *         "location":"广东省广州市"
   */

  private String corpid;

  @JsonProperty("corp_name")
  private String corpName;

  @JsonProperty("corp_type")
  private String corpType;

  @JsonProperty("corp_square_logo_url")
  private String corpSquareLogoUrl;

  @JsonProperty("corp_user_max")
  private Integer corpUserMax;

  @JsonProperty("corp_agent_max")
  private Integer corpAgentMax;

  @JsonProperty("corp_full_name")
  private String corpFullName;

  @JsonProperty("verified_end_time")
  private Long verifiedEndTime;

  @JsonProperty("subject_type")
  private Integer subjectType;

  @JsonProperty("corp_wxqrcode")
  private String corpWxqrcode;

  @JsonProperty("corp_scale")
  private String corpScale;

  @JsonProperty("corp_industry")
  private String corpIndustry;

  @JsonProperty("corp_sub_industry")
  private String corpSubIndustry;

  private String location;



}
