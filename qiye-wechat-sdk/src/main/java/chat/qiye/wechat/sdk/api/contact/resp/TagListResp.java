package chat.qiye.wechat.sdk.api.contact.resp;

import java.io.Serializable;
import java.util.List;

import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.api.contact.vo.TagVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/18
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TagListResp extends RespStatus implements Serializable {

  private List<TagVo> taglist;
}
