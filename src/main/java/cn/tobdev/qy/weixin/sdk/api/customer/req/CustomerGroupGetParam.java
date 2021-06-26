package cn.tobdev.qy.weixin.sdk.api.customer.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CustomerGroupGetParam {

    @JsonProperty("chat_id")
    private String chatId;
}
