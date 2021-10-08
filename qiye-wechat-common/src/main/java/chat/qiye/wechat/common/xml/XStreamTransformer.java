package chat.qiye.wechat.common.xml;

import chat.qiye.wechat.common.vo.EventXmlMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class XStreamTransformer {

  protected static final Map<Class, XStream> CLASS_2_XSTREAM_INSTANCE = configXStreamInstance();

  /**
   * xml -> pojo
   */
  @SuppressWarnings("unchecked")
  public static <T> T fromXml(Class<T> clazz, String xml) {
    T object = (T) CLASS_2_XSTREAM_INSTANCE.get(clazz).fromXML(xml);
    return object;
  }

  @SuppressWarnings("unchecked")
  public static <T> T fromXml(Class<T> clazz, InputStream is) {
    T object = (T) CLASS_2_XSTREAM_INSTANCE.get(clazz).fromXML(is);
    return object;
  }

  /**
   * 注册扩展消息的解析器.
   *
   * @param clz     类型
   * @param xStream xml解析器
   */
  public static void register(Class clz, XStream xStream) {
    CLASS_2_XSTREAM_INSTANCE.put(clz, xStream);
  }

  /**
   * pojo -> xml.
   */
  public static <T> String toXml(Class<T> clazz, T object) {
    return CLASS_2_XSTREAM_INSTANCE.get(clazz).toXML(object);
  }

  private static Map<Class, XStream> configXStreamInstance() {
    Map<Class, XStream> map = new HashMap<>();
    map.put(EventXmlMessage.class, configWxCpTpXmlMessage());
    return map;
  }

  private static XStream configWxCpTpXmlMessage() {
    XStream xstream = XStreamInitializer.getInstance();
    xstream.addPermission(AnyTypePermission.ANY);
    xstream.processAnnotations(EventXmlMessage.class);
    return xstream;
  }

}
