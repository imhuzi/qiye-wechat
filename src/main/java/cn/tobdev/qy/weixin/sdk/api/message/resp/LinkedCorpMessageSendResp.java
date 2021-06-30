package cn.tobdev.qy.weixin.sdk.api.message.resp;

import java.io.Serializable;
import java.util.List;

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
public class LinkedCorpMessageSendResp  extends RespStatus implements Serializable {

  /**
   * invaliduser
   */
  @JsonProperty("invaliduser")
  private List<String> invaliduser;

  /**
   * invalidparty
   */
  @JsonProperty("invalidparty")
  private List<String> invalidparty;

  /**
   * invalidtag
   */
  @JsonProperty("invalidtag")
  private List<String> invalidtag;
}
