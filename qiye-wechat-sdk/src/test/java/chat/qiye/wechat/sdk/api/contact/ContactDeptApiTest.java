package chat.qiye.wechat.sdk.api.contact;

import chat.qiye.wechat.sdk.BaseTest;
import chat.qiye.wechat.sdk.api.contact.resp.ContactDeptListResp;
import chat.qiye.wechat.sdk.service.ApiFactory;
import org.junit.Assert;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/6
 */
public class ContactDeptApiTest extends BaseTest {

    private ContactDeptApi contactDeptApi;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        contactDeptApi = ApiFactory.getApiBean(ContactDeptApi.class, this.apiConfigurationProvider);
    }

    public void testList() {
        ContactDeptListResp resp = contactDeptApi.list(null);
        Assert.assertTrue(resp.success());
    }

    public void testCreate() {
    }

    public void testUpdate() {
    }

    public void testDelete() {
    }
}