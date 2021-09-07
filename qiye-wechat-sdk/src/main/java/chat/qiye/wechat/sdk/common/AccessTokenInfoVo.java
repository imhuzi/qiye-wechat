package chat.qiye.wechat.sdk.common;

import lombok.Data;

/**
 * Access Token Info
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/6
 */
@Data
public class AccessTokenInfoVo {
    /**
     * 应用ID
     */
    private String app;
    /**
     * access token
     */
    private String accessToken;
    /**
     * 有效时间 秒
     */
    private Integer expiresIn;
    /**
     * 失效时间, 毫秒
     */
    private Long failureTime;

}
