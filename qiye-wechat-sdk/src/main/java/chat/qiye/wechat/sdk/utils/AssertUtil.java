package chat.qiye.wechat.sdk.utils;

import java.util.Collection;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/8/30
 */
public class AssertUtil {
    private AssertUtil() {
    }

    public static void notEmpty(String string, String message) {
        if (StringUtil.isEmpty(string)) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void assertNotEmpty(Collection<?> collection, String message) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void assertNotBlank(String string, String message) {
        if (StringUtil.isBlank(string)) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void notNull(Object object, String message) {
        if (object == null) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void isTrue(boolean value, String message) {
        if (!value) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void assertState(boolean condition, String message) {
        if (!condition) {
            throw new IllegalStateException(message);
        }
    }
}
