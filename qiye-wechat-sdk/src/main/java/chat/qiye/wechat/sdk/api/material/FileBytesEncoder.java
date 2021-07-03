package chat.qiye.wechat.sdk.api.material;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.lang.reflect.Type;
import java.util.Map;

import feign.Request;
import feign.RequestTemplate;
import feign.codec.EncodeException;
import feign.codec.Encoder;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/1
 */
public class FileBytesEncoder implements Encoder {

  @Override
  public void encode(Object object, Type type, RequestTemplate template) throws EncodeException {
    template.body((byte[]) ((Map) object).get("file"), UTF_8);
  }
}
