package cn.tobdev.qy.weixin.sdk.coverter;

import com.dtflys.forest.converter.json.ForestJacksonConverter;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

/**
 * 自定义 Jackson 转换器
 */
public class ApiJacksonConverter extends ForestJacksonConverter {
    public ApiJacksonConverter() {
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
    }
}
