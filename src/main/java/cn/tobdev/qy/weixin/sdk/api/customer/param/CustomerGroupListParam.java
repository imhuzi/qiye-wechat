package cn.tobdev.qy.weixin.sdk.api.customer.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CustomerGroupListParam {

    @JsonProperty("status_filter")
    private Integer statusFilter=0;

    @JsonProperty("owner_filter")
    private OwnerFilter ownerFilter;

    private String cursor;

    private Integer limit = 1000;

    @Data
    static class OwnerFilter {
        private List<String> useridList;
    }
}
