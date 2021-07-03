package chat.qiye.wechat.sdk.api.customer.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CustomerGroupGetParam {

    @JsonProperty("chat_id")
    private String chatId;
}
