package chat.qiye.wechat.sdk;

import chat.qiye.wechat.sdk.service.ApiConfigurationDefaultProvider;
import chat.qiye.wechat.sdk.service.ApiConfigurationProvider;
import junit.framework.TestCase;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/17
 */
public class BaseTest  extends TestCase {

    protected ApiConfigurationProvider apiConfigurationProvider;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        apiConfigurationProvider = new ApiConfigurationDefaultProvider();
    }
}
