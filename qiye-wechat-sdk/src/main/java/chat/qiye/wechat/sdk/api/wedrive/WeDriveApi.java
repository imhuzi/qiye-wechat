package chat.qiye.wechat.sdk.api.wedrive;

import chat.qiye.wechat.sdk.annotation.QiYeChatApi;
import chat.qiye.wechat.sdk.api.wedrive.param.WeDriveSpaceIdParam;
import chat.qiye.wechat.sdk.api.wedrive.param.WeDriveSpaceRenameParam;
import chat.qiye.wechat.sdk.api.wedrive.resp.WeDriveSpaceInfoResp;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.SysAppIdEnum;
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
@QiYeChatApi(appType = SysAppIdEnum.APP_LIVING)
public interface WeDriveApi {
    // 空间管理
    String API_SPACE_CREATE = "POST /wedrive/space_create";
    String API_SPACE_RENAME = "POST /wedrive/space_rename";
    String API_SPACE_DISMISS = "POST /wedrive/space_dismiss";
    String API_SPACE_INFO = "POST /wedrive/space_info";
    // 空间权限 管理

    @RequestLine(API_SPACE_RENAME)
    RespStatus rename(WeDriveSpaceRenameParam param);

    @RequestLine(API_SPACE_DISMISS)
    RespStatus dismiss(WeDriveSpaceIdParam param);

    @RequestLine(API_SPACE_INFO)
    WeDriveSpaceInfoResp getInfo(WeDriveSpaceIdParam param);


}
