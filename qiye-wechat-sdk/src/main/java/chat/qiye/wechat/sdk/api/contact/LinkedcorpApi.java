package chat.qiye.wechat.sdk.api.contact;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.contact.param.LinkedcorpDeptListParam;
import chat.qiye.wechat.sdk.api.contact.param.LinkedcorpUserGetParam;
import chat.qiye.wechat.sdk.api.contact.param.LinkedcorpUserListParam;
import chat.qiye.wechat.sdk.api.contact.resp.LinkedcorpAgentPermGetResp;
import chat.qiye.wechat.sdk.api.contact.resp.LinkedcorpDeptListResp;
import chat.qiye.wechat.sdk.api.contact.resp.LinkedcorpUserGetResp;
import chat.qiye.wechat.sdk.api.contact.resp.LinkedcorpUserListResp;
import chat.qiye.wechat.sdk.api.contact.resp.LinkedcorpUserSimpleListResp;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import chat.qiye.wechat.sdk.constant.BaseApiUris;
import feign.RequestLine;

/**
 * 互联企业 相关 接口
 *
 * <p>
 * https://work.weixin.qq.com/api/doc/90000/90135/93167
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/6/18
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_CONTACT)
public interface LinkedcorpApi {

    /**
     * 获取应用的可见范围
     * 本接口只返回互联企业中非本企业内的成员和部门的信息，如果要获取本企业的可见范围，请调用“获取应用”接口
     * <p>
     * 请求方式： POST（HTTPS）
     * 请求地址： https://qyapi.weixin.qq.com/cgi-bin/linkedcorp/agent/get_perm_list?access_token=ACCESS_TOKEN
     *
     * @return {@link LinkedcorpAgentPermGetResp}
     */
    @RequestLine(BaseApiUris.API_LINKEDCORP_AGENT_GET_PERM_LIST)
    LinkedcorpAgentPermGetResp list();

    /**
     * 获取互联企业成员详细信息
     * 请求方式： POST（HTTPS）
     * 请求地址： https://qyapi.weixin.qq.com/cgi-bin/linkedcorp/user/get?access_token=ACCESS_TOKEN
     *
     * 请求包体：
     *
     * {
     *    "userid": "CORPID/USERID"
     * }
     * 参数说明：
     *
     * 参数	必须	说明
     * access_token	是	调用接口凭证
     * userid	是	该字段用的是互联应用可见范围接口返回的userids参数，用的是 CorpId + ’/‘ + USERID 拼成的字符串
     *
     * @param param
     * @return
     */
    @RequestLine(BaseApiUris.API_LINKEDCORP_USER_GET)
    LinkedcorpUserGetResp userGet(LinkedcorpUserGetParam param);

    /**
     * 获取互联企业部门成员
     * 请求方式： POST（HTTPS）
     * 请求地址： https://qyapi.weixin.qq.com/cgi-bin/linkedcorp/user/simplelist?access_token=ACCESS_TOKEN
     *
     * 请求包体：
     *
     * {
     *    "department_id": "LINKEDID/DEPARTMENTID",
     *    "fetch_child": true
     * }
     * 参数说明：
     *
     * 参数	必须	说明
     * access_token	是	调用接口凭证
     * department_id	是	该字段用的是互联应用可见范围接口返回的department_ids参数，用的是 linkedid + ’/‘ + department_id 拼成的字符串
     * fetch_child	否	是否递归获取子部门下面的成员：1-递归获取，0-只获取本部门，不传默认只获取本部门成员
     *
     * @param param
     * @return
     */
    @RequestLine(BaseApiUris.API_LINKEDCORP_USER_SIMPLELIST)
    LinkedcorpUserSimpleListResp userSimpleList(LinkedcorpUserListParam param);

    /**
     * 获取互联企业部门成员详情
     * 请求方式： POST（HTTPS）
     * 请求地址： https://qyapi.weixin.qq.com/cgi-bin/linkedcorp/user/list?access_token=ACCESS_TOKEN
     *
     * 请求包体：
     *
     * {
     *    "department_id": "LINKEDID/DEPARTMENTID",
     *    "fetch_child": true
     * }
     * 参数说明：
     *
     * 参数	必须	说明
     * access_token	是	调用接口凭证
     * department_id	是	该字段用的是互联应用可见范围接口返回的department_ids参数，用的是 linkedid + ’/‘ + department_id 拼成的字符串
     * fetch_child	否	是否递归获取子部门下面的成员：1-递归获取，0-只获取本部门，不传默认只获取本部门成员
     *
     * @param param
     * @return
     */
    @RequestLine(BaseApiUris.API_LINKEDCORP_USER_LIST)
    LinkedcorpUserListResp userList(LinkedcorpUserListParam param);

    /**
     * 获取互联企业部门列表
     * 请求方式： POST（HTTPS）
     * 请求地址： https://qyapi.weixin.qq.com/cgi-bin/linkedcorp/department/list?access_token=ACCESS_TOKEN
     *
     * 请求包体：
     *
     * {
     *    "department_id": "LINKEDID/DEPARTMENTID"
     * }
     * 参数说明：
     *
     * 参数	必须	说明
     * access_token	是	调用接口凭证
     * department_id	是	该字段用的是互联应用可见范围接口返回的department_ids参数，用的是 linkedid + ’/‘ + department_id 拼成的字符串
     *
     * @param param
     * @return
     */
    @RequestLine(BaseApiUris.API_LINKEDCORP_DEPARTMENT_LIST)
    LinkedcorpDeptListResp deptList(LinkedcorpDeptListParam param);

}
