package chat.qiye.wechat.sdk.api.oa;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.oa.vo.MeetingRoom;
import chat.qiye.wechat.sdk.api.oa.param.MeetingRoomBookingParam;
import chat.qiye.wechat.sdk.api.oa.param.MeetingRoomCancelBookingParam;
import chat.qiye.wechat.sdk.api.oa.param.MeetingRoomDelParam;
import chat.qiye.wechat.sdk.api.oa.param.MeetingRoomListParam;
import chat.qiye.wechat.sdk.api.oa.resp.MeetingRoomAddResp;
import chat.qiye.wechat.sdk.api.oa.resp.MeetingRoomBookingResp;
import chat.qiye.wechat.sdk.api.oa.resp.MeetingRoomListResp;
import chat.qiye.wechat.sdk.api.oa.resp.MeetingRoomQueryBookingResp;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import chat.qiye.wechat.sdk.constant.OaApiUris;
import feign.RequestLine;

/**
 * OA - 会议室
 * https://open.work.weixin.qq.com/api/doc/90000/90135/93617
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/8
 */

@QiYeWeChatApi(appType = AppIdEnum.APP_MEETING_ROOM)
public interface OaMeetingRoomApi {

    @RequestLine(OaApiUris.API_ADD_MEETING_ROOM)
    MeetingRoomAddResp addMeetingRoom(MeetingRoom param);

    @RequestLine(OaApiUris.API_EDIT_MEETING_ROOM)
    RespStatus editMeetingRoom(MeetingRoom param);

    @RequestLine(OaApiUris.API_LIST_MEETING_ROOM)
    MeetingRoomListResp listMeetingRoom(MeetingRoomListParam param);

    @RequestLine(OaApiUris.API_DEL_MEETING_ROOM)
    RespStatus delMeetingRoom(MeetingRoomDelParam param);

    @RequestLine(OaApiUris.API_ADD_MEETING_ROOM_BOOK)
    MeetingRoomBookingResp booking(MeetingRoomBookingParam param);

    /**
     * 查询会议室的预定信息
     * 企业可通过此接口查询相关会议室在指定时间段的预定情况，如是否已被预定，预定者的userid等信息，不支持跨天查询。
     * <p>
     * 请求方式：POST（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/oa/meetingroom/get_booking_info?access_token=ACCESS_TOKEN
     *
     * @param param
     * @return
     */
    @RequestLine(OaApiUris.API_GET_MEETING_ROOM_BOOKING_INFO)
    MeetingRoomQueryBookingResp queryBookingInfo(MeetingRoom param);

    @RequestLine(OaApiUris.API_CANCEL_MEETING_ROOM_BOOKING_INFO)
    RespStatus cancelBooking(MeetingRoomCancelBookingParam param);


}
