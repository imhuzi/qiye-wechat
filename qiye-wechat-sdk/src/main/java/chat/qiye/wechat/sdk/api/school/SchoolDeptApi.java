package chat.qiye.wechat.sdk.api.school;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.school.dto.SchoolDeptDto;
import chat.qiye.wechat.sdk.api.school.param.SchoolContactSyncModelSetParam;
import chat.qiye.wechat.sdk.api.school.resp.SchoolDeptCreateResp;
import chat.qiye.wechat.sdk.api.school.resp.SchoolDeptListResp;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

/**
 * 家校 通讯录 部门相关接口
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/7/6
 */
@Headers(value = {"Accept: application/json", "Content-Type: application/json"})
@QiYeWeChatApi(appType = AppIdEnum.APP_SCHOOL_CONTACT)
public interface SchoolDeptApi {
    /**
     * 设置家校通讯录自动同步模式
     * 企业和第三方可通过此接口修改家校通讯录与班级标签之间的自动同步模式，注意，一旦设置禁止自动同步，将无法再次开启。
     * <p>
     * 请求方式：POST（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/set_arch_sync_mode?access_token=ACCESS_TOKEN
     * <p>
     * 请求参数：
     * <p>
     * {
     * "arch_sync_mode":1,
     * }
     * 参数说明：
     * <p>
     * 参数	必须	说明
     * access_token	是	调用接口凭证
     * arch_sync_mode	是	家校通讯录同步模式：1-禁止将标签同步至家校通讯录，2-禁止将家校通讯录同步至标签，3-禁止家校通讯录和标签相互同步
     *
     * @param param
     * @return
     */
    @RequestLine(SchoolApiUris.API_DEPT_SET_UPGRADE_INFO)
    RespStatus setUpgradeInfo(SchoolContactSyncModelSetParam param);

    /**
     * 创建部门
     * 请求方式：POST（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/department/create?access_token=ACCESS_TOKEN
     * <p>
     * 请求包体：
     * <p>
     * {
     * "name": "一年级",
     * "parentid": 5,
     * "id": 2,
     * "type": 1,
     * "register_year":2018,
     * "standard_grade":1,
     * "order":1,
     * "department_admins": [
     * {
     * "userid": "zhangsan",
     * "type": 4,
     * "subject":"语文"
     * },
     * {
     * "userid": "lisi",
     * "type": 3,
     * "subject":"数学"
     * }
     * ]
     * }
     *
     * @param param
     * @return
     */
    @RequestLine(SchoolApiUris.API_DEPT_CREATE)
    SchoolDeptCreateResp create(SchoolDeptDto param);

    /**
     * 更新部门
     * 请求方式：POST（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/department/update?access_token=ACCESS_TOKEN
     * <p>
     * 请求包体：
     * <p>
     * {
     * "name": "一年级",
     * "parentid": 5,
     * "id": 2,
     * "register_year":2018,
     * "standard_grade":1,
     * "order":1,
     * "new_id": 100,
     * "department_admins": [
     * {
     * "op": 0,
     * "userid": "zhangsan",
     * "type": 3,
     * "subject":"语文"
     * },
     * {
     * "op": 1
     * "userid": "lisi",
     * "type": 4,
     * "subject":"数学"
     * }
     * ]
     * }
     *
     * @param param
     * @return
     */
    @RequestLine(SchoolApiUris.API_DEPT_UPDATE)
    RespStatus update(SchoolDeptDto param);

    /**
     * 删除部门
     * 请求方式：GET（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/department/delete?access_token=ACCESS_TOKEN&id=ID
     * <p>
     * 参数说明 ：
     * <p>
     * 参数	必须	说明
     * access_token	是	调用接口凭证
     * id	否	部门id。（注：不能删除根部门；不能删除含有子部门、成员的部门）
     *
     * @param deptId
     * @return
     */
    @RequestLine(SchoolApiUris.API_DEPT_DELETE)
    RespStatus delete(@Param("id") Integer deptId);

    /**
     * 获取部门列表
     * 请求方式：GET（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/department/list?access_token=ACCESS_TOKEN&id=ID
     * <p>
     * 参数说明 ：
     * <p>
     * 参数	必须	说明
     * access_token	是	调用接口凭证
     * id	否	部门id。获取指定部门及其下的子部门。 如果不填，默认获取全量组织架构
     * 权限说明：
     * <p>
     * 学校需要使用“家校沟通”secret或配置到“可调用应用”列表中的自建应用secret所获取的accesstoken来调用（accesstoken如何获取？）。
     * 第三方应用需拥有「家校沟通」使用权限。
     *
     * @param deptId
     * @return
     */
    @RequestLine(SchoolApiUris.API_DEPT_LIST)
    SchoolDeptListResp list(@Param("id") Integer deptId);


}
