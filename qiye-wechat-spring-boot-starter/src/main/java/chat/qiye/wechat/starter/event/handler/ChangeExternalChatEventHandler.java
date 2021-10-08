package chat.qiye.wechat.starter.event.handler;

import chat.qiye.wechat.sdk.confg.QiyeWechatAppVo;
import chat.qiye.wechat.starter.SpringContextUtil;
import chat.qiye.wechat.starter.event.service.ExternalChatEventService;
import chat.qiye.wechat.starter.event.type.ExternalChatEventType;
import chat.qiye.wechat.starter.event.vo.EventDataVo;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * 企业客户变更事件
 */
@Slf4j
public class ChangeExternalChatEventHandler extends AbstractEventHandler {

    public ChangeExternalChatEventHandler(EventDataVo data) {
        super(data);
    }

    private static final ExternalChatEventService externalChatEventService;

    static {
        externalChatEventService = SpringContextUtil.getBean(ExternalChatEventService.class);
    }

    @Override
    public boolean handler(QiyeWechatAppVo qywxApp, String changeType, Map<String, Object> data) throws Exception {
        boolean ret = false;
        switch (changeType) {
            case ExternalChatEventType.CREATE:
                ret = externalChatEventService.create(qywxApp, data);
                break;
            case ExternalChatEventType.UPDATE:
                ret = externalChatEventService.update(qywxApp, data);
                break;
            case ExternalChatEventType.DISMISS:
                ret = externalChatEventService.delete(qywxApp, data);
                break;

        }
        return ret;
    }
}
