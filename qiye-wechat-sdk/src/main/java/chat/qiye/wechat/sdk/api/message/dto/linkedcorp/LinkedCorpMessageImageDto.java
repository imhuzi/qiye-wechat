package chat.qiye.wechat.sdk.api.message.dto.linkedcorp;

import chat.qiye.wechat.sdk.common.dto.ImageDto;
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
public class LinkedCorpMessageImageDto extends LinkedCorpMessageDto {

  private ImageDto image;
}
