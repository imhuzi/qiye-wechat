package chat.qiye.wechat.sdk.api.message.dto.appChat;

import com.fasterxml.jackson.annotation.JsonProperty;

import chat.qiye.wechat.sdk.common.dto.FileDto;
import chat.qiye.wechat.sdk.api.message.dto.MessageDto;
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
public class MessageFileDto extends MessageDto {
  /**
   * text
   */
  @JsonProperty("file")
  private FileDto file;

}
