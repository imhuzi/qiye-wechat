package chat.qiye.wechat.sdk.api.oa;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.oa.param.GetJournalDetailParam;
import chat.qiye.wechat.sdk.api.oa.param.GetJournalRecordListParam;
import chat.qiye.wechat.sdk.api.oa.param.GetJournalStatListParam;
import chat.qiye.wechat.sdk.api.oa.resp.GetJournalDetailResp;
import chat.qiye.wechat.sdk.api.oa.resp.GetJournalRecordListResp;
import chat.qiye.wechat.sdk.api.oa.resp.GetJournalStatListResp;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import chat.qiye.wechat.sdk.constant.OaApiUris;
import feign.RequestLine;

/**
 * OA 汇报
 * https://open.work.weixin.qq.com/api/doc/90000/90135/93496
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/8
 */

@QiYeWeChatApi(appType = AppIdEnum.APP_REPORT)
public interface OaReportApi {

    @RequestLine(OaApiUris.API_GET_JOURNAL_RECORD_LIST)
    GetJournalRecordListResp getRecordList(GetJournalRecordListParam param);

    @RequestLine(OaApiUris.API_GET_JOURNAL_RECORD_DETAIL)
    GetJournalDetailResp getRecordDetail(GetJournalDetailParam param);


    @RequestLine(OaApiUris.API_GET_JOURNAL_STAT_LIST)
    GetJournalStatListResp getRecordStat(GetJournalStatListParam param);



}
