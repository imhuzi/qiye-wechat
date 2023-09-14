package chat.qiye.wechat.sdk.api.kf.param;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/10
 */
@Data
public class KfAccountListParam {
    /**
     * 分页，偏移量，默认0
     */
    private int offset=0;

    /**
     * 分页，预期请求的数据量,默认为100
     */
    private int limit = 100;
}
