package chat.qiye.wechat.starter.event.vo;

import chat.qiye.wechat.sdk.confg.QiyeWechatAppVo;
import lombok.Data;

import java.util.Map;

/**
 * 事件数据
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @created on  : 2021/1/3
 */
@Data
public class EventDataVo {

    private String eventType;

    private Map<String,Object> data;

    private QiyeWechatAppVo qywxApp;

    private String requestId;

    private String changeType;

    private Long logId;

}
