package chat.qiye.wechat.sdk.api.material;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.constant.BaseApiUris;
import chat.qiye.wechat.sdk.api.material.resp.UploadImgResp;
import chat.qiye.wechat.sdk.api.material.resp.UploadResp;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

/**
 *
 * 素材管理
 *
 * https://work.weixin.qq.com/api/doc/90000/90135/91054
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/26
 */

@QiYeWeChatApi(isFile = true)
public interface MediaUploadApi {

  @Headers("Content-Type: multipart/form-data")
  @RequestLine(BaseApiUris.API_MEDIA_UPLOAD)
  UploadResp upload(@Param("type") String type, @Param("name") String name, @Param("filename") String filename,  @Param("file") byte[] file);

  @Headers("Content-Type: multipart/form-data")
  @RequestLine(BaseApiUris.API_MEDIA_UPLOADIMG)
  UploadImgResp uploadImg(@Param("type") String type, @Param("name") String name, @Param("filename") String filename,  @Param("file") byte[] file);


}
