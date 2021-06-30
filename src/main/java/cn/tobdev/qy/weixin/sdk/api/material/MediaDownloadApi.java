package cn.tobdev.qy.weixin.sdk.api.material;

import cn.tobdev.qy.weixin.sdk.annotation.WorkWeixinApi;
import cn.tobdev.qy.weixin.sdk.api.material.resp.UploadImgResp;
import cn.tobdev.qy.weixin.sdk.api.material.resp.UploadResp;
import cn.tobdev.qy.weixin.sdk.constant.BaseApiUris;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import feign.Response;

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
public interface MediaDownloadApi {
  /**
   * 获取临时素材
   *
   * 请求方式：GET（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/media/get?access_token=ACCESS_TOKEN&media_id=MEDIA_ID
   *
   * @param mediaId
   * @return
   */
  @RequestLine(BaseApiUris.API_MEDIA_GET)
  Response download(@Param("media_id") String mediaId);


  /**
   * 获取临时素材
   *
   * 请求方式：GET（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/media/get?access_token=ACCESS_TOKEN&media_id=MEDIA_ID
   *
   * @param mediaId
   * @return
   */
  @RequestLine(BaseApiUris.API_MEDIA_GET_JSSDK)
  Response downloadVoice(@Param("media_id") String mediaId);
}
