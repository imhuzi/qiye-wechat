package chat.qiye.wechat.sdk.api.material;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.constant.BaseApiUris;
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

@QiYeWeChatApi
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
