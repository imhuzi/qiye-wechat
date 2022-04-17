package chat.qiye.wechat.sdk.api.customer;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.customer.param.strategy.StrategyCreateParam;
import chat.qiye.wechat.sdk.api.customer.param.strategy.StrategyEditParam;
import chat.qiye.wechat.sdk.api.customer.param.strategy.StrategyIdParam;
import chat.qiye.wechat.sdk.api.customer.param.strategy.StrategyGetRangeParam;
import chat.qiye.wechat.sdk.api.customer.resp.strategy.GetStrategyRangeResp;
import chat.qiye.wechat.sdk.api.customer.resp.strategy.StrategyDetailResp;
import chat.qiye.wechat.sdk.api.customer.resp.strategy.StrategyListResp;
import chat.qiye.wechat.sdk.api.customer.resp.strategy.StrategySaveResp;
import chat.qiye.wechat.sdk.common.GetListParam;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import chat.qiye.wechat.sdk.constant.CustomerApiUris;
import feign.RequestLine;

/**
 * 客户联系规则组管理 API
 * <p>
 * https://developer.work.weixin.qq.com/document/path/94883
 * <p>
 * 权限说明:
 * <p>
 * 仅可使用“客户联系”secret获取的accesstoken来调用（accesstoken如何获取？）
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2022/3/8
 */

@QiYeWeChatApi(appType = AppIdEnum.APP_CUSTOMER)
public interface CustomerStrategyApi {
    /**
     * 企业可通过此接口获取企业配置的所有客户规则组id列表。
     * <p>
     * <p>
     * <p>
     * 请求方式: POST(HTTP)
     * <p>
     * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/externalcontact/customer_strategy/list?access_token=ACCESS_TOKEN
     * <p>
     * 请求示例:
     * <p>
     * {
     * "cursor":"CURSOR",
     * "limit":1000
     * }
     * <p>
     * <p>
     * 参数说明:
     * <p>
     * 参数	必须	说明
     * access_token	是	调用接口凭证
     * cursor	否	分页查询游标，首次调用可不填
     * limit	否	分页大小,默认为1000，最大不超过1000
     *
     * @return
     */
    @RequestLine(CustomerApiUris.API_CUSTOMER_STRATEGY_LIST)
    StrategyListResp list(GetListParam param);

    /**
     * 获取规则组详情
     * 企业可以通过此接口获取某个客户规则组的详细信息。
     * <p>
     * <p>
     * <p>
     * 请求方式: POST(HTTP)
     * <p>
     * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/externalcontact/customer_strategy/get?access_token=ACCESS_TOKEN
     * <p>
     * 请求示例:
     * <p>
     * {
     * "strategy_id":1
     * }
     *
     * @param param
     * @return
     */
    @RequestLine(CustomerApiUris.API_CUSTOMER_STRATEGY_GET)
    StrategyDetailResp get(StrategyIdParam param);

    /**
     * 获取规则组管理范围
     * 企业可通过此接口获取某个客户规则组管理的成员和部门列表
     * <p>
     * <p>
     * <p>
     * 请求方式: POST(HTTP)
     * <p>
     * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/externalcontact/customer_strategy/get_range?access_token=ACCESS_TOKEN
     * <p>
     * 请求示例:
     * <p>
     * {
     * "strategy_id": 1,
     * "cursor":"CURSOR",
     * "limit":1000
     * }
     *
     * @param param
     * @return
     */
    @RequestLine(CustomerApiUris.API_CUSTOMER_STRATEGY_GET_RANGE)
    GetStrategyRangeResp getRange(StrategyGetRangeParam param);

    /**
     * 新建规则
     *
     * @param param
     * @return
     */
    @RequestLine(CustomerApiUris.API_CUSTOMER_STRATEGY_CREATE)
    StrategySaveResp create(StrategyCreateParam param);

    /**
     * 编辑规则
     *
     * @param param
     * @return
     */
    @RequestLine(CustomerApiUris.API_CUSTOMER_STRATEGY_EDIT)
    StrategySaveResp edit(StrategyEditParam param);

    /**
     * 删除规则
     *
     * @param param
     * @return
     */
    @RequestLine(CustomerApiUris.API_CUSTOMER_STRATEGY_DEL)
    RespStatus delete(StrategyIdParam param);


}
