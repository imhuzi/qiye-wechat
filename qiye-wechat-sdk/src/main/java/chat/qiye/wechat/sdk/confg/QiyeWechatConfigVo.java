package chat.qiye.wechat.sdk.confg;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 企业微信 配置信息
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/8/31
 */
@Data
public class QiyeWechatConfigVo {

    /**
     * 应用名称
     */
    private String name;

    /**
     * 平台应用id
     */
    private String appId;

    /**
     * 应用 agentId
     */
    private Integer agentId;

    /**
     * 应用secret
     */
    private String secret;

    /**
     * 企业id
     */
    private String corpId;

    /**
     * 应用套件access_token
     */
    private String accessToken;

    /**
     * 应用套件access_token 更新时间
     */
    private LocalDateTime accessTokenAt;

    /**
     * 应用主页(前端)
     */
    private String homeUrl;

    /**
     * 事件 token
     */
    private String eventToken;

    /**
     * 事件 加密
     */
    private String eventEncodingAesKey;
}
