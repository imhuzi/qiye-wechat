package chat.qiye.wechat.sdk.api.live;

import chat.qiye.wechat.sdk.annotation.QiYeChatApi;
import chat.qiye.wechat.sdk.api.live.param.GetLivingCodeParam;
import chat.qiye.wechat.sdk.api.live.param.GetLivingShareInfoParam;
import chat.qiye.wechat.sdk.api.live.param.GetLivingWatchStatParam;
import chat.qiye.wechat.sdk.api.live.param.GetUserAllLivingIdParam;
import chat.qiye.wechat.sdk.api.live.param.LivingCreateParam;
import chat.qiye.wechat.sdk.api.live.param.LivingIdParam;
import chat.qiye.wechat.sdk.api.live.param.LivingUpdateParam;
import chat.qiye.wechat.sdk.api.live.resp.GetLivingCodeResp;
import chat.qiye.wechat.sdk.api.live.resp.GetLivingShareInfoResp;
import chat.qiye.wechat.sdk.api.live.resp.GetLivingWatchStatResp;
import chat.qiye.wechat.sdk.api.live.resp.GetUserAllLivingIdResp;
import chat.qiye.wechat.sdk.api.live.resp.LivingCreateResp;
import chat.qiye.wechat.sdk.api.live.resp.LivingDetailResp;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.SysAppIdEnum;
import feign.Param;
import feign.RequestLine;

/**
 * 直播
 * <p>
 * https://open.work.weixin.qq.com/api/doc/90000/90135/93633
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/10
 */

@QiYeChatApi(appType = SysAppIdEnum.APP_LIVING)
public interface LivingApi {
    // 创建预约直播
    String API_LIVING_CREATE = "POST /living/create";
    //
    String API_LIVING_UPDATE = "POST /living/modify";
    //修改预约直播
    String API_LIVING_CANCEL = "POST /living/cancel";
    //
    String API_LIVING_DELETE_REPLAY_DATA = "POST /living/delete_replay_data";
    //
    String API_LIVING_GET_LIVING_CODE = "POST /living/get_living_code";
    //
    String API_LIVING_GET_USER_ALL_LIVINGID = "POST /living/get_user_all_livingid";
    //
    String API_LIVING_GET_LIVING_INFO = "POST /living/get_living_info?livingid={livingid}";
    //
    String API_LIVING_GET_WATCH_STAT = "POST /living/get_watch_stat";
    //
    String API_LIVING_GET_LIVING_SHARE_INFO = "POST /living/get_living_share_info";


    @RequestLine(API_LIVING_CREATE)
    LivingCreateResp create(LivingCreateParam param);

    @RequestLine(API_LIVING_UPDATE)
    RespStatus update(LivingUpdateParam param);

    @RequestLine(API_LIVING_CANCEL)
    RespStatus cancel(LivingIdParam param);

    @RequestLine(API_LIVING_DELETE_REPLAY_DATA)
    RespStatus delReplayData(LivingIdParam param);

    @RequestLine(API_LIVING_GET_LIVING_CODE)
    GetLivingCodeResp getLivingCode(GetLivingCodeParam param);

    @RequestLine(API_LIVING_GET_USER_ALL_LIVINGID)
    GetUserAllLivingIdResp getUserAllLivingId(GetUserAllLivingIdParam param);

    @RequestLine(API_LIVING_GET_LIVING_INFO)
    LivingDetailResp getDetail(@Param("livingid") String livingid);

    @RequestLine(API_LIVING_GET_WATCH_STAT)
    GetLivingWatchStatResp getWatchStat(GetLivingWatchStatParam param);

    @RequestLine(API_LIVING_GET_LIVING_SHARE_INFO)
    GetLivingShareInfoResp getShareInfo(GetLivingShareInfoParam param);


}
