package chat.qiye.wechat.starter.event.handler;

import chat.qiye.wechat.sdk.confg.QiyeWechatAppVo;
import chat.qiye.wechat.starter.SpringContextUtil;
import chat.qiye.wechat.starter.event.service.ExternalContactEventService;
import chat.qiye.wechat.starter.event.type.ExternalContactEventType;
import chat.qiye.wechat.starter.event.vo.EventDataVo;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * 企业客户变更事件
 */
@Slf4j
public class ChangeExternalContactEventHandler extends AbstractEventHandler {

    public ChangeExternalContactEventHandler(EventDataVo data) {
        super(data);
    }

    private static final ExternalContactEventService externalContactEventService;

    static {
        externalContactEventService = SpringContextUtil.getBean(ExternalContactEventService.class);
    }

    @Override
    public boolean handler(QiyeWechatAppVo qywxApp, String changeType, Map<String, Object> data) throws Exception {
        boolean ret = false;
        switch (changeType) {
            case ExternalContactEventType.ADD_EXTERNAL_CONTACT:
                ret = externalContactEventService.addExternalContact(qywxApp, data);
                break;
            case ExternalContactEventType.EDIT_EXTERNAL_CONTACT:
                ret = externalContactEventService.editExternalContact(qywxApp, data);
                break;
            case ExternalContactEventType.ADD_HALF_EXTERNAL_CONTACT:
                ret = externalContactEventService.addExternalContact(qywxApp, data);
                break;
            case ExternalContactEventType.DEL_EXTERNAL_CONTACT:
                ret = externalContactEventService.deleteExternalContact(qywxApp, data);
                break;
            case ExternalContactEventType.DEL_FOLLOW_USER:
                ret = externalContactEventService.deleteExternalContact(qywxApp, data);
                break;
            case ExternalContactEventType.TRANSFER_FAIL:
        }
        return ret;
    }
}
