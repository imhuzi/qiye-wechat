package cn.tobdev.qy.weixin.sdk.api.customer.resp;

import cn.tobdev.qy.weixin.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class CustomerListResp extends RespStatus implements Serializable {

    @JsonProperty("external_userid")
    private List<String> externalUserid = new ArrayList<>();
}
