package chat.qiye.wechat.example.sdk;

import chat.qiye.wechat.sdk.api.contact.vo.ContactDeptDetailVo;
import chat.qiye.wechat.sdk.api.contact.vo.ContactDeptVo;

import java.util.List;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/13
 */
public class MainClass {
    public static void main(String[] args) {
        ContactService contactService = new ContactService();
        // 查询 通讯录 部门列表
        List<ContactDeptDetailVo> deptVoList = contactService.listDept(0);
        System.out.println("DeptList:" + deptVoList);
        // 创建部门

        ContactDeptVo contactDeptVo = new ContactDeptVo();
        contactDeptVo.setId(2);
        contactDeptVo.setName("测试部");
        contactDeptVo.setNameEn("test");
        contactDeptVo.setParentid(1);
        Integer newDeptId = contactService.createDept(contactDeptVo);

        if (newDeptId != null) {
            boolean ret = contactService.deleteDept(newDeptId);
            System.out.println("delete result:" + ret);
        }
    }
}
