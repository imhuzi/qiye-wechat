package cn.tobdev.qy.weixin.sdk.api.customer.resp;

import cn.tobdev.qy.weixin.sdk.api.contact.vo.UserExternalProfile;
import cn.tobdev.qy.weixin.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class CustomerGetResp extends RespStatus implements Serializable {

    @JsonProperty("next_cursor")
    private String nextCursor;

    @JsonProperty("external_contact")
    private ExternalContact externalContact;

    @JsonProperty("follow_user")
    private List<FollowUser> followUser = new ArrayList<>();

    @Data
    @NoArgsConstructor
    public static class ExternalContact {

        @JsonProperty("external_userid")
        private String externalUserid;

        private String name;

        private String position;

        private String avatar;

        private Integer type;

        private String unionid;

        private Integer gender;

        @JsonProperty("corp_name")
        private String corpName;

        @JsonProperty("corp_full_name")
        private String corpFullName;

        @JsonProperty("external_profile")
        private UserExternalProfile externalProfile;

    }


    @Data
    public static class FollowUser {

        private String userid;

        private String remark;

        private String description;
        @JsonProperty("createtime")
        private Long addTime;
        private List<TagItem> tags;
        @JsonProperty("remark_corp_name")
        private String remarkCorpName;

        @JsonProperty("remark_mobiles")
        private List<String> remarkMobiles;

        @JsonProperty("oper_userid")
        private String operUserId;

        @JsonProperty("add_way")
        private Integer addWay;

        private String state;

    }


    @Data
    public static class TagItem {

        @JsonProperty("group_name")
        private String groupName;

        @JsonProperty("tag_name")
        private String tagName;

        @JsonProperty("tag_id")
        private String tagId;

        private Integer type;


    }


}
