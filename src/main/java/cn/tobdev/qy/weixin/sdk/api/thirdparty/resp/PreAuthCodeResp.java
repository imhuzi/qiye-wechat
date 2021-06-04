package cn.tobdev.qy.weixin.sdk.api.thirdparty.resp;

import cn.tobdev.qy.weixin.sdk.common.BaseResp;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 预授权码接口响应数据
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @created : 2021/1/3
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class PreAuthCodeResp extends BaseResp implements Serializable {
    private String preAuthCode;
    private Integer expiresIn;
}
