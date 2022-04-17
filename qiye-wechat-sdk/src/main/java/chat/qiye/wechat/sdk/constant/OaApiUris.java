package chat.qiye.wechat.sdk.constant;

/**
 * OA 和 效率工具 api uri 常量
 * <p>
 * https://work.weixin.qq.com/api/doc/90000/90135/90261
 * <p>
 * https://work.weixin.qq.com/api/doc/90000/90135/93623
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/6/16
 */
public interface OaApiUris {

    // OA 打卡 https://open.work.weixin.qq.com/api/doc/90000/90135/90261
    // 企业所有打卡规则
    String API_GET_CORP_CHECKIN_OPTION = "POST /checkin/getcorpcheckinoption";
    // 获取员工打卡规则
    String API_GET_USER_CHECKIN_OPTION = "POST /checkin/getcheckinoption";

    String API_GET_CHECKIN_DATA = "POST /checkin/getcheckindata";
    String API_GET_CHECKIN_DAY_DATA = "POST /checkin/getcheckin_daydata";
    String API_GET_CHECKIN_MONTH_DATA = "POST /checkin/getcheckin_monthdata";
    String API_GET_CHECKIN_SCHEDU_LIST = "POST /checkin/getcheckinschedulist";
    String API_SET_CHECKIN_SCHEDU_LIST = "POST /checkin/setcheckinschedulist";
    String API_ADD_CHECKIN_USER_FACE = "POST /checkin/addcheckinuserface";

    // OA 审批  https://open.work.weixin.qq.com/api/doc/90000/90135/90264
    String API_GET_APPROVAL_TEMPLATE = "POST /oa/gettemplatedetail";
    String API_ADD_APPROVAL_APPLY_EVENT = "POST /oa/applyevent";
    String API_GET_APPROVAL_APPLY_NUM_LIST = "POST /oa/getapprovalinfo";
    String API_GET_APPROVAL_DETAIL = "POST /oa/getapprovaldetail";
    String API_GET_VACATION_CONF = "GET /oa/vacation/getcorpconf";
    String API_GET_VACATION_USER_QUOTA = "POST /oa/vacation/getuservacationquota";
    String API_SET_VACATION_USER_QUOTA = "POST /oa/vacation/setoneuserquota";
    // 查询自建应用审批单当前状态
    String API_GET_CORP_APPROVAL_DATA = "POST /corp/getopenapprovaldata";

    // OA 汇报  https://open.work.weixin.qq.com/api/doc/90000/90135/93392
    String API_GET_JOURNAL_RECORD_LIST = "GET /oa/journal/get_record_list";
    String API_GET_JOURNAL_RECORD_DETAIL = "GET /oa/journal/get_record_detail";
    String API_GET_JOURNAL_STAT_LIST = "GET /oa/journal/get_stat_list";

    //OA 会议室  https://open.work.weixin.qq.com/api/doc/90000/90135/93617
    String API_ADD_MEETING_ROOM = "POST /oa/meetingroom/add";
    String API_EDIT_MEETING_ROOM = "POST /oa/meetingroom/edit";
    String API_DEL_MEETING_ROOM = "POST /oa/meetingroom/del";
    String API_LIST_MEETING_ROOM = "POST /oa/meetingroom/list";

    String API_GET_MEETING_ROOM_BOOKING_INFO = "POST /oa/meetingroom/get_booking_info";
    String API_ADD_MEETING_ROOM_BOOK = "POST /oa/meetingroom/book";
    String API_CANCEL_MEETING_ROOM_BOOKING_INFO = "POST /oa/meetingroom/cancel_book";

    //OA 紧急通知应用 https://open.work.weixin.qq.com/api/doc/90000/90135/91623
    String API_PSTNCC_CALL = "POST /pstncc/call";
    String API_GET_PSTNCC_STATE = "POST /pstncc/getstates";

    // 效率工具-日程
    String API_CALENDAR_ADD = "POST /oa/calendar/add";
    String API_CALENDAR_UPDATE = "POST /oa/calendar/update";
    String API_CALENDAR_GET = "POST /oa/calendar/get";
    String API_CALENDAR_DEL = "POST /oa/calendar/del";

    String API_SCHEDULE_ADD = "POST /oa/schedule/add";
    String API_SCHEDULE_ADD_ATTENDEES = "POST /oa/schedule/add_attendees";
    String API_SCHEDULE_DEL_ATTENDEES = "POST /oa/schedule/del_attendees";
    String API_SCHEDULE_UPDATE = "POST /oa/schedule/update";
    String API_SCHEDULE_GET = "POST /oa/schedule/get";
    String API_SCHEDULE_DEL = "POST /oa/schedule/del";
    String API_SCHEDULE_GET_BY_CALENDAR = "POST /oa/schedule/get_by_calendar";

    // 效率工具- 会议
    String API_MEETING_CREATE = "POST /meeting/create";
    String API_MEETING_UPDATE = "POST /meeting/update";
    String API_MEETING_CANCEL = "POST /meeting/cancel";
    String API_MEETING_GET_USER_MEETINGID = "POST /meeting/get_user_meetingid";
    String API_MEETING_GET_DETAIL = "POST /meeting/get_info";


}
