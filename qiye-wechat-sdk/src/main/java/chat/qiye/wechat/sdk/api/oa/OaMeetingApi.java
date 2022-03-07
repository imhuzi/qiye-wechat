package chat.qiye.wechat.sdk.api.oa;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.oa.param.CalendarSaveParam;
import chat.qiye.wechat.sdk.api.oa.param.MeetingCancelParam;
import chat.qiye.wechat.sdk.api.oa.param.MeetingGetUserMeetingidParam;
import chat.qiye.wechat.sdk.api.oa.resp.MeetingCreateResp;
import chat.qiye.wechat.sdk.api.oa.resp.MeetingDetailResp;
import chat.qiye.wechat.sdk.api.oa.resp.MeetingGetUserMeetingResp;
import chat.qiye.wechat.sdk.api.oa.vo.MeetingVo;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import chat.qiye.wechat.sdk.constant.OaApiUris;
import feign.RequestLine;

/**
 * 会议 接口
 * <p>
 * https://open.work.weixin.qq.com/api/doc/90000/90135/93626
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/10
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_MEETING)
public interface OaMeetingApi {

    @RequestLine(OaApiUris.API_MEETING_CREATE)
    MeetingCreateResp create(MeetingVo param);

    @RequestLine(OaApiUris.API_MEETING_UPDATE)
    RespStatus update(MeetingVo param);

    @RequestLine(OaApiUris.API_MEETING_CANCEL)
    RespStatus cancel(MeetingCancelParam param);

    @RequestLine(OaApiUris.API_MEETING_GET_DETAIL)
    MeetingDetailResp detail(CalendarSaveParam param);

    @RequestLine(OaApiUris.API_MEETING_GET_USER_MEETINGID)
    MeetingGetUserMeetingResp getUserMeetingId(MeetingGetUserMeetingidParam param);

}
