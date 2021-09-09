package chat.qiye.wechat.sdk.api.oa.oa.checkin.data;

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
		private int checkinCount;

		@JsonProperty("earliest_time")
		private int earliestTime;

		@JsonProperty("regular_work_sec")
		private int regularWorkSec;

		@JsonProperty("lastest_time")
		private int lastestTime;

		@JsonProperty("standard_work_sec")
		private int standardWorkSec;
	}

	@Data
	public static class OverworkInfo{

		@JsonProperty("workday_over_sec")
		private int workdayOverSec;

	}

}