package chat.qiye.wechat.sdk.api.oa.resp;

import chat.qiye.wechat.sdk.api.oa.oa.approval.ApprovalTemplateConfig;
import chat.qiye.wechat.sdk.api.oa.oa.approval.ApprovalTemplateProperty;
import chat.qiye.wechat.sdk.api.oa.oa.approval.TitleItem;
import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class GetApprovalTemplateResp extends RespStatus {

	@JsonProperty("template_names")
	private List<TitleItem> templateNames;

	@JsonProperty("template_content")
	private TemplateContent templateContent;

	@Data
	public static class TemplateContent{

		@JsonProperty("controls")
		private List<ControlsItem> controls;

		@Data
		public static class ControlsItem{

			@JsonProperty("property")
			private ApprovalTemplateProperty property;

			@JsonProperty("config")
			private ApprovalTemplateConfig config;
		}
	}
}