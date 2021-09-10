package chat.qiye.wechat.sdk.api.oa.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
public class CorpApprovalDataQueryResp extends RespStatus {

    @JsonProperty("data")
    private ApprovalData data;

    @Data
    public static class ApprovalData {

        @JsonProperty("ApplyUserImage")
        private String applyUserImage;

        @JsonProperty("ApplyUserId")
        private String applyUserId;

        @JsonProperty("ApplyTime")
        private int applyTime;

        @JsonProperty("NotifyNodes")
        private NotifyNodes notifyNodes;

        @JsonProperty("OpenSpName")
        private String openSpName;

        @JsonProperty("OpenSpstatus")
        private int openSpstatus;

        @JsonProperty("ApprovalNodes")
        private ApprovalNodes approvalNodes;

        @JsonProperty("OpenTemplateId")
        private String openTemplateId;

        @JsonProperty("ApplyUsername")
        private String applyUsername;

        @JsonProperty("ThirdNo")
        private String thirdNo;

        @JsonProperty("ApproverStep")
        private int approverStep;

        @JsonProperty("ApplyUserParty")
        private String applyUserParty;

        @Data
        public static class ApprovalNodes {

            @JsonProperty("ApprovalNode")
            private List<ApprovalNodeItem> approvalNode;

            @Data
            public static class ApprovalNodeItem {

                @JsonProperty("NodeAttr")
                private int nodeAttr;

                @JsonProperty("NodeType")
                private int nodeType;

                @JsonProperty("Items")
                private Items items;

                @JsonProperty("NodeStatus")
                private int nodeStatus;

                @Data
                public static class Items {

                    @JsonProperty("Item")
                    private List<ItemItem> item;

                    @Data
                    public static class ItemItem {

                        @JsonProperty("ItemImage")
                        private String itemImage;

                        @JsonProperty("ItemStatus")
                        private int itemStatus;

                        @JsonProperty("ItemOpTime")
                        private int itemOpTime;

                        @JsonProperty("ItemParty")
                        private String itemParty;

                        @JsonProperty("ItemUserId")
                        private String itemUserId;

                        @JsonProperty("ItemSpeech")
                        private String itemSpeech;

                        @JsonProperty("ItemName")
                        private String itemName;
                    }
                }
            }
        }

        @Data
        public static class NotifyNodes {

            @JsonProperty("NotifyNode")
            private List<NotifyNodeItem> notifyNode;

            @Data
            public static class NotifyNodeItem {

                @JsonProperty("ItemImage")
                private String itemImage;

                @JsonProperty("ItemParty")
                private String itemParty;

                @JsonProperty("ItemUserId")
                private String itemUserId;

                @JsonProperty("ItemName")
                private String itemName;
            }
        }
    }
}