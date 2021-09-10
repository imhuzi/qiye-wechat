package chat.qiye.wechat.sdk.constant;

/**
 * 系统应用 标识
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/8/31
 */
public enum SysAppIdEnum {

    DEFAULT("app", 0, "自建应用"),
    APP_CONTACT("contact", 1, "通讯录"),
    APP_CUSTOMER("customer", 2, "客户关系"),
    APP_CUSTOMER_SERVICE("customer_service", 3, "微信客服"),
    APP_MEETING("meeting", 3010085, "会议"),
    APP_SCHEDULE("schedule", 3010084, "日程"),
    APP_PUBLIC_PHONE("public_phone", 4, "公费电话"),
    APP_WX_DRIVE("wx_drive", 5, "微盘"),
    APP_LIVING("living", 3010097, "直播"),
    APP_CHECK_IN("check_in", 3010011, "打卡"),
    APP_APPROVAL("approval", 3010040, "审批"),
    APP_REPORT("report", 3010041, "汇报"),
    APP_MEETING_ROOM("meeting_room", 6, "会议室"),
    APP_PSTNCC("pstncc", 7, "紧急通知"),
    APP_SCHOOL_CONTACT("school_contact", 8, "家校通讯录");

    private final String appId;

    private final String desc;

    private final Integer agentId;

    SysAppIdEnum(String appId, Integer agentId, String desc) {
        this.appId = appId;
        this.desc = desc;
        this.agentId = agentId;
    }

    public String getAppId() {
        return appId;
    }

    public String getDesc() {
        return desc;
    }

    public Integer getAgentId() {
        return agentId;
    }
}