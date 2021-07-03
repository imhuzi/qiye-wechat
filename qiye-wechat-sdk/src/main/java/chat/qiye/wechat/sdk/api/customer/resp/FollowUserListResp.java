package chat.qiye.wechat.sdk.api.customer.resp;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 获取配置了客户联系功能的成员列表 结果
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/26
 */
@Getter
@Setter
@ToString
public class FollowUserListResp extends RespStatus {

  @JsonProperty("follow_user")
  private List<String> followUser;
}
