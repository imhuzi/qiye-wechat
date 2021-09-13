package chat.qiye.wechat.sdk.api.kf.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class KfAccountDetailVo {

    @JsonProperty("open_kfid")
    private String openKfid;

    @JsonProperty("name")
    private String name;

    @JsonProperty("avatar")
    private String avatar;

}