package cn.tobdev.qy.weixin.sdk.api.contact;


import cn.tobdev.qy.weixin.sdk.api.BaseApi;
import cn.tobdev.qy.weixin.sdk.api.contact.resp.ContactDeptCreateResp;
import cn.tobdev.qy.weixin.sdk.api.contact.resp.ContactDeptListResp;
import cn.tobdev.qy.weixin.sdk.api.contact.vo.ContactDeptVo;
import cn.tobdev.qy.weixin.sdk.common.RespStatus;
import cn.tobdev.qy.weixin.sdk.constant.ApiUri;
import feign.Body;
import feign.Param;
import feign.RequestLine;

/**
 * 通讯录 部门 相关接口
 *
 * https://work.weixin.qq.com/api/doc/90000/90135/90204
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/3
 */
public interface ContactDeptApi extends BaseApi {

  /**
   * 获取 部门列表
   *
   * @param id 父级部门id
   * @return {@link ContactDeptListResp}
   */
  @RequestLine(ApiUri.API_DEPT_LIST)
  ContactDeptListResp list(@Param("id") Integer id);

  @RequestLine(ApiUri.API_DEPT_CREATE)
  ContactDeptCreateResp create(ContactDeptVo deptResp);

  @RequestLine(ApiUri.API_DEPT_UPDATE)
  RespStatus update(ContactDeptVo deptResp);

  @RequestLine(ApiUri.API_DEPT_DELETE)
  RespStatus delete(@Param("id") Integer id);

}
