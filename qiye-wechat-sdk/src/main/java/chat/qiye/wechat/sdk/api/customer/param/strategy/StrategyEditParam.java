package chat.qiye.wechat.sdk.api.customer.param.strategy;

import java.io.Serializable;
import java.util.List;

import chat.qiye.wechat.sdk.api.customer.dto.StrategyRangeItemDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 编辑规则 参数
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2022/3/8
 */
@Data
public class StrategyEditParam implements Serializable {


	@JsonProperty("strategy_id")
	private int strategyId;

	@JsonProperty("range_del")
	private List<StrategyRangeItemDto> rangeDel;

	@JsonProperty("range_add")
	private List<StrategyRangeItemDto> rangeAdd;

	@JsonProperty("privilege")
	private Privilege privilege;

	@JsonProperty("strategy_name")
	private String strategyName;

	@JsonProperty("admin_list")
	private List<String> adminList;

	@Data
	public static class Privilege{

		@JsonProperty("contact_me")
		private boolean contactMe;

		@JsonProperty("send_customer_msg")
		private boolean sendCustomerMsg;

		@JsonProperty("export_customer_list")
		private boolean exportCustomerList;

		@JsonProperty("view_customer_data")
		private boolean viewCustomerData;

		@JsonProperty("onjob_customer_transfer")
		private boolean onjobCustomerTransfer;

		@JsonProperty("export_customer_group_list")
		private boolean exportCustomerGroupList;

		@JsonProperty("view_room_data")
		private boolean viewRoomData;

		@JsonProperty("oper_resign_customer")
		private boolean operResignCustomer;

		@JsonProperty("export_customer_data")
		private boolean exportCustomerData;

		@JsonProperty("view_room_list")
		private boolean viewRoomList;

		@JsonProperty("oper_resign_group")
		private boolean operResignGroup;

		@JsonProperty("room_deduplication")
		private boolean roomDeduplication;

		@JsonProperty("send_group_msg")
		private boolean sendGroupMsg;

		@JsonProperty("view_behavior_data")
		private boolean viewBehaviorData;

		@JsonProperty("manage_customer_tag")
		private boolean manageCustomerTag;

		@JsonProperty("join_room")
		private boolean joinRoom;

		@JsonProperty("share_customer")
		private boolean shareCustomer;

		@JsonProperty("edit_anti_spam_rule")
		private boolean editAntiSpamRule;

		@JsonProperty("rapid_reply")
		private boolean rapidReply;

		@JsonProperty("view_customer_list")
		private boolean viewCustomerList;

		@JsonProperty("edit_welcome_msg")
		private boolean editWelcomeMsg;
	}
}