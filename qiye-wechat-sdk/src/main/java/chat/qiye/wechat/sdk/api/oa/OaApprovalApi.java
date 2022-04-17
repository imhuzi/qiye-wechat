package chat.qiye.wechat.sdk.api.oa;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.oa.param.ApprovalApplyEventParam;
import chat.qiye.wechat.sdk.api.oa.param.GetApprovalApplyNumListParam;
import chat.qiye.wechat.sdk.api.oa.param.GetApprovalDetailParam;
import chat.qiye.wechat.sdk.api.oa.param.GetApprovalTemplateParam;
import chat.qiye.wechat.sdk.api.oa.param.GetVacationQuotaParam;
import chat.qiye.wechat.sdk.api.oa.param.SetVacationUserQuotaParam;
import chat.qiye.wechat.sdk.api.oa.resp.AddApprovalApplyEventResp;
import chat.qiye.wechat.sdk.api.oa.resp.ApprovalApplyNumListResp;
import chat.qiye.wechat.sdk.api.oa.resp.ApprovalDetailResp;
import chat.qiye.wechat.sdk.api.oa.resp.GetApprovalTemplateResp;
import chat.qiye.wechat.sdk.api.oa.resp.GetVacationConfResp;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import chat.qiye.wechat.sdk.constant.OaApiUris;
import feign.RequestLine;

/**
 * OA-审批
 * <p>
 * https://open.work.weixin.qq.com/api/doc/90000/90135/90264
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/8
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_APPROVAL)
public interface OaApprovalApi {
    /**
     * 获取审批模板详情
     * 企业可通过审批应用或自建应用Secret调用本接口，获取企业微信“审批应用”内指定审批模板的详情。
     *
     * @param param 较早时间创建的模板，id为类似“1910324946027731_1688852032423522_1808577376_15111111111”的数字串。
     *              <p>
     *              参数说明：
     *              <p>
     *              参数	必须	说明
     *              access_token	是	调用接口凭证。必须使用审批应用或企业内自建应用的secret获取，获取方式参考：文档-获取access_token
     *              template_id	是	模板的唯一标识id。可在“获取审批单据详情”、“审批状态变化回调通知”中获得，也可在审批模板的模板编辑页面浏览器Url链接中获得。
     *              1.审批应用的Secret可获取企业自建模板及第三方服务商添加的模板详情；自建应用的Secret可获取企业自建模板的模板详情。
     *              2.接口调用频率限制为600次/分钟。
     * @return
     */
    @RequestLine(OaApiUris.API_GET_APPROVAL_TEMPLATE)
    GetApprovalTemplateResp getTemplate(GetApprovalTemplateParam param);

    /**
     * 提交审批申请
     * <p>
     * 企业可通过审批应用或自建应用Secret调用本接口，代应用可见范围内员工在企业微信“审批应用”内提交指定类型的审批申请。
     * <p>
     * 请求方式：POST（HTTPS）
     * 请求地址： https://qyapi.weixin.qq.com/cgi-bin/oa/applyevent?access_token=ACCESS_TOKEN
     *
     * @param param
     * @return
     */
    @RequestLine(OaApiUris.API_ADD_APPROVAL_APPLY_EVENT)
    AddApprovalApplyEventResp addApplyEvent(ApprovalApplyEventParam param);

    @RequestLine(OaApiUris.API_GET_APPROVAL_APPLY_NUM_LIST)
    ApprovalApplyNumListResp getApplyNumList(GetApprovalApplyNumListParam param);

    @RequestLine(OaApiUris.API_GET_APPROVAL_DETAIL)
    ApprovalDetailResp getDetail(GetApprovalDetailParam param);

    @RequestLine(OaApiUris.API_GET_VACATION_CONF)
    AddApprovalApplyEventResp getVacationConf();

    @RequestLine(OaApiUris.API_GET_VACATION_USER_QUOTA)
    GetVacationConfResp getVacationUserQuota(GetVacationQuotaParam param);

    @RequestLine(OaApiUris.API_SET_VACATION_USER_QUOTA)
    RespStatus setVacationUserQuota(SetVacationUserQuotaParam param);


}
