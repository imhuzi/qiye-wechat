package chat.qiye.wechat.sdk.api.kf.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class KfAccountVo {

    /**
     * 添加客服时可以为空
     */
    @JsonProperty("open_kfid")
    private String openKfid;

    @JsonProperty("name")
    private String name;

    @JsonProperty("media_id")
    private String mediaId;

}