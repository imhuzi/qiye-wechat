package chat.qiye.wechat.sdk.api.oa.resp;

import chat.qiye.wechat.sdk.api.oa.vo.checkin.data.CheckInMonthDataItemVo;
import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class CheckInMonthDataResp extends RespStatus {

	@JsonProperty("datas")
	private List<CheckInMonthDataItemVo> datas;

}