package chat.qiye.wechat.sdk.confg;

import chat.qiye.wechat.sdk.constant.Constant;
import chat.qiye.wechat.sdk.utils.AssertUtil;
import chat.qiye.wechat.sdk.utils.StringUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/8/30
 */
@Slf4j
public class QiyeWechatConfig {
    private static final ConcurrentHashMap<String, String> props = new ConcurrentHashMap<>();
    public static final String QIYE_WECAHT_API_MODEL = "qiye.wecaht.api.model";

    public static final String QIYE_WECAHT_NAME = "qiye.wecaht.name";
    public static final String QIYE_WECAHT_APPID = "qiye.wecaht.appId";
    public static final String QIYE_WECAHT_AGENTID = "qiye.wecaht.agentId";
    public static final String QIYE_WECAHT_APPSECRET = "qiye.wecaht.secret";
    public static final String QIYE_WECAHT_CORPID = "qiye.wecaht.corpId";
    public static final String QIYE_WECAHT_HOMEURL = "qiye.wecaht.homeUrl";
    public static final String QIYE_WECAHT_EVENT_TOKEN = "qiye.wecaht.eventToken";
    public static final String QIYE_WECAHT_EVENT_ENCODING_AESKEY = "qiye.wecaht.eventEncodingAesKey";

    public static final String QIYE_WECAHT_TEMPL_NAME = "qiye.wecaht.%s.name";
    public static final String QIYE_WECAHT_TEMPL_APPID = "qiye.wecaht.%s.appId";
    public static final String QIYE_WECAHT_TEMPL_AGENTID= "qiye.wecaht.%s.agentId";
    public static final String QIYE_WECAHT_TEMPL_APPSECRET = "qiye.wecaht.%s.secret";
    public static final String QIYE_WECAHT_TEMPL_CORPID = "qiye.wecaht.%s.corpId";
    public static final String QIYE_WECAHT_TEMPL_HOMEURL = "qiye.wecaht.%s.homeUrl";
    public static final String QIYE_WECAHT_TEMPL_EVENT_TOKEN = "qiye.wecaht.%s.eventToken";
    public static final String QIYE_WECAHT_TEMPL_EVENT_ENCODING_AESKEY = "qiye.wecaht.%s.eventEncodingAesKey";

    private static void loadProps() {
        Properties properties = QiyeWechatConfigLoader.getProperties();
        Iterator var1 = properties.keySet().iterator();

        while (var1.hasNext()) {
            Object key = var1.next();
            setConfig((String) key, (String) properties.get(key));
        }

    }

    public static String getConfig(String key) {
        AssertUtil.notNull(key, "key cannot be null");
        return props.get(key);
    }

    public static void setConfig(String key, String value) {
        AssertUtil.notNull(key, "key cannot be null");
        AssertUtil.notNull(value, "value cannot be null");
        props.put(key, value);
    }

    public static String removeConfig(String key) {
        AssertUtil.notNull(key, "key cannot be null");
        return (String) props.remove(key);
    }

    public static void setConfigIfAbsent(String key, String value) {
        AssertUtil.notNull(key, "key cannot be null");
        AssertUtil.notNull(value, "value cannot be null");
        String v = (String) props.get(key);
        if (v == null) {
            props.put(key, value);
        }

    }

    /**
     * 获取 api Model 配置
     *
     * @return String {@link Constant}
     */
    public static String getApiModel() {
        String apiModel = props.get(QIYE_WECAHT_API_MODEL);
        if (StringUtil.isBlank(apiModel)) {
            log.warn("[QiyeWechatConfig] Parse {} fail, use default value: {}", QIYE_WECAHT_API_MODEL, Constant.API_MODEL_INNER);
            apiModel = Constant.API_MODEL_INNER;
        }
        return apiModel;
    }

    public static QiyeWechatConfigVo getAppConfig() {
        try {
            QiyeWechatConfigVo configVo = new QiyeWechatConfigVo();
            configVo.setName(props.get(QIYE_WECAHT_NAME));
            configVo.setAppId(props.get(QIYE_WECAHT_APPID));
            configVo.setAgentId(Integer.parseInt(props.get(QIYE_WECAHT_AGENTID)));
            configVo.setSecret(props.get(QIYE_WECAHT_APPSECRET));
            configVo.setCorpId(props.get(QIYE_WECAHT_CORPID));
            configVo.setHomeUrl(props.get(QIYE_WECAHT_HOMEURL));
            configVo.setEventToken(props.get(QIYE_WECAHT_EVENT_TOKEN));
            configVo.setEventEncodingAesKey(props.get(QIYE_WECAHT_EVENT_ENCODING_AESKEY));
            return configVo;
        } catch (Throwable var1) {
            log.warn("[QiyeWechatConfig] Parse coldFactor fail, use default value: 3", var1);
        }
        return null;
    }

    public static QiyeWechatConfigVo getSysAppConfig(String app) {
        try {
            QiyeWechatConfigVo configVo = new QiyeWechatConfigVo();
            configVo.setName(props.get(String.format(QIYE_WECAHT_TEMPL_NAME, app)));
            configVo.setAppId(props.get(String.format(QIYE_WECAHT_TEMPL_APPID, app)));
            configVo.setAgentId(Integer.parseInt(props.get(String.format(QIYE_WECAHT_TEMPL_AGENTID, app))));
            configVo.setSecret(props.get(String.format(QIYE_WECAHT_TEMPL_APPSECRET, app)));
            configVo.setCorpId(props.get(String.format(QIYE_WECAHT_TEMPL_CORPID, app)));
            configVo.setHomeUrl(props.get(String.format(QIYE_WECAHT_TEMPL_HOMEURL, app)));
            configVo.setEventToken(props.get(String.format(QIYE_WECAHT_TEMPL_EVENT_TOKEN, app)));
            configVo.setEventEncodingAesKey(props.get(String.format(QIYE_WECAHT_TEMPL_EVENT_ENCODING_AESKEY, app)));

            if (StringUtil.isEmpty(configVo.getCorpId())) {
                configVo.setCorpId(props.get(QIYE_WECAHT_CORPID));
            }
            return configVo;
        } catch (Throwable var1) {
            log.info("[QiyeWechatConfig] Parse fail", var1);
        }
        return null;
    }

    private static String toEnvKey(String propKey) {
        return propKey.toUpperCase().replace('.', '_');
    }

    private QiyeWechatConfig() {
    }

    static {
        try {
            loadProps();
            log.info("[QiyeWechatConfig] Application type resolved: ", new Object[0]);
        } catch (Throwable var1) {
            log.warn("[QiyeWechatConfig] Failed to initialize", var1);
            var1.printStackTrace();
        }

    }
}
