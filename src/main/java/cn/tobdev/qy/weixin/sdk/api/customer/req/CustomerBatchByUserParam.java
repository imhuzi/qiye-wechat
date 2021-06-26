package cn.tobdev.qy.weixin.sdk.api.customer.req;

import lombok.Data;

@Data
public class CustomerBatchByUserParam {

    private String userid;

    private String cursor;

    private Integer limit = 1000;
}
