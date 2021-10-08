package chat.qiye.wechat.starter.event.handler;

import chat.qiye.wechat.starter.event.vo.EventDataVo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;

/**
 * 企业微信事件处理 抽象类
 */
@Slf4j
public abstract class AbstractEventHandler implements IQywxEventHandler {

    private final EventDataVo data;

    public AbstractEventHandler(EventDataVo data) {
        this.data = data;
    }

    protected EventDataVo getData() {
        return data;
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
        log.info("{}Start:{}", getName(), getData());
        String syncAction = data.getChangeType();
        boolean ret = false;
        try {
            ret = this.handler(data.getQywxApp(), syncAction, data.getData());
        } catch (Exception e) {
            log.error("{}Error,{}", getName(), syncAction);
        }
        log.info("{}End,{},{}", getName(), syncAction, ret);
        MDC.clear();
    }
}
