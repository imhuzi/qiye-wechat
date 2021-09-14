package chat.qiye.wechat.starter;

import feign.Client;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.codec.ErrorDecoder;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.util.StringUtils;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/11
 */
public class FeignConfigurationUtils {
    @SuppressWarnings("unchecked")
    public static <T> T resolveOverrideableBean(Class<T> hint, BeanFactory beanFactory, String beanName,
                                                Class<?> beanClass) {
        boolean hasBeanName = StringUtils.hasText(beanName);
        boolean hasClass = (beanClass != null && beanClass != void.class);

        if (hasBeanName && hasClass) {
            throw new IllegalArgumentException(
                    String.format("feign client %s bean is exclusive with %s class", hint.getSimpleName(), hint.getSimpleName()));
        }

        if (hasBeanName) {
            return beanFactory.getBean(beanName, hint);
        }

        if (hasClass) {
            try {
                return (T) beanClass.getDeclaredConstructor().newInstance();
            } catch (ReflectiveOperationException e) {
                throw new IllegalArgumentException(e);
            }
        }

        return null;
    }

    public static Decoder resolveDecoder(BeanFactory beanFactory, String decoderBeanName,
                                         Class<? extends Decoder> decoderClass) {
        return resolveOverrideableBean(Decoder.class, beanFactory, decoderBeanName, decoderClass);
    }

    public static Encoder resolveEncoder(BeanFactory beanFactory, String encoderBeanName,
                                         Class<? extends Encoder> encoderClass) {
        return resolveOverrideableBean(Encoder.class, beanFactory, encoderBeanName, encoderClass);
    }

    public static ErrorDecoder resolveErrorDecoder(BeanFactory beanFactory, String errorDecoderBeanName,
                                                   Class<? extends ErrorDecoder> errorDecoderClass) {
        return resolveOverrideableBean(ErrorDecoder.class, beanFactory, errorDecoderBeanName, errorDecoderClass);
    }

    public static Client resolveClient(BeanFactory beanFactory, String clientBeanName,
                                       Class<? extends Client> clientClass) {
        return resolveOverrideableBean(Client.class, beanFactory, clientBeanName, clientClass);
    }

}
