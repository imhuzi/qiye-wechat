package cn.tobdev.qy.weixin.sdk.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResp {
    protected Long errcode;
    protected String errmsg;

    public boolean success() {
        return getErrcode() == 0;
    }

}
