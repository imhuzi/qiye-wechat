package chat.qiye.wechat.example.sdk;

import chat.qiye.wechat.sdk.api.contact.ContactDeptApi;
import chat.qiye.wechat.sdk.api.contact.resp.ContactDeptCreateResp;
import chat.qiye.wechat.sdk.api.contact.vo.ContactDeptDetailVo;
import chat.qiye.wechat.sdk.api.contact.vo.ContactDeptVo;
import chat.qiye.wechat.sdk.service.ApiFactory;

import java.util.List;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/13
 */
public class ContactService extends BaseService {
    private ContactDeptApi contactDeptApi;

    public ContactService() {
        super();
        contactDeptApi = ApiFactory.getApiBean(ContactDeptApi.class, this.apiConfigurationProvider);
    }

    /**
     * 查询 通讯录 部门列表
     *
     * @param id 部门id
     * @return 部门列表
     */
    public List<ContactDeptDetailVo> listDept(Integer id) {
        return contactDeptApi.list(id).getDepartment();
    }

    /**
     * 创建 部门
     *
     * @param deptParam 创建部门参数
     * @return 成功 返回新部门id, 失败 null
     */
    public Integer createDept(ContactDeptVo deptParam) {
        ContactDeptCreateResp resp= contactDeptApi.create(deptParam);
        return resp.getId();
    }

    public boolean updateDept(ContactDeptVo deptParam) {
        return contactDeptApi.update(deptParam).success();
    }

    public boolean deleteDept(Integer id) {
        return contactDeptApi.delete(id).success();
    }

}
