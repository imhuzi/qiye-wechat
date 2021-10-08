package chat.qiye.wechat.starter.event;

import chat.qiye.wechat.sdk.service.ApiConfigurationProvider;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 企业微信 事件通知 controller
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/24
 */
@Controller
@RequestMapping("${qiye.wechat.event-prefix:/qiyewechat}")
@Slf4j
public class QiYeWechatEventController {

    @Resource
    ApiConfigurationProvider apiConfigurationProvider;

    /**
     * 通讯录 事件 回调处理
     *
     * @param appId
     * @param msg_signature
     * @param timestamp
     * @param nonce
     * @param rawXmlStr
     * @return
     */
    @PostMapping(path = "/event")
    @ResponseBody
    public String eventPost(@RequestParam(name = "app") Long appId,
                                    @RequestParam String msg_signature,
                                    @RequestParam String timestamp,
                                    @RequestParam String nonce,
                                    @RequestBody(required = false) String rawXmlStr) throws AesException {

        // appId 必须 是系统中有的才可以 进入
        apiConfigurationProvider qywxApp = apiConfigurationProvider.getConfigByAppType(appId);
        if (qywxApp == null) {
            log.error("illegalNoAppInfo:{}", appId);
            return "error";
        }
        log.info("[事件回调]原生 xml 字符串:{}", rawXmlStr);
        // todo 是否异步验证签名？
        // 异步验证签名，如果签名错误，无法让腾讯再次推送，当然这种概率很小
        String received = (String) XmlUtils.xml2Map(rawXmlStr).get("ToUserName");
        WXBizMsgCrypt wxBizMsgCrypt = new WXBizMsgCrypt(qywxApp.getEventToken(), qywxApp.getEventEncodingAesKey(), received);
        // 解码后的数据
        String decryptData = wxBizMsgCrypt.DecryptMsg(msg_signature, timestamp, nonce, rawXmlStr);
//             异步 处理 回调事件
        threadPoolBizExecutor.execute(new EventHandalerRunnable(decryptData, qywxApp, MDC.get("requestId")));
        log.info("返回给企业微信服务器 \"success\"字符串");
        return "success";

    }

    @GetMapping(path = "/event")
    @ResponseBody
    public String eventGet(@RequestParam(name = "app") Long appId,
                                   @RequestParam String msg_signature,
                                   @RequestParam String timestamp,
                                   @RequestParam String nonce,
                                   @RequestParam(required = false) String echostr) throws AesException {

        // appId 必须 是系统中有的才可以 进入
        QywxApp qywxApp = qywxAppService.getById(appId);
        if (qywxApp == null) {
            log.error("illegalNoAppInfo:{}", appId);
            return "error";
        }
        log.info("企业微信回调验证[事件回调]接口,appid:{},msg_signature:{},timestamp:{},nonce:{},echostr:{}", appId, msg_signature, timestamp, nonce, echostr);
        WXBizMsgCrypt wxBizMsgCrypt = new WXBizMsgCrypt(qywxApp.getEventToken(), qywxApp.getEventEncodingAesKey(), qywxApp.getCorpId());
        // get 请求,是企业微信服务器测试我们配置的回调地址使用的
        log.info("get 请求");
        String verifyURL = wxBizMsgCrypt.VerifyURL(msg_signature, timestamp, nonce, echostr);
        log.info("接受到的数据:{}", verifyURL);
        return verifyURL;
    }
}
