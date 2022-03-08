package chat.qiye.wechat.sdk.api.contact;


import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.contact.param.*;
import chat.qiye.wechat.sdk.api.contact.resp.*;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import chat.qiye.wechat.sdk.constant.BaseApiUris;
import feign.Param;
import feign.RequestLine;

/**
 * 通讯录 部门 相关接口
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/3
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_CONTACT)
public interface ContactUserApi {

    /**
     * 获取 获取部门成员列表详情
     *
     * @param id 部门id
     * @param fetchChild  1/0：是否递归获取子部门下面的成员
     * @return {@link ContactUserListResp}
     */
    @RequestLine(BaseApiUris.API_USER_LIST)
    ContactUserListResp list(@Param("department_id") Integer id, @Param(value = "fetch_child") Integer fetchChild);

    /**
     * 获取 部门下成员
     *
     * @param id 部门id
     * @param fetchChild  1/0：是否递归获取子部门下面的成员
     * @return {@link ContactUserListResp}
     */
    @RequestLine(BaseApiUris.API_USER_SIMPLE_LIST)
    ContactUserListResp simpleList(@Param("department_id") Integer id, @Param(value = "fetch_child") Integer fetchChild);

    /**
     * 根据 userid 读取 通讯录成员
     * https://work.weixin.qq.com/api/doc/90000/90135/90196
     * @param userid 通讯录 用户id
     * @return {@link ContactUserGetResp}
     */
    @RequestLine(BaseApiUris.API_USER_GET)
    ContactUserGetResp get(@Param("userid") String userid);

    /**
     * https://work.weixin.qq.com/api/doc/90000/90135/90195
     * @param userReq
     * @return {@link RespStatus}
     */
    @RequestLine(BaseApiUris.API_USER_CREATE)
    RespStatus create(ContactUserParam userReq);

    /**
     * https://work.weixin.qq.com/api/doc/90000/90135/90197
     * @param userReq
     * @return {@link RespStatus}
     */
    @RequestLine(BaseApiUris.API_USER_UPDATE)
    RespStatus update(ContactUserParam userReq);

    /**
     * https://work.weixin.qq.com/api/doc/90000/90135/90198
     *
     * @param userid
     * @return {@link RespStatus}
     */
    @RequestLine(BaseApiUris.API_USER_DELETE)
    RespStatus delete(@Param("userid") String userid);

    /**
     * https://work.weixin.qq.com/api/doc/90000/90135/90199
     *
     * @param deleteReq
     * @return {@link RespStatus}
     */
    @RequestLine(BaseApiUris.API_USER_DELETE_BATCH)
    RespStatus deleteBatch(ContactUserBatchDeleteParam deleteReq);

    /**
     * https://work.weixin.qq.com/api/doc/90000/90135/90202
     *
     * @param param
     * @return {@link ContactToOpenIdResp}
     */
    @RequestLine(BaseApiUris.API_USER_TO_OPENID)
    ContactToOpenIdResp toOpenId(ContactToOpenIdParam param);

    /**
     * https://work.weixin.qq.com/api/doc/90000/90135/90202
     *
     * @param param
     * @return {@link ContactToUserIdResp}
     */
    @RequestLine(BaseApiUris.API_USER_TO_USERID)
    ContactToUserIdResp toUserid(ContactToUserIdParam param);

    /**
     * https://work.weixin.qq.com/api/doc/90000/90135/90203
     *
     * @param userid
     * @return {@link RespStatus}
     */
    @RequestLine(BaseApiUris.API_USER_AUTHSUCC)
    RespStatus authsucc(@Param("userid") String userid);


    /**
     * https://work.weixin.qq.com/api/doc/90000/90135/90975
     *
     * @param param
     * @return {@link RespStatus}
     */
    @RequestLine(BaseApiUris.API_USER_INVITE)
    RespStatus invite(ContactInviteParam param);

    /**
     * https://work.weixin.qq.com/api/doc/90000/90135/91714
     *
     * @param type qrcode尺寸类型，1: 171 x 171; 2: 399 x 399; 3: 741 x 741; 4: 2052 x 2052
     * @return {@link GetJoinQrcodeResp}
     */
    @RequestLine(BaseApiUris.API_GET_JOIN_QRCODE)
    GetJoinQrcodeResp getJoinQrcode(@Param("size_type") Integer type);

    /**
     * https://work.weixin.qq.com/api/doc/90000/90135/92714
     *
     * @param param
     * @return {@link GetActiveStatResp}
     */
    @RequestLine(BaseApiUris.API_GET_ACTIVE_STAT)
    GetActiveStatResp getActiveStat(GetActiveStatParam param);

    /**
     * 第三方 专属接口
     *
     * 手机号获取userid,通过手机号获取其所对应的userid。
     *
     * https://work.weixin.qq.com/api/doc/90001/90143/91693
     * @param param 请求参数
     * @return {@link GetUserIdResp}
     */
    @RequestLine(BaseApiUris.API_USER_GET_USERID)
    GetUserIdResp getUserIdByPhone(GetUserIdParam param);


    /**
     * 第三方 专属接口
     *
     * 获取成员授权列表,当企业当前授权模式为成员授权时，可调用该接口获取成员授权列表。
     *
     * https://work.weixin.qq.com/api/doc/90001/90143/94513
     *
     * @param param 请求参数
     * @return {@link AuthMemberListResp}
     */
    @RequestLine(BaseApiUris.API_USER_AUTH_MEMBER_LIST)
    AuthMemberListResp getAuthMemberList(AuthMemberListParam param);

    /**
     *  第三方 专属接口
     *
     * 查询成员用户是否已授权
     *
     * 当企业当前授权模式为成员授权时，可调用该接口查询成员用户是否已授权
     *
     * https://work.weixin.qq.com/api/doc/90001/90143/94514
     *
     * @param param 请求参数
     * @return {@link CheckMemberAuthResp}
     */
    @RequestLine(BaseApiUris.API_USER_CHECK_MEMBER_AUTH)
    CheckMemberAuthResp checkMemberAuth(CheckMemberAuthParam param);

    /**
     *  第三方 专属接口
     *
     * 获取选人ticket对应的用户
     * 当企业以成员授权的方式安装了第三方应用，成员在企业微信终端通过选人jsapi选择通讯录，应用获取到selectedTicket后，可调用该接口获取SelectedTicket对应的用户open_userid列表。
     *
     * 请求方式：POST（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/user/list_selected_ticket_user?access_token=ACCESS_TOKEN
     *
     * 请求包体：
     *
     * {
     * 	"selected_ticket": "xxxx"
     * }
     * 参数说明：
     *
     * 参数	必须	说明
     * access_token	是	调用接口凭证
     * selected_ticket	是	选人jsapi返回的selectedTicket
     *
     * @param param
     * @return
     */
    @RequestLine(BaseApiUris.API_LIST_SELECTED_TICKET_USER)
    ListSelectedTicketUserResp listSelectedTicketUser(ListSelectedTicketUserParam param);

}
