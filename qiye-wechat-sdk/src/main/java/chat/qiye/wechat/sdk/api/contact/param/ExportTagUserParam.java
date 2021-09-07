package chat.qiye.wechat.sdk.api.contact.param;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/7
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ExportTagUserParam extends ExportContactParam{

    private Integer tagid;
}
