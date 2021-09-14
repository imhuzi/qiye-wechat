package chat.qiye.wechat.sdk.api.contact;

import chat.qiye.wechat.sdk.BaseTest;
import chat.qiye.wechat.sdk.api.contact.resp.TagListResp;
import chat.qiye.wechat.sdk.service.ApiFactory;
import org.junit.Assert;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/6
 */
public class ContactTagApiTest extends BaseTest {

    private ContactTagApi contactTagApi;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        contactTagApi = ApiFactory.getApiBean(ContactTagApi.class, this.apiConfigurationProvider);
    }

    public void testList() {
        TagListResp resp = contactTagApi.list();
        Assert.assertTrue(resp.success());
    }

    public void testCreate() {
    }

    public void testUpdate() {
    }

    public void testDelete() {
    }

    public void testGetMemberList() {
    }

    public void testDeleteMembers() {
    }

    public void testAddMembers() {
    }
}