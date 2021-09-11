package chat.qiye.wechat.sdk.service;

import chat.qiye.wechat.sdk.interceptor.ApiConfigurationTarget;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import feign.Feign;
import feign.Request;
import feign.httpclient.ApacheHttpClient;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

/**
 * Api factory
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/7/17
 */
public class ApiFactory {

    public static <T> T getApiBean(Class<T> cls, ApiConfigurationProvider provider) {
        return Feign.builder()
                .client(new ApacheHttpClient())
                .encoder(new JacksonEncoder(ApiInstance.getObjectMaper()))
                .decoder(new JacksonDecoder(ApiInstance.getObjectMaper()))
                .options(new Request.Options(provider.getConnectTimeout(), TimeUnit.SECONDS, provider.getReadTimeout(),
                        TimeUnit.SECONDS, provider.followRedirects()))
                .target(new ApiConfigurationTarget<>(cls, provider));
    }


    public static ObjectMapper getObjectMaper() {
        return ApiInstance.MAPPER;
    }

    /**
     * 线程安全，不影响系统性能 的单例模式
     */
    private static class ApiInstance {

        /**
         * jackson mapper 实例
         */
        private static final ObjectMapper MAPPER = new ObjectMapper();

        static {
            //序列化设置
            MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            MAPPER.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
            MAPPER.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true) // 允许出现单引号
                    .configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true) // 支持{age:12, name:"曹操"}非标准的json串
                    .configure(Feature.STRICT_DUPLICATE_DETECTION, true)
                    .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS) // 禁止 date转 时间戳
                    .disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY) // 允许单个值转为数组
                    .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES) // 允许对象忽略json中不存在的属性
                    .disable(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES) // null 转基本类型 报错问题
                    .disable(SerializationFeature.FAIL_ON_EMPTY_BEANS) // 忽略无法转换的对象
                    .setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        }

        public static ObjectMapper getObjectMaper() {
            return ApiInstance.MAPPER;
        }

    }
}
