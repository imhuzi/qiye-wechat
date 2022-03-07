package chat.qiye.wechat.sdk.api.app.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;

@EqualsAndHashCode(callSuper = true)
@Data
public class GetDomainIpResp extends RespStatus {
    private ArrayList<String> ipList;
}
