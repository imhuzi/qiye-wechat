package cn.tobdev.qy.weixin.sdk.api.thirdparty.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * https://work.weixin.qq.com/api/doc/90001/90143/90600
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @created : 2021/1/3
 */

@Data
public class SuiteAccessTokenParam implements Serializable {
    @JsonProperty("suite_id")
    private String suiteId;

    @JsonProperty("suite_secret")
    private String suiteSecret;

    @JsonProperty("suite_ticket")
    private String suiteTicket;

}
