package chat.qiye.wechat.sdk.api.wedrive;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.wedrive.param.*;
import chat.qiye.wechat.sdk.api.wedrive.resp.FileCreateResp;
import chat.qiye.wechat.sdk.api.wedrive.resp.FileDownloadResp;
import chat.qiye.wechat.sdk.api.wedrive.resp.FileInfoResp;
import chat.qiye.wechat.sdk.api.wedrive.resp.FileListResp;
import chat.qiye.wechat.sdk.api.wedrive.resp.FileMoveResp;
import chat.qiye.wechat.sdk.api.wedrive.resp.FileRenameResp;
import chat.qiye.wechat.sdk.api.wedrive.resp.FileUploadResp;
import chat.qiye.wechat.sdk.api.wedrive.resp.WeDriveFileShareResp;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import feign.RequestLine;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/10
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_WX_DRIVE)
public interface WeDriveFileApi {
    // 文件管理
    String API_FILE_LIST = "POST /wedrive/file_list";
    String API_FILE_UPLOAD = "POST /wedrive/file_upload";
    String API_FILE_DOWNLOAD = "POST /wedrive/file_download";
    String API_FILE_CREATE = "POST /wedrive/file_create";
    String API_FILE_RENAME = "POST /wedrive/file_rename";
    String API_FILE_MOVE = "POST /wedrive/file_move";
    String API_FILE_DELETE = "POST /wedrive/file_delete";
    String API_FILE_INFO = "POST /wedrive/file_info";
    // 文件权限
    String API_FILE_ADD_ACL = "POST /wedrive/file_acl_add";
    String API_FILE_DEL_ACL = "POST /wedrive/file_acl_del";
    String API_FILE_SETTING = "POST /wedrive/file_setting";
    String API_FILE_SHARE = "POST /wedrive/file_share";


    @RequestLine(API_FILE_LIST)
    FileListResp list(FileListParam param);

    @RequestLine(API_FILE_UPLOAD)
    FileUploadResp upload(FileUploadParam param);

    @RequestLine(API_FILE_DOWNLOAD)
    FileDownloadResp download(FileDownloadParam param);

    @RequestLine(API_FILE_CREATE)
    FileCreateResp create(FileCreateParam param);

    @RequestLine(API_FILE_RENAME)
    FileRenameResp rename(FileRenameParam param);

    @RequestLine(API_FILE_MOVE)
    FileMoveResp move(FileMoveParam param);

    @RequestLine(API_FILE_DELETE)
    RespStatus delete(FileDelParam param);

    @RequestLine(API_FILE_INFO)
    FileInfoResp getInfo(FileIdAndUserIdParam param);



    @RequestLine(API_FILE_ADD_ACL)
    RespStatus addAcl(WeDriveFileAclParam param);

    @RequestLine(API_FILE_DEL_ACL)
    RespStatus delAcl(WeDriveFileAclParam param);

    @RequestLine(API_FILE_SETTING)
    RespStatus setting(FileSettingParam param);

    @RequestLine(API_FILE_SETTING)
    WeDriveFileShareResp share(FileIdAndUserIdParam param);





}
