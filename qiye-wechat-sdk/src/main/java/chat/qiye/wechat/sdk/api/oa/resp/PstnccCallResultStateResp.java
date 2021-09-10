package chat.qiye.wechat.sdk.api.oa.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/10
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PstnccCallResultStateResp extends RespStatus {
    private Integer istalked;
    private Integer calltime;
    private Integer talktime;
    private Integer reason;


}
