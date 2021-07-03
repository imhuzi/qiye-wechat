package chat.qiye.wechat.sdk.api.message.dto.appChat;

import com.fasterxml.jackson.annotation.JsonProperty;

import chat.qiye.wechat.sdk.api.message.dto.MessageDto;
import chat.qiye.wechat.sdk.api.message.dto.NewsDto;
import lombok.Getter;
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
public class MessageNewsDto   extends MessageDto {



  /**
   * news
   */
  @JsonProperty("news")
  private NewsDto news;
}
