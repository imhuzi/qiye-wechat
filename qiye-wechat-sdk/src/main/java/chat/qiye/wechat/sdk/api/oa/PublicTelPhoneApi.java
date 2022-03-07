package chat.qiye.wechat.sdk.api.oa;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.oa.param.PublicTelPhoneGetDialRecordParam;
import chat.qiye.wechat.sdk.api.oa.resp.PublicTelPhoneGetDialRecordResp;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import feign.RequestLine;

/**
 * 公费电话
 * <p>
 * https://work.weixin.qq.com/api/doc/90000/90135/93653
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/13
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_PUBLIC_PHONE)
public interface PublicTelPhoneApi {
    String DIAL_GET_RECORD = "POST /dial/get_dial_record";


    @RequestLine(DIAL_GET_RECORD)
    PublicTelPhoneGetDialRecordResp getRecord(PublicTelPhoneGetDialRecordParam param);

}
