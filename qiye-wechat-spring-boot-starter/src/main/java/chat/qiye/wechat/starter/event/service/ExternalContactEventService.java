package chat.qiye.wechat.starter.event.service;

import chat.qiye.wechat.sdk.confg.QiyeWechatAppVo;
import java.util.Map;

/**
 * 外部联系人(客户)变更处理service
 */
public interface ExternalContactEventService {


    /**
     * 添加企业客户事件
     * 配置了客户联系功能的成员添加外部联系人时，回调该事件
     */
    boolean addExternalContact(QiyeWechatAppVo qywxApp, Map<String, Object> data);

    /**
     * 编辑企业客户事件
     * 配置了客户联系功能的成员修改外部联系人的备注、手机号或标签时，回调该事件
     */
    boolean editExternalContact(QiyeWechatAppVo qywxApp, Map<String, Object> data);

    /**
     * 删除企业客户事件
     * 配置了客户联系功能的成员删除外部联系人时，回调该事件
     */
    boolean deleteExternalContact(QiyeWechatAppVo qywxApp, Map<String, Object> data);
}
