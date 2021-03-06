package chat.qiye.wechat.sdk.common;

import lombok.Getter;
import lombok.Setter;

/**
 * 接口 响应基类
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @created : 2021/1/3
 */

@Getter
@Setter
public  class RespStatus {
    protected Long errcode;
    protected String errmsg;

    public boolean success() {
        return getErrcode() == null || getErrcode() == 0;
    }

}
