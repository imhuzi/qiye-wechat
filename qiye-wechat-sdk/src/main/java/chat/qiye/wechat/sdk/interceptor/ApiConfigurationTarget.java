package chat.qiye.wechat.sdk.interceptor;

import chat.qiye.wechat.sdk.annotation.NoAccessToken;
import chat.qiye.wechat.sdk.annotation.ProviderAccessToken;
import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.annotation.SuiteAccessToken;
import chat.qiye.wechat.sdk.constant.Constant;
import chat.qiye.wechat.sdk.service.ApiConfigurationProvider;
import feign.Request;
import feign.RequestTemplate;
import feign.Target;
import lombok.extern.slf4j.Slf4j;

import static feign.Util.checkNotNull;
import static feign.Util.emptyToNull;

/**
 * api configuration target
 *
 * @param <T>
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/6/16
 */
@Slf4j
public class ApiConfigurationTarget<T> implements Target<T> {

    private final Class<T> type;

    private final String name;

    private final String url;

    private final ApiConfigurationProvider config;

    public ApiConfigurationTarget(Class<T> clazz, ApiConfigurationProvider provider) {
        this.config = provider;
        this.type = checkNotNull(clazz, "type");
        this.name = checkNotNull(emptyToNull(provider.name()), "name");
        this.url = checkNotNull(emptyToNull(provider.baseUrl()), "url");
    }

    @Override
    public Class<T> type() {
        return type;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String url() {
        return url;
    }


    /**
     * Targets a template to this target, adding the {@link #url() base url} and any target-specific
     * headers or query parameters. <br>
     * <br>
     * For example: <br>
     *
     * <pre>
     * public Request apply(RequestTemplate input) {
     *   input.insert(0, url());
     *   input.replaceHeader(&quot;X-Auth&quot;, currentToken);
     *   return input.asRequest();
     * }
     * </pre>
     *
     * <br>
     * <br>
     * <br>
     * <b>relationship to JAXRS 2.0</b><br>
     * <br>
     * This call is similar to {@code
     * javax.ws.rs.client.WebTarget.request()}, except that we expect transient, but necessary
     * decoration to be applied on invocation.
     *
     * @param requestTemplate
     */
    @Override
    public Request apply(RequestTemplate requestTemplate) {
        if (requestTemplate.url().indexOf("http") != 0) {
            requestTemplate.target(url());
        }
        // 动态 注入 token
        injectToken(requestTemplate);
        return requestTemplate.request();
    }

    /**
     * 获取 注解信息
     *
     * @param template RequestTemplate
     * @return QiYeChatApi annotation
     */
    private QiYeWeChatApi getAnnotation(RequestTemplate template) {
        QiYeWeChatApi annotation = template.methodMetadata().method().getAnnotation(QiYeWeChatApi.class);
        if (annotation == null) {
            annotation = template.feignTarget().type().getInterfaces()[0].getAnnotation(QiYeWeChatApi.class);
        }
        return annotation;
    }

    /**
     * 是否 是 suite accessToken
     *
     * @param template RequestTemplate
     * @return true  or false
     */
    private boolean isSuiteAccessToken(RequestTemplate template) {
        SuiteAccessToken annotation = template.methodMetadata().method().getAnnotation(SuiteAccessToken.class);
        return annotation != null;
    }

    /**
     * 是否 是 suite accessToken
     *
     * @param template RequestTemplate
     * @return true  or false
     */
    private boolean isProviderAccessToken(RequestTemplate template) {
        ProviderAccessToken annotation = template.methodMetadata().method().getAnnotation(ProviderAccessToken.class);
        return annotation != null;
    }

    /**
     * 是否需要 token
     *
     * @param template RequestTemplate
     * @return true  or false
     */
    private boolean isNoAccessToken(RequestTemplate template) {
        NoAccessToken annotation = template.methodMetadata().method().getAnnotation(NoAccessToken.class);
        return annotation != null;
    }

    /**
     * 注入 token
     *
     * @param template RequestTemplate
     */
    private void injectToken(RequestTemplate template) {
        if (isNoAccessToken(template)) {
            return;
        }
        QiYeWeChatApi apiAnno =  getAnnotation(template);
        String app = apiAnno.appType().getAppId();
        // 企业内部应用
        if (config.isInnerApp()) {
            template.query(Constant.ACCESS_TOKEN_KEY, config.getAppToken(app));
        } else { // 第三方 服务商应用
            // suite access token
            if (isSuiteAccessToken(template)) {
                template.query(Constant.SUITE_ACCESS_TOKEN, config.getSuiteToken(app));
            } else if (isProviderAccessToken(template)) {
                template.query(Constant.PROVIDER_ACCESS_TOKEN, config.getProviderToken());
            } else {
                template.query(Constant.ACCESS_TOKEN_KEY, config.getCorpToken(app));
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ApiConfigurationTarget) {
            ApiConfigurationTarget<?> other = (ApiConfigurationTarget) obj;
            return type.equals(other.type)
                    && name.equals(other.name)
                    && url.equals(other.url);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + type.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + url.hashCode();
        return result;
    }
}
