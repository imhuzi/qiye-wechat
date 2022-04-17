package chat.qiye.wechat.sdk.annotation;

import chat.qiye.wechat.sdk.constant.AppIdEnum;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 企业微信 api 注解
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/6/16
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface QiYeWeChatApi {
    /**
     * bean name
     */
    String name() default "";

    /**
     * @return an URL prefix for concatenating with relative path. It can be either
     * an absolute URL (e.g. https://postman-echo.com) or a placeholders (e.g. ${postman-echo.domain})
     */
    String url() default "";

    /**
     * Encoder bean name for the specified Feign client interface, to encode parameters
     * in certain way. The encoder bean class must implement the class feign.codec.Encoder.
     */
    String encoder() default "";

    /**
     * Decoder bean name for the specified Feign client interface, to decode parameters
     * in certain way. The decoder bean class must implement the class feign.codec.Decoder.
     */
    String decoder() default "";

    /**
     * Error decoder bean name for the specified Feign client interface, to decode error
     * in certain way. The error decoder bean class must implement the class feign.codec.ErrorDecoder.
     */
    String errorDecoder() default "";

    /**
     * http client bean name for the specified Feign client interface.
     * The client bean class must implement the class feign.Client.
     */
    String client() default "";

    /**
     * 系统 APP Id: 通讯录，客户关系等
     */
    AppIdEnum appType() default AppIdEnum.DEFAULT;
}
