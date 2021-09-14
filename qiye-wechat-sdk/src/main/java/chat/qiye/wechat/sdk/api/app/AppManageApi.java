package chat.qiye.wechat.sdk.api.app;


import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.app.param.CreateAppMenuParam;
import chat.qiye.wechat.sdk.api.app.param.GetWorkbenchTemplateParam;
import chat.qiye.wechat.sdk.api.app.param.SetAppAgentParam;
import chat.qiye.wechat.sdk.api.app.param.WorkbenchTemplateDataParam;
import chat.qiye.wechat.sdk.api.app.resp.AppInfoResp;
import chat.qiye.wechat.sdk.api.app.resp.GetAppMenuResp;
import chat.qiye.wechat.sdk.api.app.resp.WorkbenchTemplateResp;
import chat.qiye.wechat.sdk.api.app.vo.WorkbenchTemplate;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.BaseApiUris;
import feign.Param;
import feign.RequestLine;

/**
 * 应用管理
 * <p>
 * https://work.weixin.qq.com/api/doc/90000/90135/90226
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/6/6
 */
@QiYeWeChatApi
public interface AppManageApi {
    /**
     * 获取指定的应用详情
     * <p>
     * 对于互联企业的应用，如果需要获取应用可见范围内其他互联企业的部门与成员，请调用互联企业-获取应用可见范围接口
     * <p>
     * 请求方式：GET（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/agent/get?access_token=ACCESS_TOKEN&agentid=AGENTID
     *
     * @param agentid 参数	必须	说明
     *                access_token	是	调用接口凭证
     *                agentid	是	应用id
     * @return
     */
    @RequestLine(BaseApiUris.API_AGENT_GET)
    AppInfoResp get(@Param("agentid") Integer agentid);

    /**
     * 设置应用
     *
     * @param param
     * @return
     */
    @RequestLine(BaseApiUris.API_AGENT_SET)
    RespStatus set(SetAppAgentParam param);

    /**
     * 删除 应用菜单
     * <p>
     * 请求方式：GET（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN&agentid=AGENTID
     * <p>
     * 参数说明：
     *
     * @param agentid access_token	是	调用接口凭证
     *                agentid	是	应用id
     * @return
     */
    @RequestLine(BaseApiUris.API_AGENT_MENU_DELETE)
    RespStatus delMenu(@Param("agentid") Integer agentid);

    /**
     * 获取 菜单 信息
     *
     * @param agentid
     * @return
     */
    @RequestLine(BaseApiUris.API_AGENT_MENU_GET)
    GetAppMenuResp getMenu(@Param("agentid") Integer agentid);

    /**
     * 创建 菜单
     *
     * @param agentid
     * @param menuParam
     * @return
     */
    @RequestLine(BaseApiUris.API_AGENT_MENU_CREATE)
    RespStatus createMenu(@Param("agentid") Integer agentid, CreateAppMenuParam menuParam);


    @RequestLine(BaseApiUris.API_AGENT_WORKBENCH_TEMPLATE_SET)
    RespStatus setWorkbenchTemplate(WorkbenchTemplate param);


    @RequestLine(BaseApiUris.API_AGENT_WORKBENCH_TEMPLATE_GET)
    WorkbenchTemplateResp getWorkbenchTemplate(GetWorkbenchTemplateParam param);

    @RequestLine(BaseApiUris.API_AGENT_WORKBENCH_SET_DATA)
    RespStatus setWorkbenchData(WorkbenchTemplateDataParam param);


}
