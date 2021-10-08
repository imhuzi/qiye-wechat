package chat.qiye.wechat.starter.event.handler;

import chat.qiye.wechat.starter.event.vo.EventDataVo;
import com.google.common.base.CaseFormat;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * 处理器工厂
 */
@Slf4j
public class HandlerFactory {

    private static Map<String, Class> classCache = new HashMap<>();

    /**
     * 根据 业务类型 获取 业务处理事件
     */
    public static IQywxEventHandler getHandler(EventDataVo data) {
        String handlerName =
                CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, data.getEventType().toLowerCase()) + "EventHandler";
        try {
            String handlerClassName = "com.ddweilai.crm.qywx.event." + handlerName;
            log.info("strategyClassName:{}", handlerClassName);
            // Class 可以缓存
            Class calculateStrategyClass = classCache.get(handlerClassName);
            if (calculateStrategyClass == null) {
                calculateStrategyClass = Class.forName(handlerClassName);
                classCache.put(handlerClassName, calculateStrategyClass);
            }
            Constructor constructor = calculateStrategyClass.getConstructor(EventDataVo.class);
            return (IQywxEventHandler) constructor.newInstance(data);
        } catch (ClassNotFoundException e) {
            log.info("handlerNotExist", e);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            log.error("handlerNewInstanceError", e);
        }
        return null;
    }
}
