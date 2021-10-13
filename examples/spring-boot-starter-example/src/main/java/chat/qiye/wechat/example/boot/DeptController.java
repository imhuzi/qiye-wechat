package chat.qiye.wechat.example.boot;

import chat.qiye.wechat.sdk.api.contact.ContactDeptApi;
import chat.qiye.wechat.sdk.api.contact.resp.ContactDeptListResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/14
 */
@RestController
public class DeptController {

    @Resource
    ContactDeptApi contactDeptApi;

    @GetMapping("/list")
    public ContactDeptListResp list(@RequestParam(defaultValue = "0") Integer id) {
        return contactDeptApi.list(id);
    }
}
