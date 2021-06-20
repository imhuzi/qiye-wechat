package cn.tobdev.qy.weixin.sdk.api.thirdparty.resp;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.api.thirdparty.vo.AuthCorpInfoVo;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.vo.AuthInfoVo;
import cn.tobdev.qy.weixin.sdk.api.thirdparty.vo.DealerCorpInfoVo;
import cn.tobdev.qy.weixin.sdk.common.RespStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 企业授权信息接口响应数据
 *
 * https://work.weixin.qq.com/api/doc/90001/90143/90604
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @created : 2021/1/3
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CorpAuthInfoResp  extends RespStatus implements Serializable {

    @JsonProperty("dealer_corp_info")
    private DealerCorpInfoVo dealerCorpInfo;

    @JsonProperty("auth_corp_info")
    private AuthCorpInfoVo authCorpInfo;

    @JsonProperty("auth_info")
    private AuthInfoVo authInfo;

}
