package chat.qiye.wechat.sdk.api.oa;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.oa.param.CalendarDelParam;
import chat.qiye.wechat.sdk.api.oa.resp.CalendarGetListResp;
import chat.qiye.wechat.sdk.api.oa.param.CalendarGetLsitParam;
import chat.qiye.wechat.sdk.api.oa.param.CalendarSaveParam;
import chat.qiye.wechat.sdk.api.oa.resp.CalendarAddResp;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import chat.qiye.wechat.sdk.constant.OaApiUris;
import feign.RequestLine;

/**
 * 日历接口
 * <p>
 * https://open.work.weixin.qq.com/api/doc/90000/90135/93647
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/10
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_SCHEDULE)
public interface OaCalendarApi {

    @RequestLine(OaApiUris.API_CALENDAR_ADD)
    CalendarAddResp add(CalendarSaveParam param);

    @RequestLine(OaApiUris.API_CALENDAR_UPDATE)
    RespStatus update(CalendarSaveParam param);

    @RequestLine(OaApiUris.API_CALENDAR_DEL)
    RespStatus del(CalendarDelParam param);

    @RequestLine(OaApiUris.API_CALENDAR_GET)
    CalendarGetListResp get(CalendarGetLsitParam param);


}
