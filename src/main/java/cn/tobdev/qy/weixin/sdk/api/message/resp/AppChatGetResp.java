package cn.tobdev.qy.weixin.sdk.api.message.resp;

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
public class AppChatGetResp  extends RespStatus implements Serializable {

  /**
   * chatInfo
   */
  @JsonProperty("chat_info")
  private ChatInfoDto chatInfo;
}
