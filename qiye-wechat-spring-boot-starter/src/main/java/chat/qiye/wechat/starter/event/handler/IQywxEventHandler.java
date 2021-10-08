package chat.qiye.wechat.starter.event.handler;


import chat.qiye.wechat.sdk.confg.QiyeWechatAppVo;

import java.util.Map;

/**
 * 企业微信事件 处理接口
 */
public interface IQywxEventHandler extends Runnable {

    /**
     * 处理策略名称
     *
     * @return
     */
    default String getName() {
        return this.getClass().getSimpleName();
    }

    boolean handler(QiyeWechatAppVo qywxApp, String changeType, Map<String, Object> data) throws Exception;
}
