package cn.tobdev.qy.weixin.sdk.api.thirdparty.resp;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.common.RespStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 应用管理员列表接口响应数据
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @created : 2021/1/3
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AppAdminListResp extends RespStatus implements Serializable {
  private List<AdminItem> admin;

  @Data
  static class AdminItem {

    private String userid;

    @JsonProperty("open_userid")
    private String openUserid;

    @JsonProperty("auth_type")
    private Integer authType;
  }
}
