package chat.qiye.wechat.sdk.api.oa;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.oa.param.ScheduleDelParam;
import chat.qiye.wechat.sdk.api.oa.param.ScheduleGetByCalendarParam;
import chat.qiye.wechat.sdk.api.oa.param.ScheduleGetListParam;
import chat.qiye.wechat.sdk.api.oa.resp.ScheduleAddResp;
import chat.qiye.wechat.sdk.api.oa.resp.ScheduleGetListResp;
import chat.qiye.wechat.sdk.api.oa.vo.ScheduleVo;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import chat.qiye.wechat.sdk.constant.OaApiUris;
import feign.RequestLine;

/**
 * 日程 接口
 *
 * https://open.work.weixin.qq.com/api/doc/90000/90135/93648
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/10
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_SCHEDULE)
public interface OaScheduleApi {

    @RequestLine(OaApiUris.API_SCHEDULE_ADD)
    ScheduleAddResp add(ScheduleVo param);

    @RequestLine(OaApiUris.API_SCHEDULE_UPDATE)
    RespStatus update(ScheduleVo param);

    @RequestLine(OaApiUris.API_SCHEDULE_GET)
    ScheduleGetListResp get(ScheduleGetListParam param);

    @RequestLine(OaApiUris.API_SCHEDULE_DEL)
    RespStatus del(ScheduleDelParam param);

    @RequestLine(OaApiUris.API_SCHEDULE_GET_BY_CALENDAR)
    ScheduleGetListResp getByCalendar(ScheduleGetByCalendarParam param);

}
