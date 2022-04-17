package chat.qiye.wechat.sdk.api.oa;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.oa.param.AddCheckInUserFaceParam;
import chat.qiye.wechat.sdk.api.oa.param.GetCheckInDataParam;
import chat.qiye.wechat.sdk.api.oa.param.GetCheckInUserRuleParam;
import chat.qiye.wechat.sdk.api.oa.param.SetCheckInScheduleListParam;
import chat.qiye.wechat.sdk.api.oa.resp.CheckInDataResp;
import chat.qiye.wechat.sdk.api.oa.resp.CheckInDayDataResp;
import chat.qiye.wechat.sdk.api.oa.resp.CheckInMonthDataResp;
import chat.qiye.wechat.sdk.api.oa.resp.CheckInUserScheduleListResp;
import chat.qiye.wechat.sdk.api.oa.resp.CorpCheckInRuleResp;
import chat.qiye.wechat.sdk.api.oa.resp.UserCheckInRuleResp;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.OaApiUris;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import feign.RequestLine;

/**
 * OA 打卡
 * <p>
 * https://open.work.weixin.qq.com/api/doc/90000/90135/90261
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/8
 */
@QiYeWeChatApi(appType = AppIdEnum.APP_CHECK_IN)
public interface OaCheckInApi {
    /**
     * 获取企业所有打卡规则
     * <p>
     * 企业可通过打卡应用Secret调用本接口，获取企业内所有打卡规则数据。
     * <p>
     * 请求方式：POST（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/checkin/getcorpcheckinoption?access_token=ACCESS_TOKEN
     * <p>
     * 请求示例：
     * <p>
     * {}
     * 参数说明：
     * <p>
     * 参数	必须	说明
     * access_token	是	调用接口凭证。必须使用打卡应用的Secret获取access_token，获取方式参考：文档-获取access_token
     *
     * @return
     */
    @RequestLine(OaApiUris.API_GET_CORP_CHECKIN_OPTION)
    CorpCheckInRuleResp getCorpOption();

    /**
     * 获取员工打卡规则
     * 调试工具
     * 企业可通过打卡应用Secret获取的token，获取指定员工指定日期的打卡规则。
     * 第三方应用可获取应用可见范围内指定员工指定日期的打卡规则。
     * <p>
     * 请求方式：POST（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/checkin/getcheckinoption?access_token=ACCESS_TOKEN
     * <p>
     * 请求示例：
     * <p>
     * {
     * "datetime": 1511971200,
     * "useridlist": ["james","paul"]
     * }
     * 参数说明：
     *
     * @param param 参数	必须	说明
     *              access_token	是	调用接口凭证。必须使用打卡应用的Secret获取access_token，获取方式参考：文档-获取access_token
     *              datetime	是	需要获取规则的日期当天0点的Unix时间戳
     *              useridlist	是	需要获取打卡规则的用户列表
     *              用户列表不超过100个，若用户超过100个，请分批获取。
     *              用户在不同日期的规则不一定相同，请按天获取。
     * @return
     */
    @RequestLine(OaApiUris.API_GET_USER_CHECKIN_OPTION)
    UserCheckInRuleResp getUserOption(GetCheckInUserRuleParam param);

    /**
     * 获取打卡记录数据
     * 调试工具
     * 企业可通过打卡应用Secret调用本接口，获取指定员工指定时间段内的打卡记录数据。
     * 第三方应用可获取应用可见范围内指定员工指定日期的打卡记录数据。
     * <p>
     * 请求方式：POST（HTTPS）
     * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/checkin/getcheckindata?access_token=ACCESS_TOKEN
     * <p>
     * 请求示例：
     * <p>
     * {
     * "opencheckindatatype": 3,
     * "starttime": 1492617600,
     * "endtime": 1492790400,
     * "useridlist": ["james","paul"]
     * }
     * 参数说明：
     *
     * @param param 参数	必须	说明
     *              access_token	是	调用接口凭证。必须使用打卡应用的Secret获取access_token，获取方式参考：文档-获取access_token
     *              opencheckindatatype	是	打卡类型。1：上下班打卡；2：外出打卡；3：全部打卡
     *              starttime	是	获取打卡记录的开始时间。Unix时间戳
     *              endtime	是	获取打卡记录的结束时间。Unix时间戳
     *              useridlist	是	需要获取打卡记录的用户列表
     * @return
     */
    @RequestLine(OaApiUris.API_GET_CHECKIN_DATA)
    CheckInDataResp getData(GetCheckInDataParam param);

    /**
     * 获取打卡日报数据
     * 企业可通过打卡应用Secret调用本接口，获取指定员工指定时间段内的打卡日报统计数据。
     * 第三方应用可获取应用可见范围内指定员工指定日期内的打卡日报统计数据。
     * <p>
     * 请求方式: POST(HTTPS)
     * <p>
     * 请求地址: https://qyapi.weixin.qq.com/cgi-bin/checkin/getcheckin_daydata?access_token=ACCESS_TOKEN
     * <p>
     * 请求示例
     * <p>
     * {
     * "starttime": 1599062400,
     * "endtime": 1599062400,
     * "useridlist": [
     * "ZhangSan"
     * ]
     * }
     * 参数说明:
     *
     * @param param 参数	必须	类型	说明
     *              access_token	是	string	调用接口凭证，必须使用打卡应用的Secret获取access_token，获取方式参考：文档-获取access_token。
     *              starttime	是	uint32	获取日报的开始时间。0点Unix时间戳
     *              endtime	是	uint32	获取日报的结束时间。0点Unix时间戳
     *              useridlist	是	string[]	获取日报的userid列表。
     *              单个userid不少于1字节，不多于64字节
     *              可填充个数：1 ~ 100
     * @return
     */
    @RequestLine(OaApiUris.API_GET_CHECKIN_DAY_DATA)
    CheckInDayDataResp getDayData(GetCheckInDataParam param);

    /**
     * 获取打卡月报数据
     * 企业可通过打卡应用Secret调用本接口，获取指定员工指定时间段内的打卡月报统计数据。
     * 第三方应用可获取应用可见范围内指定员工指定日期内的打卡月报统计数据。
     * <p>
     * 请求方式: POST(HTTPS)
     * <p>
     * 请求地址: https://qyapi.weixin.qq.com/cgi-bin/checkin/getcheckin_monthdata?access_token=ACCESS_TOKEN
     * <p>
     * 请求示例
     * <p>
     * {
     * "starttime": 1599062400,
     * "endtime": 1599408000,
     * "useridlist": [
     * "ZhangSan"
     * ]
     * }
     * 参数说明:
     *
     * @param param 参数	必须	类型	说明
     *              access_token	是	string	调用接口凭证，必须使用打卡应用的Secret获取access_token，获取方式参考：文档-获取access_token
     *              starttime	否	uint32	获取月报的开始时间。0点Unix时间戳
     *              endtime	否	uint32	获取月报的结束时间。0点Unix时间戳
     *              useridlist	否	string[]	-
     *              不少于1字节
     *              不多于64字节
     *              可填充个数：1 ~ 100
     * @return
     */
    @RequestLine(OaApiUris.API_GET_CHECKIN_MONTH_DATA)
    CheckInMonthDataResp getMonthData(GetCheckInDataParam param);

    /**
     * 获取打卡人员排班信息
     * 企业可通过打卡应用Secret调用本接口，获取打卡规则为“按班次上下班”规则的指定员工指定时间段内的排班信息。
     * 第三方应用获取应用可见范围内、打卡规则为“按班次上下班”规则的指定员工指定时间段内的排班信息。
     * <p>
     * 请求方式:POST(HTTPS)
     * <p>
     * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/checkin/getcheckinschedulist?access_token=ACCESS_TOKEN
     * <p>
     * 请求示例
     * <p>
     * {
     * "starttime": 1492617600,
     * "endtime": 1492790400,
     * "useridlist": [
     * "james",
     * "paul"
     * ]
     * }
     * 参数说明:
     *
     * @param param 参数	必须	类型	说明
     *              access_token	是	string	调用接口凭证，必须使用打卡应用的Secret获取access_token，获取方式参考：文档-获取access_token
     *              useridlist	否	string[]	需要获取排班信息的用户列表（不超过100个）
     *              starttime	否	uint32	获取排班信息的开始时间。Unix时间戳
     *              endtime	否	uint32	获取排班信息的结束时间。Unix时间戳（与starttime跨度不超过一个月）
     * @return
     */
    @RequestLine(OaApiUris.API_GET_CHECKIN_SCHEDU_LIST)
    CheckInUserScheduleListResp getUserScheduleList(GetCheckInDataParam param);

    /**
     * 为打卡人员排班
     * 企业可通过打卡应用Secret调用本接口，为打卡规则为“按班次上下班”规则的指定员工排班。
     * 第三方应用可通过本接口为应用可见范围内、打卡规则为“按班次上下班”规则的指定员工排班。
     * <p>
     * 请求方式:POST(HTTPS)
     * <p>
     * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/checkin/setcheckinschedulist?access_token=ACCESS_TOKEN
     * <p>
     * 请求示例
     * <p>
     * {
     * "groupid": 226,
     * "items": [
     * {
     * "userid": "james",
     * "day": 5,
     * "schedule_id": 234
     * }
     * ],
     * "yearmonth": 202012
     * }
     * 参数说明:
     *
     * @param param 参数	必须	说明
     *              access_token	是	调用接口凭证。必须使用打卡应用的Secret获取access_token，获取方式参考：文档-获取access_token
     *              items	是	排班表信息
     *              groupid	是	打卡规则的规则id，可通过“获取打卡规则”、“获取打卡数据”、“获取打卡人员排班信息”等相关接口获取
     *              userid	是	打卡人员userid
     *              day	是	要设置的天日期，取值在1-31之间。联合yearmonth组成唯一日期 比如20201205
     *              schedule_id	是	对应groupid规则下的班次id，通过预先拉取规则信息获取，0代表休息
     *              yearmonth	是	排班表月份，格式为年月，如202011
     * @return
     */
    @RequestLine(OaApiUris.API_SET_CHECKIN_SCHEDU_LIST)
    RespStatus setUserScheduleList(SetCheckInScheduleListParam param);

    /**
     * 录入打卡人员人脸信息
     * 企业可通过打卡应用Secret调用本接口，为企业打卡人员录入人脸信息，人脸信息仅用于人脸打卡。
     * <p>
     * 请求方式:POST(HTTPS)
     * <p>
     * 请求地址:https://qyapi.weixin.qq.com/cgi-bin/checkin/addcheckinuserface?access_token=ACCESS_TOKEN
     * <p>
     * 请求示例
     * <p>
     * {
     * "userid": "james",
     * "userface": "PLACE_HOLDER"
     * }
     * 参数说明:
     *
     * @param param 参数	必须	类型	说明
     *              access_token	是	string	调用接口凭证，必须使用打卡应用的Secret获取access_token，获取方式参考：文档-获取access_token
     *              userid	否	string	需要录入的用户id
     *              userface	否	string	需要录入的人脸图片数据，需要将图片数据base64处理后填入，对已录入的人脸会进行更新处理
     *              注意：对于已有人脸的用户，使用此接口将使用传入的人脸覆盖原有人脸，请谨慎操作。
     * @return
     */
    @RequestLine(OaApiUris.API_ADD_CHECKIN_USER_FACE)
    RespStatus addUserFace(AddCheckInUserFaceParam param);


}
