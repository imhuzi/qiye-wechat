package chat.qiye.wechat.starter.event.handler;

import chat.qiye.wechat.sdk.confg.QiyeWechatAppVo;
import chat.qiye.wechat.starter.SpringContextUtil;
import chat.qiye.wechat.starter.event.service.ContactEventService;
import chat.qiye.wechat.starter.event.type.ContactEventType;
import chat.qiye.wechat.starter.event.vo.EventDataVo;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * 成员通知事件
 * ->
 * 新增成员事件
 * 更新成员事件
 * 删除成员事件
 * ->
 * 新增部门事件
 * 更新部门事件
 * 删除部门事件
 * ->
 * 标签成员变更事件
 *
 * @Link https://work.weixin.qq.com/api/doc/90001/90143/90639
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @created on  : 2021/1/3
 */
@Slf4j
public class ChangeContactEventHandler extends AbstractEventHandler {

  private static final ContactEventService contactService;

  static {
    contactService = SpringContextUtil.getBean(ContactEventService.class);
  }

  public ChangeContactEventHandler(EventDataVo data) {
    super(data);
  }

  @Override
  public boolean handler(QiyeWechatAppVo qywxApp, String changeType, Map<String,Object> data) {
    boolean ret = false;
    switch (changeType) {
      case ContactEventType.CREATE_PARTY: // 创建部门事件
      case ContactEventType.UPDATE_PARTY: // 更新部门事件
        ret = contactService.saveOrUpdateDept(qywxApp, data);
        break;
      case ContactEventType.DELETE_PARTY: // 删除部门事件
        ret = contactService.deleteDept(qywxApp, data);
        break;
      case ContactEventType.CREATE_USER: // 创建成员事件
      case ContactEventType.UPDATE_USER: // 更新成员事件
        ret = contactService.saveOrUpdateUser(qywxApp, data);
        break;
      case ContactEventType.DELETE_USER: // 删除成员事件
        ret = contactService.deleteUser(qywxApp, data);
        break;
      case ContactEventType.UPDATE_TAG: // 标签成员变更事件
        ret = contactService.updateTag(qywxApp, data);
        break;
    }
    return ret;
  }
}
