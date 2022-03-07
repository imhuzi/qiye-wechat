package chat.qiye.wechat.sdk.api.contact;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.contact.param.ExportContactParam;
import chat.qiye.wechat.sdk.api.contact.param.ExportTagUserParam;
import chat.qiye.wechat.sdk.api.contact.resp.ExportResultResp;
import chat.qiye.wechat.sdk.api.contact.resp.ExportSyncResp;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import chat.qiye.wechat.sdk.constant.BaseApiUris;
import feign.Param;
import feign.RequestLine;

/**
 * 异步导出接口
 *
 * https://open.work.weixin.qq.com/api/doc/90000/90135/94850
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/18
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_CONTACT)
public interface ContactSyncExportApi {
    /**
     * 导出成员
     *
     * @param param
     * @return
     */
    @RequestLine(BaseApiUris.API_EXPORT_SIMPLE_USER)
    ExportSyncResp simpleUser(ExportContactParam param);

    /**
     * 导出成员详情
     *
     * @param param
     * @return
     */
    @RequestLine(BaseApiUris.API_EXPORT_USER)
    ExportSyncResp user(ExportContactParam param);

    /**
     * 导出部门
     * 请求方式：POST（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/export/department?access_token=ACCESS_TOKEN
     *
     * 请求示例:
     *
     * {
     *     "encoding_aeskey": "IJUiXNpvGbODwKEBSEsAeOAPAhkqHqNCF6g19t9wfg2",
     *     "block_size": 1000000
     * }
     * 参数说明：
     *
     * 参数	必须	说明
     * access_token	是	调用接口凭证
     * encoding_aeskey	是	base64encode的加密密钥，长度固定为43，加密方式采用aes-256-cbc方式
     * block_size	否	每块数据的部门数，支持范围[10^4,10^6]，默认值为10^6
     *
     * @param param
     * @return
     */
    @RequestLine(BaseApiUris.API_EXPORT_DEPARTMENT)
    ExportSyncResp dept(ExportContactParam param);

    /**
     * 导出标签成员
     * 请求方式：POST（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/export/taguser?access_token=ACCESS_TOKEN
     *
     * 请求示例:
     *
     * {
     *     "tagid": 1,
     *     "encoding_aeskey": "IJUiXNpvGbODwKEBSEsAeOAPAhkqHqNCF6g19t9wfg2",
     *     "block_size": 1000000
     * }
     * 参数说明：
     *
     * 参数	必须	说明
     * access_token	是	调用接口凭证
     * tagid	是	需要导出的标签
     * encoding_aeskey	是	base64encode的加密密钥，长度固定为43，加密方式采用aes-256-cbc方式
     * block_size	否	每块数据的人员数和部门数之和，支持范围[10^4,10^6]，默认值为10^6
     *
     * @param param
     * @return
     */
    @RequestLine(BaseApiUris.API_EXPORT_TAGUSER)
    ExportSyncResp dept(ExportTagUserParam param);

    /**
     * 获取导出结果
     *
     * https://open.work.weixin.qq.com/api/doc/90000/90135/94854
     *
     * @param jobid
     * @return
     */
    @RequestLine(BaseApiUris.API_EXPORT_GET_RESULT)
    ExportResultResp getResult(@Param(value = "jobid") String jobid);




}
