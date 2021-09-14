package chat.qiye.wechat.sdk.api.contact.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class LinkedcorpDeptListResp extends RespStatus {

	@JsonProperty("department_list")
	private List<DepartmentListItem> departmentList;
}