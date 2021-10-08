package chat.qiye.wechat.starter.event.handler;

import chat.qiye.wechat.common.utils.XmlUtils;
import chat.qiye.wechat.sdk.confg.QiyeWechatAppVo;
import chat.qiye.wechat.starter.SpringContextUtil;
import chat.qiye.wechat.starter.event.vo.EventDataVo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;

import java.util.Map;
import java.util.concurrent.Executor;

@Slf4j
public class EventHandalerRunnable implements Runnable {

    private final String data;

    private final String requestId;

    private final QiyeWechatAppVo qywxApp;

    private final Executor eventBizExecutor;

    public EventHandalerRunnable(String data, QiyeWechatAppVo qywxApp, String requestId) {
        this.data = data;
        this.requestId = requestId;
        this.qywxApp = qywxApp;
        this.eventBizExecutor = SpringContextUtil.getBean("threadPoolBizExecutor", Executor.class);
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        MDC.put("requestId", requestId);
        log.info("解密后的:{}", XmlUtils.xml2Map(data));
        Map<String, Object> message = XmlUtils.xml2Map(data);
        log.info("EventHandalerRunnableData:{}", data);
        try {
            // 存储 事件数据
            // 将事件数据 给 handler
            EventDataVo data = new EventDataVo();
            data.setEventType(message.get("Event").toString());
            data.setChangeType(message.get("ChangeType").toString());
            data.setData(message);
            data.setRequestId(requestId);
            data.setQywxApp(qywxApp);
            IQywxEventHandler handler = HandlerFactory.getHandler(data);
            if (handler != null) {
                eventBizExecutor.execute(handler);
            } else {
                log.warn("EventHandalerRunnable:NoSyncEventHandler");
            }

        } catch (Exception e) {
            log.error("EventHandalerRunnableError", e);
        }
        MDC.clear();
    }
}
