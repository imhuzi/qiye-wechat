package chat.qiye.wechat.sdk.api.contact.param;

import lombok.Data;

/**
 * 获取互联企业成员详细信息 请求参数
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/7
 */
@Data
public class LinkedcorpUserGetParam {

    /**
     * 该字段用的是互联应用可见范围接口返回的userids参数，用的是 CorpId + ’/‘ + USERID 拼成的字符串
     */
    private String userid;
}
