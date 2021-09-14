package chat.qiye.wechat.sdk.api.wedrive.vo;

import lombok.Data;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/11
 */
@Data
public class AuthInfoItem {
    private Integer auth;
    private String departmentid;
    private Integer type;
    private String userid;
}