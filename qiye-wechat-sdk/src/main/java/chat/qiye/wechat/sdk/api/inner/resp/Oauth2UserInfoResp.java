package chat.qiye.wechat.sdk.api.inner.resp;


import com.fasterxml.jackson.annotation.JsonProperty;

import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Oauth2UserInfoResp extends RespStatus {

    @JsonProperty("UserId")
    private String userid;

    /**
     * 手机设备号(由企业微信在安装时随机生成，删除重装会改变，升级不受影响)
     */
    @JsonProperty("DeviceId")
    private String deviceId;

    /**
     * 1. 外部联系人id，当且仅当用户是企业的客户，且跟进人在应用的可见范围内时返回。如果是第三方应用调用，针对同一个客户，同一个服务商不同应用获取到的id相同
     * 2. 如果是家校应用， 家长的外部联系人id，开发者再通过获取外部联系人详情接口可以取到foreign_key，该字段就是对应家校通讯录里家长的userid
     */
    @JsonProperty("external_userid")
    private String externalUserid;

    /**
     * 非企业成员的标识，对当前企业唯一。不超过64字节
     */
    @JsonProperty("OpenId")
    private String openId;

    /**
     * 如果 是家校 应用时 该字段有值
     */
    @JsonProperty("parent_userid")
    private String parentUserId;


}
