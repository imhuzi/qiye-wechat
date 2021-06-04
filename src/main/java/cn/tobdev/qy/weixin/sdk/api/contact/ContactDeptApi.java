package cn.tobdev.qy.weixin.sdk.api.contact;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.Body;
import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.Query;

import cn.tobdev.qy.weixin.sdk.api.contact.resp.ContactDeptCreateResp;
import cn.tobdev.qy.weixin.sdk.api.contact.resp.ContactDeptListResp;
import cn.tobdev.qy.weixin.sdk.api.contact.vo.ContactDeptVo;
import cn.tobdev.qy.weixin.sdk.constant.ApiUriEnums;
import cn.tobdev.qy.weixin.sdk.interceptor.TokenInterceptor;

/**
 * 通讯录 部门 相关接口
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/3
 */

@BaseRequest(
        baseURL = "${qywx_api_host}",
        interceptor = TokenInterceptor.class
)
public interface ContactDeptApi {

    /**
     * 获取 部门列表
     *
     * @param id 父级部门id
     * @return {@link ContactDeptListResp}
     */
    @Get(ApiUriEnums.API_DEPT_LIST)
    ContactDeptListResp list(@Query("id") Integer id);


    @Get(ApiUriEnums.API_DEPT_CREATE)
    ContactDeptCreateResp create(@Body ContactDeptVo deptResp);


}
