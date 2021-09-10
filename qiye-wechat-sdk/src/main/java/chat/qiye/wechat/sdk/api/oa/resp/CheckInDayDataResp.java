package chat.qiye.wechat.sdk.api.oa.resp;

import chat.qiye.wechat.sdk.api.oa.vo.checkin.data.CheckInDayDataItemVo;
import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class CheckInDayDataResp extends RespStatus {

	@JsonProperty("datas")
	private List<CheckInDayDataItemVo> datas;

}