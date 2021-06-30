package cn.tobdev.qy.weixin.sdk.api.material;

import java.io.File;

import cn.tobdev.qy.weixin.sdk.annotation.WorkWeixinApi;
import cn.tobdev.qy.weixin.sdk.api.BaseApi;
import cn.tobdev.qy.weixin.sdk.api.material.resp.UploadImgResp;
import cn.tobdev.qy.weixin.sdk.api.material.resp.UploadResp;
import cn.tobdev.qy.weixin.sdk.constant.BaseApiUris;
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

@WorkWeixinApi(isFile = true)
public interface MediaUploadApi {

  @Headers("Content-Type: multipart/form-data")
  @RequestLine(BaseApiUris.API_MEDIA_UPLOAD)
  UploadResp upload(@Param("type") String type, @Param("name") String name, @Param("filename") String filename,  @Param("file") byte[] file);

  @Headers("Content-Type: multipart/form-data")
  @RequestLine(BaseApiUris.API_MEDIA_UPLOADIMG)
  UploadImgResp uploadImg(@Param("type") String type, @Param("name") String name, @Param("filename") String filename,  @Param("file") byte[] file);


}
