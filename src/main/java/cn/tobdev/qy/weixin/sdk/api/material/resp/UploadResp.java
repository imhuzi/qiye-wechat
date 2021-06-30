package cn.tobdev.qy.weixin.sdk.api.material.resp;

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
 * @date  : 2021/7/1
 */
@Getter
@Setter
@ToString
public class UploadResp  extends RespStatus implements Serializable {

  /**
   * type
   */
  @JsonProperty("type")
  private String type;

  /**
   * mediaId
   */
  @JsonProperty("media_id")
  private String mediaId;

  /**
   * createdAt
   */
  @JsonProperty("created_at")
  private String createdAt;
}
