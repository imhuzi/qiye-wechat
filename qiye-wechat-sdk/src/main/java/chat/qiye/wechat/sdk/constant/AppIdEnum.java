package chat.qiye.wechat.sdk.constant;

/**
 * 系统应用 ID
 * <p>
 * 系统应用 默认是 没有ID 但是 系统应用有单独的 secret,
 * 为了能够识别 系统应用的 secret 特此 对系统应用的id 进行统一定义，在配置文件中 配置时，需遵守
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/8/31
 */
public enum AppIdEnum {

    DEFAULT("app", "自建应用"),
    APP_CONTACT("contact", "通讯录"),
    APP_CUSTOMER("customer", "客户关系"),
    APP_KF("kf", "微信客服"),
    APP_MEETING("meeting", "会议"),
    APP_SCHEDULE("schedule", "日程"),
    APP_PUBLIC_PHONE("public_phone", "公费电话"),
    APP_WX_DRIVE("wx_drive", "微盘"),
    APP_LIVING("living", "直播"),
    APP_CHECK_IN("check_in", "打卡"),
    APP_APPROVAL("approval", "审批"),
    APP_REPORT("report", "汇报"),
    APP_MEETING_ROOM("meeting_room", "会议室"),
    APP_PSTNCC("pstncc", "紧急通知"),
    APP_HEALTH("health", "健康上报"),
    APP_SCHOOL_CONTACT("school_contact", "家校通讯录"),
    APP_SCHOOL_HEALTH_CODE("school_health_code", "复学码"),
    APP_SCHOOL_PAYMENT("school_payment", "班级收款");

    private final String appId;

    private final String desc;

    AppIdEnum(String appId, String desc) {
        this.appId = appId;
        this.desc = desc;
    }

    public String getAppId() {
        return appId;
    }

    public String getDesc() {
        return desc;
    }
}