package cn.tobdev.qy.weixin.sdk.api.contact;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.Body;
import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.Post;
import com.dtflys.forest.annotation.Query;

import cn.tobdev.qy.weixin.sdk.api.contact.req.ContactInviteParam;
import cn.tobdev.qy.weixin.sdk.api.contact.req.ContactToOpenIdParam;
import cn.tobdev.qy.weixin.sdk.api.contact.req.ContactToUserIdParam;
import cn.tobdev.qy.weixin.sdk.api.contact.req.ContactUserBatchDeleteParam;
import cn.tobdev.qy.weixin.sdk.api.contact.req.ContactUserParam;
import cn.tobdev.qy.weixin.sdk.api.contact.req.GetActiveStatParam;
import cn.tobdev.qy.weixin.sdk.api.contact.resp.ContactToOpenIdResp;
import cn.tobdev.qy.weixin.sdk.api.contact.resp.ContactToUserIdResp;
import cn.tobdev.qy.weixin.sdk.api.contact.resp.ContactUserGetResp;
import cn.tobdev.qy.weixin.sdk.api.contact.resp.ContactUserListResp;
import cn.tobdev.qy.weixin.sdk.api.contact.resp.GetActiveStatResp;
import cn.tobdev.qy.weixin.sdk.api.contact.resp.GetJoinQrcodeResp;
import cn.tobdev.qy.weixin.sdk.common.RespStatus;
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
   * @return {@link ContactUserListResp}
   */
  @Get(ApiUriEnums.API_USER_LIST)
  ContactUserListResp list(@Query("department_id") Integer id,
      @Query(value = "fetch_child", defaultValue = "0") Integer fetchChild);

  /**
   * 获取 部门下成员
   *
   * @param id 部门id
   * @param fetchChild  1/0：是否递归获取子部门下面的成员
   * @return {@link ContactUserListResp}
   */
  @Get(ApiUriEnums.API_USER_SIMPLE_LIST)
  ContactUserListResp simpleList(@Query("department_id") Integer id,
      @Query(value = "fetch_child", defaultValue = "0") Integer fetchChild);

  /**
   * 根据 userid 读取 通讯录成员
   * https://work.weixin.qq.com/api/doc/90000/90135/90196
   * @param userid 通讯录 用户id
   * @return {@link ContactUserGetResp}
   */
  @Get(ApiUriEnums.API_USER_GET)
  ContactUserGetResp get(@Query("userid") String userid);

  /**
   * https://work.weixin.qq.com/api/doc/90000/90135/90195
   * @param userReq
   * @return {@link RespStatus}
   */
  @Get(ApiUriEnums.API_USER_CREATE)
  RespStatus create(@Body ContactUserParam userReq);

  /**
   * https://work.weixin.qq.com/api/doc/90000/90135/90197
   * @param userReq
   * @return {@link RespStatus}
   */
  @Get(ApiUriEnums.API_USER_UPDATE)
  RespStatus update(@Body ContactUserParam userReq);

  /**
   * https://work.weixin.qq.com/api/doc/90000/90135/90198
   *
   * @param userid
   * @return {@link RespStatus}
   */
  @Get(ApiUriEnums.API_USER_DELETE)
  RespStatus delete(@Query String userid);

  /**
   * https://work.weixin.qq.com/api/doc/90000/90135/90199
   *
   * @param deleteReq
   * @return {@link RespStatus}
   */
  @Post(ApiUriEnums.API_USER_DELETE_BATCH)
  RespStatus deleteBatch(@Body ContactUserBatchDeleteParam deleteReq);

  /**
   * https://work.weixin.qq.com/api/doc/90000/90135/90202
   *
   * @param param
   * @return {@link ContactToOpenIdResp}
   */
  @Post(ApiUriEnums.API_USER_TO_OPENID)
  ContactToOpenIdResp toOpenId(@Body ContactToOpenIdParam param);

  /**
   * https://work.weixin.qq.com/api/doc/90000/90135/90202
   *
   * @param param
   * @return {@link ContactToUserIdResp}
   */
  @Post(ApiUriEnums.API_USER_TO_USERID)
  ContactToUserIdResp toUserid(@Body ContactToUserIdParam param);

  /**
   * https://work.weixin.qq.com/api/doc/90000/90135/90203
   *
   * @param userid
   * @return {@link RespStatus}
   */
  @Get(ApiUriEnums.API_USER_AUTHSUCC)
  RespStatus authsucc(@Query String userid);


  /**
   * https://work.weixin.qq.com/api/doc/90000/90135/90975
   *
   * @param param
   * @return {@link RespStatus}
   */
  @Get(ApiUriEnums.API_USER_INVITE)
  RespStatus invite(@Body ContactInviteParam param);

  /**
   * https://work.weixin.qq.com/api/doc/90000/90135/91714
   *
   * @param type qrcode尺寸类型，1: 171 x 171; 2: 399 x 399; 3: 741 x 741; 4: 2052 x 2052
   * @return {@link RespStatus}
   */
  @Get(ApiUriEnums.API_GET_JOIN_QRCODE)
  GetJoinQrcodeResp getJoinQrcode(@Query("size_type") Integer type);

  /**
   * https://work.weixin.qq.com/api/doc/90000/90135/92714
   *
   * @param param
   * @return {@link RespStatus}
   */
  @Post(ApiUriEnums.API_GET_ACTIVE_STAT)
  GetActiveStatResp getActiveStat(@Body GetActiveStatParam param);



}
