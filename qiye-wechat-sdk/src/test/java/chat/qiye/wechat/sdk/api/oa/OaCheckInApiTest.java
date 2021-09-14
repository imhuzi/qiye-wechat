package chat.qiye.wechat.sdk.api.oa;

import chat.qiye.wechat.sdk.BaseTest;
import chat.qiye.wechat.sdk.service.ApiFactory;
import org.junit.Assert;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/9
 */
public class OaCheckInApiTest extends BaseTest {

    private OaCheckInApi oaCheckInApi;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        oaCheckInApi = ApiFactory.getApiBean(OaCheckInApi.class, apiConfigurationProvider);
    }

    public void testGetCorpOption() {
        Assert.assertTrue(oaCheckInApi.getCorpOption().success());
    }

    public void testGetUserOption() {
    }

    public void testGetData() {
    }

    public void testGetDayData() {
    }

    public void testGetMonthData() {
    }

    public void testGetUserScheduleList() {
    }

    public void testSetUserScheduleList() {
    }

    public void testAddUserFace() {
    }
}