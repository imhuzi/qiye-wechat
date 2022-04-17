package chat.qiye.wechat.sdk.confg;

import chat.qiye.wechat.sdk.utils.ConfigUtil;
import chat.qiye.wechat.sdk.utils.StringUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 企业微信 配置文件加载器
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/8/30
 */
@Slf4j
public class QiyeWechatConfigLoader {
    public static final String QIYE_WECHAT_CONFIG_ENV_KEY = "QIYE_WECHAT_CONFIG_FILE";
    public static final String QIYE_WECHAT_CONFIG_PROPERTY_KEY = "qiye.wechat.config.file";
    private static final String DEFAULT_QIYE_WECHAT_CONFIG_FILE = "classpath:qiye-wechat.properties";
    private static final Properties properties = new Properties();


    public QiyeWechatConfigLoader() {
    }

    private static void load() {
        String fileName = System.getProperty(QIYE_WECHAT_CONFIG_PROPERTY_KEY);
        if (StringUtil.isBlank(fileName)) {
            fileName = System.getenv(QIYE_WECHAT_CONFIG_ENV_KEY);
            if (StringUtil.isBlank(fileName)) {
                fileName = DEFAULT_QIYE_WECHAT_CONFIG_FILE;
            }
        }

        Properties p = ConfigUtil.loadProperties(fileName);
        if (p != null && !p.isEmpty()) {
            log.info("[QiyeWechatConfigLoader] Loading QiYe WeChat config from {}", fileName);
            properties.putAll(p);
        }

        Iterator var2 = (new CopyOnWriteArraySet(System.getProperties().entrySet())).iterator();

        while (var2.hasNext()) {
            Map.Entry<Object, Object> entry = (Map.Entry) var2.next();
            String configKey = entry.getKey().toString();
            String newConfigValue = entry.getValue().toString();
            String oldConfigValue = properties.getProperty(configKey);
            properties.put(configKey, newConfigValue);
            if (oldConfigValue != null) {
                log.info("[QiyeWechatConfigLoader] JVM parameter overrides {}: {} -> {}", configKey, oldConfigValue, newConfigValue);
            }
        }

    }

    public static Properties getProperties() {
        return properties;
    }

    static {
        try {
            load();
        } catch (Throwable var1) {
            log.warn("[QiyeWechatConfigLoader] Failed to initialize configuration items", var1);
        }

    }

}
