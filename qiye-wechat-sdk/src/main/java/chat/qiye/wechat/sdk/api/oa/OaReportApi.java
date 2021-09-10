package chat.qiye.wechat.sdk.api.oa;

import chat.qiye.wechat.sdk.annotation.QiYeChatApi;
import chat.qiye.wechat.sdk.api.oa.resp.CorpCheckInRuleResp;
import chat.qiye.wechat.sdk.constant.OaApiUris;
import chat.qiye.wechat.sdk.constant.SysAppIdEnum;
import feign.RequestLine;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/8
 */

@QiYeChatApi(appType = SysAppIdEnum.APP_REPORT)
public interface OaReportApi {

    @RequestLine(OaApiUris.API_GET_JOURNAL_RECORD_LIST)
    CorpCheckInRuleResp getRecordList();

    @RequestLine(OaApiUris.API_GET_JOURNAL_RECORD_DETAIL)
    CorpCheckInRuleResp getRecordDetail();


    @RequestLine(OaApiUris.API_GET_JOURNAL_STAT_LIST)
    CorpCheckInRuleResp getRecordStat();



}
