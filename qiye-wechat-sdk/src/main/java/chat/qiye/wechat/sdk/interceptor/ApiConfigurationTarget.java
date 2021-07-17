package chat.qiye.wechat.sdk.interceptor;

import static feign.Util.checkNotNull;
import static feign.Util.emptyToNull;

import java.lang.annotation.Annotation;

import chat.qiye.wechat.sdk.annotation.QiYeChatApi;
import chat.qiye.wechat.sdk.constant.Constant;
import chat.qiye.wechat.sdk.service.ApiConfigurationProvider;
import feign.Request;
import feign.RequestTemplate;
import feign.Target;
import lombok.extern.slf4j.Slf4j;

/**
 *  api configuration target
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/16
 * @param <T>
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
   * @param input
   */
  @Override
  public Request apply(RequestTemplate input) {
    if (input.url().indexOf("http") != 0) {
      input.target(url());
    }
    //todo 动态 token 处理
//    input.header("X-Auth-Token", urlAndToken.tokenId);
//    input.header("X-Request-ID", requestIdProvider.get());
    input.query(Constant.ACCESS_TOKEN_KEY, config.getToken());
    return input.request();
  }

  /**
   * 获取 注解信息
   *
   * @param template RequestTemplate
   * @return QiYeChatApi annotation
   */
  private QiYeChatApi getAnnotation(RequestTemplate template) {
    QiYeChatApi annotation = template.methodMetadata().method().getAnnotation(QiYeChatApi.class);
    if (annotation == null) {
      annotation = template.feignTarget().type().getInterfaces()[0].getAnnotation(QiYeChatApi.class);
    }
    return annotation;
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
