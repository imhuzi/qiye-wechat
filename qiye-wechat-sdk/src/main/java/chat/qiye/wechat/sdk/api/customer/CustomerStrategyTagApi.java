package chat.qiye.wechat.sdk.api.customer;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.customer.dto.TagDto;
import chat.qiye.wechat.sdk.api.customer.dto.TagGroupStrategyItem;
import chat.qiye.wechat.sdk.api.customer.param.strategy.StrategyTagParam;
import chat.qiye.wechat.sdk.api.customer.resp.strategy.StrategyTagListResp;
import chat.qiye.wechat.sdk.common.GetListParam;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import chat.qiye.wechat.sdk.constant.CustomerApiUris;
import feign.RequestLine;

/**
 * 管理企业规则组下的客户标签 API
 * <p>
 * https://developer.work.weixin.qq.com/document/path/94882#32022
 * <p>
 * 权限说明:
 * <p>
 * 仅可使用“客户联系”secret获取的accesstoken来调用（accesstoken如何获取？）
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2022/3/8
 */

@QiYeWeChatApi(appType = AppIdEnum.APP_CUSTOMER)
public interface CustomerStrategyTagApi {
    /**
     * 获取指定规则组下的企业客户标签
     * 企业可通过此接口获取某个规则组内的企业客户标签详情。
     * <p>
     * <p>
     * <p>
     * 请求方式: POST(HTTP)
     * <p>
     * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_strategy_tag_list?access_token=ACCESS_TOKEN
     * <p>
     * 请求示例:
     *
     * @return
     */
    @RequestLine(CustomerApiUris.API_CUSTOMER_STRATEGY_TAG_LIST)
    StrategyTagListResp list(StrategyTagParam param);

    /**
     * 为指定规则组创建企业客户标签
     * 企业可通过此接口向规则组中添加新的标签组和标签，每个企业的企业标签和规则组标签合计最多可配置3000个。注意，仅可在一级规则组下添加标签。
     * <p>
     * <p>
     * <p>
     * 请求方式: POST(HTTP)
     * <p>
     * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/externalcontact/add_strategy_tag?access_token=ACCESS_TOKEN
     * <p>
     * 请求示例:
     * <p>
     * {
     * "strategy_id":1,
     * "group_id": "GROUP_ID",
     * "group_name": "GROUP_NAME",
     * "order": 1,
     * "tag": [{
     * "name": "TAG_NAME_1",
     * "order": 1
     * },
     * {
     * "name": "TAG_NAME_2",
     * "order": 2
     * }
     * ]
     * }
     * 参数说明:
     * <p>
     * 参数	必须	说明
     * access_token	是	调用接口凭证
     * strategy_id	是	规则组id
     * group_id	否	标签组id
     * group_name	否	标签组名称，最长为30个字符
     * order	否	标签组次序值。order值大的排序靠前。有效的值范围是[0, 2^32)
     * tag.name	是	添加的标签名称，最长为30个字符
     * tag.order	否	标签次序值。order值大的排序靠前。有效的值范围是[0, 2^32)
     * 注意:
     * 如果填写了group_id参数，则group_name和标签组的order参数会被忽略。
     * 如果填写的group_name和此规则组下的其他标签组同名，则会将相关标签加入已存在的同名标签组下
     * 不支持创建空标签组。
     * 标签组内的标签不可同名，如果传入多个同名标签，则只会创建一个。
     *
     * @param param
     * @return
     */
    @RequestLine(CustomerApiUris.API_CUSTOMER_STRATEGY_TAG_ADD)
    StrategyTagListResp add(TagGroupStrategyItem param);

    /**
     * 请求方式: POST(HTTP)
     * <p>
     * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/externalcontact/edit_strategy_tag?access_token=ACCESS_TOKEN
     * <p>
     * 请求示例:
     * <p>
     * {
     * "id": "TAG_ID",
     * "name": "NEW_TAG_NAME",
     * "order": 1,
     * <p>
     * }
     * 参数说明:
     * <p>
     * 参数	必须	说明
     * access_token	是	调用接口凭证
     * id	是	标签或标签组的id
     * name	否	新的标签或标签组名称，最长为30个字符
     * order	否	标签/标签组的次序值。order值大的排序靠前。有效的值范围是[0, 2^32)
     *
     * @param param
     * @return
     */
    @RequestLine(CustomerApiUris.API_CUSTOMER_STRATEGY_TAG_EDIT)
    RespStatus edit(TagDto param);

    /**
     * 删除指定规则组下的企业客户标签
     * 企业可通过此接口删除某个规则组下的标签，或删除整个标签组。
     * <p>
     * 请求方式: POST(HTTP)
     * <p>
     * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/externalcontact/del_strategy_tag?access_token=ACCESS_TOKEN
     * <p>
     * 请求示例:
     * <p>
     * {
     * "tag_id": [
     * "TAG_ID_1",
     * "TAG_ID_2"
     * ],
     * "group_id": [
     * "GROUP_ID_1",
     * "GROUP_ID_2"
     * ],
     * }
     * 参数说明:
     * <p>
     * 参数	必须	说明
     * access_token	是	调用接口凭证
     * tag_id	否	标签的id列表
     * group_id	否	标签组的id列表
     *
     * @param param
     * @return
     */
    @RequestLine(CustomerApiUris.API_CUSTOMER_STRATEGY_TAG_DEL)
    RespStatus del(StrategyTagParam param);

}
