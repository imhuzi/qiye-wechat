package cn.tobdev.qy.weixin.sdk.api.contact;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.Query;

import cn.tobdev.qy.weixin.sdk.api.contact.resp.ContactUserGetResp;
import cn.tobdev.qy.weixin.sdk.api.contact.resp.ContactUserListResp;
import cn.tobdev.qy.weixin.sdk.constant.ApiUriEnums;
import cn.tobdev.qy.weixin.sdk.interceptor.TokenInterceptor;

/**
 * 通讯录 部门 相关接口
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/3
 */
@BaseRequest(
    baseURL = "${qywx_api_host}",     // 默认域名
    interceptor = TokenInterceptor.class,
    headers = {"Accept:text/plain"}
)
public interface ContactUserApi {

  /**
   * 获取 获取部门成员列表详情
   *
   * @param id 部门id
   * @param fetchChild  1/0：是否递归获取子部门下面的成员
   * @return {@link ContactDeptListResp}
   */
  @Get(ApiUriEnums.API_USER_LIST)
  ContactUserListResp list(@Query("department_id") Integer id,
      @Query(value = "fetch_child", defaultValue = "0") Integer fetchChild);

  /**
   * 获取 部门下成员
   *
   * @param id 部门id
   * @param fetchChild  1/0：是否递归获取子部门下面的成员
   * @return {@link ContactDeptListResp}
   */
  @Get(ApiUriEnums.API_USER_SIMPLE_LIST)
  ContactUserListResp simpleList(@Query("department_id") Integer id,
      @Query(value = "fetch_child", defaultValue = "0") Integer fetchChild);


  @Get(ApiUriEnums.API_USER_GET)
  ContactUserGetResp get(@Query("userid") String userid);
}
