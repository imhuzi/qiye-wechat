package chat.qiye.wechat.example.sdk;

import chat.qiye.wechat.sdk.api.contact.ContactDeptApi;
import chat.qiye.wechat.sdk.api.contact.resp.ContactDeptCreateResp;
import chat.qiye.wechat.sdk.api.contact.vo.ContactDeptDetailVo;
import chat.qiye.wechat.sdk.api.contact.vo.ContactDeptVo;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.service.ApiConfigurationDefaultProvider;
import chat.qiye.wechat.sdk.service.ApiFactory;

import java.util.List;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/13
 */
public class MainClass2 {
    public static void main(String[] args) {
        // 获取Api实例， 所有封装的Api 都在 chat.qiye.wechat.sdk.api 包下，并以Api结尾
        ContactDeptApi contactDeptApi = ApiFactory.getApiBean(ContactDeptApi.class, new ApiConfigurationDefaultProvider());
        // 查询 通讯录 部门列表
        List<ContactDeptDetailVo> deptVoList = contactDeptApi.list(0).getDepartment();
        System.out.println("DeptList:" + deptVoList);
        // 创建部门
        ContactDeptVo contactDeptVo = new ContactDeptVo();
        contactDeptVo.setId(2);
        contactDeptVo.setName("测试部");
        contactDeptVo.setNameEn("test");
        contactDeptVo.setParentid(1);
        ContactDeptCreateResp resp = contactDeptApi.create(contactDeptVo);

        if (resp.success()) {
            RespStatus ret = contactDeptApi.delete(resp.getId());
            System.out.println("delete result:" + ret.success());
        }
    }
}
