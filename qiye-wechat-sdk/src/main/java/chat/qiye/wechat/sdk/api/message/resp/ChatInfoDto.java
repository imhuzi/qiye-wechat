package chat.qiye.wechat.sdk.api.message.resp;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/1
 */
@NoArgsConstructor
@Data
public class ChatInfoDto {
  /**
   * chatid
   */
  @JsonProperty("chatid")
  private String chatid;

  /**
   * name
   */
  @JsonProperty("name")
  private String name;

  /**
   * owner
   */
  @JsonProperty("owner")
  private String owner;

  /**
   * userlist
   */
  @JsonProperty("userlist")
  private List<String> userlist;
}
