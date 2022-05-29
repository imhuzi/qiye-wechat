package chat.qiye.wechat.sdk.api.customer.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.api.contact.vo.UserExternalProfile;

import com.fasterxml.jackson.annotation.JsonProperty;

import chat.qiye.wechat.sdk.common.dto.WechatChannelsDto;
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

        /**
         * 发起添加的userid，如果成员主动添加，为成员的userid；如果是客户主动添加，则为客户的外部联系人userid；如果是内部成员共享/管理员分配，则为对应的成员/管理员userid
         */
        @JsonProperty("oper_userid")
        private String operUserId;

        @JsonProperty("add_way")
        private Integer addWay;

        @JsonProperty("wechat_channels")
        private WechatChannelsDto wechatChannels;

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
