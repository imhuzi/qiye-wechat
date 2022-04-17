package chat.qiye.wechat.sdk.api.wedrive;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.wedrive.param.WeDriveSpaceAclParam;
import chat.qiye.wechat.sdk.api.wedrive.param.WeDriveSpaceCreateParam;
import chat.qiye.wechat.sdk.api.wedrive.param.WeDriveSpaceIdParam;
import chat.qiye.wechat.sdk.api.wedrive.param.WeDriveSpaceRenameParam;
import chat.qiye.wechat.sdk.api.wedrive.param.WeDriveSpaceSettingParam;
import chat.qiye.wechat.sdk.api.wedrive.param.WeDriveSpaceShareParam;
import chat.qiye.wechat.sdk.api.wedrive.resp.WeDriveSpaceCreateResp;
import chat.qiye.wechat.sdk.api.wedrive.resp.WeDriveSpaceInfoResp;
import chat.qiye.wechat.sdk.api.wedrive.resp.WeDriveSpaceShareResp;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import feign.RequestLine;

/**
 * 微盘
 * <p>
 * https://open.work.weixin.qq.com/api/doc/90000/90135/93654
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/10
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_WX_DRIVE)
public interface WeDriveApi {
    // 空间管理
    String API_SPACE_CREATE = "POST /wedrive/space_create";
    String API_SPACE_RENAME = "POST /wedrive/space_rename";
    String API_SPACE_DISMISS = "POST /wedrive/space_dismiss";
    String API_SPACE_INFO = "POST /wedrive/space_info";
    // 空间权限 管理
    String API_SPACE_ACL_ADD = "POST /wedrive/space_acl_add";
    String API_SPACE_ACL_DEL = "POST /wedrive/space_acl_del";
    String API_SPACE_SETTING = "POST /wedrive/space_setting";
    String API_SPACE_SHARE = "POST /wedrive/space_share";

    @RequestLine(API_SPACE_CREATE)
    WeDriveSpaceCreateResp create(WeDriveSpaceCreateParam param);

    @RequestLine(API_SPACE_RENAME)
    RespStatus rename(WeDriveSpaceRenameParam param);

    @RequestLine(API_SPACE_DISMISS)
    RespStatus dismiss(WeDriveSpaceIdParam param);

    @RequestLine(API_SPACE_INFO)
    WeDriveSpaceInfoResp getInfo(WeDriveSpaceIdParam param);


    @RequestLine(API_SPACE_ACL_ADD)
    RespStatus addAcl(WeDriveSpaceAclParam param);

    @RequestLine(API_SPACE_ACL_DEL)
    RespStatus delAcl(WeDriveSpaceAclParam param);

    @RequestLine(API_SPACE_SETTING)
    RespStatus setting(WeDriveSpaceSettingParam param);

    @RequestLine(API_SPACE_SHARE)
    WeDriveSpaceShareResp share(WeDriveSpaceShareParam param);


}
