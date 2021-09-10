package chat.qiye.wechat.sdk.api.oa.vo.checkin.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CheckInMonthDataItemVo {

	@JsonProperty("exception_infos")
	private List<ExceptionInfosItem> exceptionInfos;

	@JsonProperty("sp_items")
	private List<SpItemsItem> spItems;

	@JsonProperty("base_info")
	private BaseInfo baseInfo;

	@JsonProperty("summary_info")
	private SummaryInfo summaryInfo;

	@JsonProperty("overwork_info")
	private OverworkInfo overworkInfo;

	@Data
	public static class SummaryInfo{

		@JsonProperty("checkin_count")
		private Integer checkinCount;

		@JsonProperty("earliest_time")
		private Integer earliestTime;

		@JsonProperty("regular_work_sec")
		private Integer regularWorkSec;

		@JsonProperty("lastest_time")
		private Integer lastestTime;

		@JsonProperty("standard_work_sec")
		private Integer standardWorkSec;
	}

	@Data
	public static class OverworkInfo{

		@JsonProperty("workday_over_sec")
		private Integer workdayOverSec;

	}

}