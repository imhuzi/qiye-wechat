package chat.qiye.wechat.sdk.api.oa.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ScheduleVo {

    @JsonProperty("schedule")
    private Schedule schedule;

    /**
     * 新增是 需要该参数
     */
    @JsonProperty("agentid")
    private Integer agentid;

    @Data
    public static class Schedule {

        @JsonProperty("schedule_id")
        private String scheduleId;

        @JsonProperty("summary")
        private String summary;

        @JsonProperty("reminders")
        private Reminders reminders;

        @JsonProperty("start_time")
        private Integer startTime;

        @JsonProperty("cal_id")
        private String calId;

        @JsonProperty("organizer")
        private String organizer;

        @JsonProperty("attendees")
        private List<UserIdItem> attendees;

        @JsonProperty("end_time")
        private Integer endTime;

        @JsonProperty("description")
        private String description;

        @JsonProperty("location")
        private String location;

        @Data
        public static class Reminders {

            @JsonProperty("remind_before_event_secs")
            private Integer remindBeforeEventSecs;

            @JsonProperty("is_repeat")
            private Integer isRepeat;

            @JsonProperty("repeat_type")
            private Integer repeatType;

            @JsonProperty("timezone")
            private Integer timezone;

            @JsonProperty("repeat_until")
            private Integer repeatUntil;

            @JsonProperty("is_remind")
            private Integer isRemind;

            @JsonProperty("repeat_interval")
            private Integer repeatInterval;

            @JsonProperty("repeat_day_of_month")
            private List<Integer> repeatDayOfMonth;

            @JsonProperty("repeat_day_of_week")
            private List<Integer> repeatDayOfWeek;

            @JsonProperty("is_custom_repeat")
            private Integer isCustomRepeat;
        }
    }
}