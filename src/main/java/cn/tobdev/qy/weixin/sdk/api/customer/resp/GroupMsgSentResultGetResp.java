package cn.tobdev.qy.weixin.sdk.api.customer.resp;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.api.customer.dto.GroupMsgSendListDto;
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
 * @date  : 2021/6/30
 */
@Getter
@Setter
@ToString
public class GroupMsgSentResultGetResp  extends RespStatus implements Serializable {

  /**
   * nextCursor
   */
  @JsonProperty("next_cursor")
  private String nextCursor;

  /**
   * sendList
   */
  @JsonProperty("send_list")
  private List<GroupMsgSendListDto> sendList;
}
