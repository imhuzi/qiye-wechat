package cn.tobdev.qy.weixin.sdk.api.customer.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CustomerRemarkUpdateParam {
    private String userid;

    @JsonProperty("external_userid")
    private String externalUserid;

    private String remark;

    private String description;

    @JsonProperty("remark_company")
    private String remarkCompany;

    @JsonProperty("remark_mobiles")
    private String remarkMobiles;

    @JsonProperty("remark_pic_mediaid")
    private String remarkPicMediaid;

}
