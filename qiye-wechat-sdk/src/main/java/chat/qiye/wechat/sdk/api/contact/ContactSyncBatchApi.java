package chat.qiye.wechat.sdk.api.contact;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.contact.param.BatchSyncDeptParam;
import chat.qiye.wechat.sdk.api.contact.param.BatchSyncUserParam;
import chat.qiye.wechat.sdk.api.contact.resp.BatchSyncResp;
import chat.qiye.wechat.sdk.constant.BaseApiUris;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import feign.Param;
import feign.RequestLine;

/**
 * 异步批量接口
 * <p>
 * https://open.work.weixin.qq.com/api/doc/90000/90135/90979
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/6/18
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_CONTACT)
public interface ContactSyncBatchApi {

    /**
     * 增量更新成员
     * 调试工具
     * 本接口以userid（帐号）为主键，增量更新企业微信通讯录成员。请先下载CSV模板(下载增量更新成员模版)，根据需求填写文件内容。
     * <p>
     * 注意事项：
     * <p>
     * 模板中的部门需填写部门ID，多个部门用分号分隔，部门ID必须为数字，根部门的部门id默认为1
     * 文件中存在、通讯录中也存在的成员，更新成员在文件中指定的字段值
     * 文件中存在、通讯录中不存在的成员，执行添加操作
     * 通讯录中存在、文件中不存在的成员，保持不变
     * 成员字段更新规则：可自行添加扩展字段。文件中有指定的字段，以指定的字段值为准；文件中没指定的字段，不更新
     * 请求方式：POST（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/batch/syncuser?access_token=ACCESS_TOKEN
     *
     * @param param
     * @return
     */
    @RequestLine(BaseApiUris.API_BATCH_SYNCUSER)
    BatchSyncResp syncUser(BatchSyncUserParam param);

    /**
     * 全量覆盖成员
     * 调试工具
     * 本接口以userid为主键，全量覆盖企业的通讯录成员，任务完成后企业的通讯录成员与提交的文件完全保持一致。请先下载CSV文件(下载全量覆盖成员模版)，根据需求填写文件内容。
     * <p>
     * 注意事项：
     * <p>
     * 模板中的部门需填写部门ID，多个部门用分号分隔，部门ID必须为数字，根部门的部门id默认为1
     * 文件中存在、通讯录中也存在的成员，完全以文件为准
     * 文件中存在、通讯录中不存在的成员，执行添加操作
     * 通讯录中存在、文件中不存在的成员，执行删除操作。出于安全考虑，下面两种情形系统将中止导入并返回相应的错误码。
     * 需要删除的成员多于50人，且多于现有人数的20%以上
     * 需要删除的成员少于50人，且多于现有人数的80%以上
     * 成员字段更新规则：可自行添加扩展字段。文件中有指定的字段，以指定的字段值为准；文件中没指定的字段，不更新
     * 请求方式：POST（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/batch/replaceuser?access_token=ACCESS_TOKEN
     *
     * @param param
     * @return
     */
    @RequestLine(BaseApiUris.API_BATCH_REPLACEUSER)
    BatchSyncResp replaceUser(BatchSyncUserParam param);

    /**
     * 全量覆盖部门
     * 调试工具
     * 本接口以partyid为键，全量覆盖企业的通讯录组织架构，任务完成后企业的通讯录组织架构与提交的文件完全保持一致。请先下载CSV文件(下载全量覆盖部门模版)，根据需求填写文件内容。
     * <p>
     * 注意事项：
     * <p>
     * 文件中存在、通讯录中也存在的部门，执行修改操作
     * 文件中存在、通讯录中不存在的部门，执行添加操作
     * 文件中不存在、通讯录中存在的部门，当部门下没有任何成员或子部门时，执行删除操作
     * 文件中不存在、通讯录中存在的部门，当部门下仍有成员或子部门时，暂时不会删除，当下次导入成员把人从部门移出后自动删除
     * CSV文件中，部门名称、部门ID、父部门ID为必填字段，部门ID必须为数字，根部门的部门id默认为1；排序为可选字段，置空或填0不修改排序, order值大的排序靠前。
     * 请求方式：POST（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/batch/replaceparty?access_token=ACCESS_TOKEN
     *
     * @param param
     * @return
     */
    @RequestLine(BaseApiUris.API_BATCH_REPLACEPARTY)
    BatchSyncResp replaceDept(BatchSyncDeptParam param);

    /**
     * 获取异步任务结果
     * 调试工具
     * 请求方式：GET（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/batch/getresult?access_token=ACCESS_TOKEN&jobid=JOBID
     * <p>
     * 参数说明：
     * <p>
     * 参数	必须	说明
     * access_token	是	调用接口凭证
     * jobid	是	异步任务id，最大长度为64字节
     *
     * @param jobid
     * @return
     */
    @RequestLine(BaseApiUris.API_BATCH_GETRESULT)
    BatchSyncResp getResult(@Param(value = "jobid") String jobid);


}
