package chat.qiye.wechat.sdk.api.oa;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.oa.param.CorpApprovalDataQueryParam;
import chat.qiye.wechat.sdk.api.oa.resp.CorpApprovalDataQueryResp;
import chat.qiye.wechat.sdk.constant.OaApiUris;
import feign.RequestLine;

/**
 * 审批流程引擎 相关接口
 * <p>
 * https://open.work.weixin.qq.com/api/doc/90000/90135/90269
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/9
 */
@QiYeWeChatApi
public interface OaCorpApprovalApi {

    @RequestLine(OaApiUris.API_GET_CORP_APPROVAL_DATA)
    CorpApprovalDataQueryResp getTemplate(CorpApprovalDataQueryParam param);

}
