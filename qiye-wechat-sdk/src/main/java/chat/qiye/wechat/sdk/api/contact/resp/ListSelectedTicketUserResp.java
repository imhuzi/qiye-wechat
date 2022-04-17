package chat.qiye.wechat.sdk.api.contact.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ListSelectedTicketUserResp  extends RespStatus {
    private String operatorOpenUserid;
    private String[] openUseridList;
    private String[] unauthOpenUseridList;
    private Integer total;
}
