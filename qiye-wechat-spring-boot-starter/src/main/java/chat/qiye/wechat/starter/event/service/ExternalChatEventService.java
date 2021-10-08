package chat.qiye.wechat.starter.event.service;


import chat.qiye.wechat.sdk.confg.QiyeWechatAppVo;

import java.util.Map;

/**
 * 客户群变更处理service
 */
public interface ExternalChatEventService {

    boolean create(QiyeWechatAppVo qywxApp, Map<String, Object> data);

    boolean update(QiyeWechatAppVo qywxApp, Map<String, Object> data);

    boolean delete(QiyeWechatAppVo qywxApp, Map<String, Object> data);
}
