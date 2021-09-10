package chat.qiye.wechat.sdk.api.oa;

import chat.qiye.wechat.sdk.annotation.QiYeChatApi;
import chat.qiye.wechat.sdk.api.oa.param.PstnccCallParam;
import chat.qiye.wechat.sdk.api.oa.param.PstnccGetCallStateParam;
import chat.qiye.wechat.sdk.api.oa.resp.PstnccCallResp;
import chat.qiye.wechat.sdk.api.oa.resp.PstnccCallResultStateResp;
import chat.qiye.wechat.sdk.constant.OaApiUris;
import chat.qiye.wechat.sdk.constant.SysAppIdEnum;
import feign.RequestLine;

/**
 * OA 紧急通知
 * https://open.work.weixin.qq.com/api/doc/90000/90135/91623
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/8
 */

@QiYeChatApi(appType = SysAppIdEnum.APP_PSTNCC)
public interface OaPstnccApi {

    @RequestLine(OaApiUris.API_PSTNCC_CALL)
    PstnccCallResp call(PstnccCallParam param);

    @RequestLine(OaApiUris.API_GET_PSTNCC_STATE)
    PstnccCallResultStateResp getCallResultState(PstnccGetCallStateParam param);


}
