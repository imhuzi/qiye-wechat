package cn.tobdev.qy.weixin.sdk.interceptor;

import static feign.Util.checkNotNull;
import static feign.Util.emptyToNull;

import cn.tobdev.qy.weixin.sdk.service.TokenAndBaseUrlProvider;
import feign.Request;
import feign.RequestTemplate;
import feign.Target;
import lombok.extern.slf4j.Slf4j;

/**
 * 动态 token 处理
 *
 * @param <T>
 */
@Slf4j
public class DynamicTokenTarget<T> implements Target<T> {

  private final Class<T> type;

  private final String name;

  private final String url;

  public DynamicTokenTarget(Class<T> clazz, TokenAndBaseUrlProvider provider) {
    this(clazz, provider.getBaseUrl(),provider.getBaseUrl());
  }

  public DynamicTokenTarget(Class<T> type, String name, String url) {
    this.type = checkNotNull(type, "type");
    this.name = checkNotNull(emptyToNull(name), "name");
    this.url = checkNotNull(emptyToNull(url), "url");
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

    return input.request();
  }


  @Override
  public boolean equals(Object obj) {
    if (obj instanceof DynamicTokenTarget) {
      DynamicTokenTarget<?> other = (DynamicTokenTarget) obj;
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
