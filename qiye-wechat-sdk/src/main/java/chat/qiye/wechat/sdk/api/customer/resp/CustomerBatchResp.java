package chat.qiye.wechat.sdk.api.customer.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.api.contact.vo.UserExternalProfile;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
public class CustomerBatchResp extends RespStatus implements Serializable {

    @JsonProperty("next_cursor")
    private String nextCursor;

    @JsonProperty("external_contact_list")
    private List<ExternalContactItem> externalContactList;

    @Data
    public static class ExternalContactItem {

        @JsonProperty("external_contact")
        private ExternalContact externalContact;

        @JsonProperty("follow_info")
        private FollowInfo followInfo;
    }

    @Data
    public static class ExternalContact {

        @JsonProperty("external_userid")
        private String externalUserId;

        private String name;

        private String position;

        private String avatar;

        private Integer type;

        @JsonProperty("unionid")
        private String unionId;

        private Integer gender;

        @JsonProperty("corp_name")
        private String corpName;

        @JsonProperty("corp_full_name")
        private String corpFullName;

        @JsonProperty("create_time")
        private Long createTime;

        @JsonProperty("external_profile")
        private UserExternalProfile externalProfile;


    }


    @Data
    public static class FollowInfo {

        private String remark;

        private String description;
        @JsonProperty("createtime")
        private Long createTime;

        @JsonProperty("tag_id")
        private List<String> tagIds;

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
