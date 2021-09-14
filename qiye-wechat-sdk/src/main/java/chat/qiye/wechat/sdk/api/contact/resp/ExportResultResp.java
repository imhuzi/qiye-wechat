package chat.qiye.wechat.sdk.api.contact.resp;

import chat.qiye.wechat.sdk.api.contact.vo.ExportDataItemVo;
import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/7
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ExportResultResp extends RespStatus {

    private Integer status;

    @JsonProperty("data_list")
    private List<ExportDataItemVo> dataList;

}
