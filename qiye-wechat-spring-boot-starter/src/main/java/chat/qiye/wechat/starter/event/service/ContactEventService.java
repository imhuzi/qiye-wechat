package chat.qiye.wechat.starter.event.service;

import chat.qiye.wechat.sdk.confg.QiyeWechatAppVo;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 企业通讯录 更新事件
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/10/08
 */
public interface ContactEventService {

    /**
     * 新增 或者 更新 部门
     *
     * @param qywxApp 应用信息
     * @param data    数据
     * @return 操作成功 返回 true, 否则返回false
     */
    boolean saveOrUpdateDept(QiyeWechatAppVo qywxApp, Map<String, Object> data);

    /**
     * 删除 部门
     *
     * @param qywxApp 应用信息
     * @param data    数据
     * @return 操作成功 返回 true, 否则返回false
     */
    boolean deleteDept(QiyeWechatAppVo qywxApp, Map<String, Object> data);

    /**
     * 保存或者 更新 成员信息
     *
     * @param qywxApp 应用信息
     * @param data    数据
     * @return 操作成功 返回 true, 否则返回false
     */
    boolean saveOrUpdateUser(QiyeWechatAppVo qywxApp, Map<String, Object> data);

    /**
     * 删除成员
     *
     * @param qywxApp 应用信息
     * @param data    数据
     * @return 操作成功 返回 true, 否则返回false
     */

    boolean deleteUser(QiyeWechatAppVo qywxApp, Map<String, Object> data);

    /**
     * 更新 标签
     *
     * @param qywxApp 应用信息
     * @param data    数据
     * @return 操作成功 返回 true, 否则返回false
     */
    boolean updateTag(QiyeWechatAppVo qywxApp, Map<String, Object> data);
}
