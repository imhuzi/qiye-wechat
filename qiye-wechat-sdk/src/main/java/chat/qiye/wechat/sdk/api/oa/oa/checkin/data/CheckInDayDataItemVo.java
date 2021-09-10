package chat.qiye.wechat.sdk.api.oa.oa.checkin.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CheckInDayDataItemVo {

	@JsonProperty("exception_infos")
	private List<ExceptionInfosItem> exceptionInfos;

	@JsonProperty("sp_items")
	private List<SpItemsItem> spItems;

	@JsonProperty("ot_info")
	private OtInfo otInfo;

	@JsonProperty("base_info")
	private BaseInfo baseInfo;

	@JsonProperty("summary_info")
	private SummaryInfo summaryInfo;

	@JsonProperty("holiday_infos")
	private List<HolidayInfosItem> holidayInfos;

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
	public static class OtInfo{

		@JsonProperty("ot_duration")
		private Integer otDuration;

		@JsonProperty("exception_duration")
		private List<Integer> exceptionDuration;

		@JsonProperty("ot_status")
		private Integer otStatus;
	}

	@Data
	public static class HolidayInfosItem{

		@JsonProperty("sp_number")
		private String spNumber;

		@JsonProperty("sp_title")
		private SpTitle spTitle;

		@JsonProperty("sp_description")
		private SpDescription spDescription;

		@Data
		public static class SpTitle{

			@JsonProperty("data")
			private List<DataItem> data;

			@Data
			public static class DataItem{

				@JsonProperty("text")
				private String text;

				@JsonProperty("lang")
				private String lang;
			}
		}

		@Data
		public static class SpDescription{

			@JsonProperty("data")
			private List<SpTitle.DataItem> data;
		}
	}
}