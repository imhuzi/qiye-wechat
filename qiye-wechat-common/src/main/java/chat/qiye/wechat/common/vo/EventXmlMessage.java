package chat.qiye.wechat.common.vo;

import com.ddweilai.crm.qywx.utils.XmlUtils;
import com.ddweilai.crm.qywx.utils.xml.IntegerArrayConverter;
import com.ddweilai.crm.qywx.utils.xml.StringArrayConverter;
import com.ddweilai.crm.qywx.utils.xml.XStreamCDataConverter;
import com.ddweilai.crm.qywx.utils.xml.XStreamTransformer;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.basic.IntConverter;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 回调推送的message
 * https://work.weixin.qq.com/api/doc#90001/90143/90612
 *
 * @author zhenjun cai
 */
@XStreamAlias("xml")
@Slf4j
@Data
public class EventXmlMessage implements Serializable {

    private static final long serialVersionUID = 6031833682211475786L;
    /**
     * 使用dom4j解析的存放所有xml属性和值的map.
     */
    private Map<String, Object> allFieldsMap;

    @XStreamAlias("SuiteId")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String suiteId;

    @XStreamAlias("InfoType")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String infoType;

    @XStreamAlias("TimeStamp")
    protected Long timeStamp;

    @XStreamAlias("SuiteTicket")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String suiteTicket;

    @XStreamAlias("AuthCode")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String authCode;

    @XStreamAlias("AuthCorpId")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String authCorpId;

    @XStreamAlias("ChangeType")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String changeType;

    @XStreamAlias("UserID")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String userID;

    @XStreamAlias("OpenUserID")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String openUserID;

    @XStreamAlias("NewUserID")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String newUserID;

    @XStreamAlias("Department")
    @XStreamConverter(value = IntegerArrayConverter.class)
    protected Integer[] department;

    @XStreamAlias("MainDepartment")
    @XStreamConverter(value = IntConverter.class)
    protected Integer mainDepartment;

    @XStreamAlias("IsLeaderInDept")
    @XStreamConverter(value = IntegerArrayConverter.class)
    protected Integer[] isLeaderInDept;

    @XStreamAlias("Mobile")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String mobile;

    @XStreamAlias("Position")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String position;

    @XStreamAlias("Gender")
    @XStreamConverter(value = IntConverter.class)
    protected Integer gender;

    @XStreamAlias("Email")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String email;

    @XStreamAlias("Status")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String status;

    @XStreamAlias("Avatar")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String avatar;

    @XStreamAlias("Alias")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String alias;

    @XStreamAlias("Telephone")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String telephone;

    @XStreamAlias("Id")
    @XStreamConverter(value = IntConverter.class)
    protected Integer id;

    @XStreamAlias("Name")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String name;

    @XStreamAlias("ParentId")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String parentId;

    @XStreamAlias("Order")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected Integer order;

    @XStreamAlias("TagId")
    @XStreamConverter(value = IntConverter.class)
    protected Integer tagId;

    @XStreamAlias("AddUserItems")
    @XStreamConverter(value = StringArrayConverter.class)
    protected String[] addUserItems;

    @XStreamAlias("DelUserItems")
    @XStreamConverter(value = StringArrayConverter.class)
    protected String[] delUserItems;

    @XStreamAlias("AddPartyItems")
    @XStreamConverter(value = IntegerArrayConverter.class)
    protected Integer[] addPartyItems;

    @XStreamAlias("DelPartyItems")
    @XStreamConverter(value = IntegerArrayConverter.class)
    protected Integer[] delPartyItems;

    //ref: https://work.weixin.qq.com/api/doc/90001/90143/90585
    @XStreamAlias("ServiceCorpId")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String serviceCorpId;

    @XStreamAlias("RegisterCode")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String registerCode;

    @XStreamAlias("TemplateId")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String templateId;

    @XStreamAlias("CreateTime")
    protected Long createTime;

    @XStreamAlias("ToUserName")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String toUserName;

    @XStreamAlias("FromUserName")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String fromUserName;

    @XStreamAlias("MsgType")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String msgType;

    @XStreamAlias("Event")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String event;

    @XStreamAlias("ExternalUserID")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String externalUserID;

    @XStreamAlias("WelcomeCode")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String welcomeCode;

    @XStreamAlias("FromUser")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String fromUser;

    @XStreamAlias("Content")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String content;

    @XStreamAlias("MsgId")
    protected String msgId;

    @XStreamAlias("AgentID")
    protected Integer agentID;

    @XStreamAlias("PicUrl")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String picUrl;

    @XStreamAlias("MediaId")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String mediaId;

    @XStreamAlias("Format")
    @XStreamConverter(value = XStreamCDataConverter.class)
    private String format;

    @XStreamAlias("ThumbMediaId")
    @XStreamConverter(value = XStreamCDataConverter.class)
    private String thumbMediaId;

    @XStreamAlias("Location_X")
    private Double locationX;

    @XStreamAlias("Location_Y")
    private Double locationY;

    @XStreamAlias("Scale")
    private Double scale;

    @XStreamAlias("Label")
    @XStreamConverter(value = XStreamCDataConverter.class)
    private String label;

    @XStreamAlias("Title")
    @XStreamConverter(value = XStreamCDataConverter.class)
    private String title;

    @XStreamAlias("Description")
    @XStreamConverter(value = XStreamCDataConverter.class)
    private String description;

    @XStreamAlias("Url")
    @XStreamConverter(value = XStreamCDataConverter.class)
    private String url;

    @XStreamAlias("EventKey")
    @XStreamConverter(value = XStreamCDataConverter.class)
    private String eventKey;

    @XStreamAlias("Latitude")
    private Double latitude;

    @XStreamAlias("Longitude")
    private Double longitude;

    @XStreamAlias("Precision")
    private Double precision;

    @XStreamAlias("AppType")
    @XStreamConverter(value = XStreamCDataConverter.class)
    private String appType;

    @XStreamAlias("TaskId")
    @XStreamConverter(value = XStreamCDataConverter.class)
    private String taskId;

    @XStreamAlias("ExtAttr")
    private List<ExtAttr> extAttr;

    @Data
    @XStreamAlias("ExtAttr")
    public static class ExtAttr {

        @XStreamAlias("Item")
        protected List<ExtAttrItem> items;

        @Data
        @XStreamAlias("Item")
        public static class ExtAttrItem {
            @XStreamAlias("Name")
            @XStreamConverter(value = XStreamCDataConverter.class)
            protected String name;

            @XStreamAlias("Type")
            @XStreamConverter(value = IntConverter.class)
            protected Integer type;

            @XStreamAlias("Text")
            protected ExtAttrItemText text;

            @XStreamAlias("Text")
            protected ExtAttrItemText web;
        }

        @Data
        public static class ExtAttrItemText {
            @XStreamAlias("Value")
            @XStreamConverter(value = XStreamCDataConverter.class)
            protected String value;

            @XStreamAlias("Title")
            @XStreamConverter(value = XStreamCDataConverter.class)
            protected String title;

            @XStreamAlias("Url")
            @XStreamConverter(value = XStreamCDataConverter.class)
            protected String url;



        }





    }


    public static com.ddweilai.crm.qywx.vo.EventXmlMessage fromXml(String xml) {
        //修改微信变态的消息内容格式，方便解析
        //xml = xml.replace("</PicList><PicList>", "");
        final com.ddweilai.crm.qywx.vo.EventXmlMessage xmlPackage = XStreamTransformer.fromXml(com.ddweilai.crm.qywx.vo.EventXmlMessage.class, xml);
        xmlPackage.setAllFieldsMap(XmlUtils.xml2Map(xml));
        return xmlPackage;
    }

}
