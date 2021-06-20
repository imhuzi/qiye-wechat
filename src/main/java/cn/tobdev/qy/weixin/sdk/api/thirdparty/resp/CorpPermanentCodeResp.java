package cn.tobdev.qy.weixin.sdk.api.thirdparty.resp;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.api.thirdparty.vo.AuthCorpInfoVo;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.vo.AuthInfoVo;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.vo.DealerCorpInfoVo;
import cn.tobdev.qy.weixin.sdk.common.RespStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 企业永久权码接口响应数据
 * https://work.weixin.qq.com/api/doc/90001/90143/90603
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @created : 2021/1/3
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CorpPermanentCodeResp extends RespStatus implements Serializable {
  /**
   * corp access_token,
   *
   * 同接口返回内容相同 https://qyapi.weixin.qq.com/cgi-bin/service/get_corp_token?suite_access_token=SUITE_ACCESS_TOKEN
   */
  @JsonProperty("access_token")
  private String accessToken;

  @JsonProperty("expires_in")
  private int expiresIn = -1;

  /**
   * 永久授权码
   */
  @JsonProperty("permanent_code")
  private String permanentCode;

  @JsonProperty("dealer_corp_info")
  private DealerCorpInfoVo dealerCorpInfo;

  @JsonProperty("auth_corp_info")
  private AuthCorpInfoVo authCorpInfo;

  @JsonProperty("auth_info")
  private AuthInfoVo authInfo;

  private AuthUserInfo authUserInfo;

  private RegisterCodeInfo registerCodeInfo;

  /**
   * 授权管理员的信息，可能不返回（企业互联由上级企业共享第三方应用给下级时，不返回授权的管理员信息）
   */
  @Data
  public static class AuthUserInfo {
    private String userid;

    @JsonProperty("open_userid")
    private String openUserid;

    private String name;

    private String avatar;
  }

  /**
   * 推广二维码安装相关信息，扫推广二维码安装时返回。
   * （注：无论企业是否新注册，只要通过扫推广二维码安装，都会返回该字段）
   */
  @Data
  public static class RegisterCodeInfo {
    @JsonProperty("register_code")
    private String registerCode;

    @JsonProperty("template_id")
    private String templateId;

    private String state;
  }
}
