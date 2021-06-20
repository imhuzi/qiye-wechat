package cn.tobdev.qy.weixin.sdk.api.app.resp;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.common.RespStatus;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 获取指定的应用详情
 * https://work.weixin.qq.com/api/doc/90000/90135/90227
 *
 * 对于互联企业的应用，如果需要获取应用可见范围内其他互联企业的部门与成员，请调用互联企业-获取应用可见范围接口
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/20
 */
@Getter
@Setter
@ToString
public class AppInfoResp extends RespStatus implements Serializable {
  private String name;
  @JsonProperty("square_logo_url")
  private String squareLogoUrl;
  private String description;

  @JsonProperty("allow_userinfos")
  private AllowUserinfos allowUserinfos;

  @JsonProperty("allow_partys")
  private AllowPartys allowPartys;

  @JsonProperty("allow_tags")
  private AllowTags allowTags;

  private Integer close;

  @JsonProperty("redirect_domain")
  private String redirectDomain;

  @JsonProperty("report_location_flag")
  private Integer reportLocationFlag;

  private Integer isreportenter;

  @JsonProperty("home_url")
  private String homeUrl;

  @Data
  static class  AllowUserinfos{
      List<UserItem> user;
  }

  @Data
  static class  UserItem{
     private String uesrid;
  }

  @Data
  static class  AllowPartys{
    List<Integer> partyid;
  }

  @Data
  static class  AllowTags{
    List<Integer> tagid;
  }

}
