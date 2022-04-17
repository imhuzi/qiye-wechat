package chat.qiye.wechat.sdk.api.school;

/**
 * 家校沟通相关接口 api uri 常量
 * <p>
 * https://work.weixin.qq.com/api/doc/90000/90135/91638
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/6/16
 */
public interface SchoolApiUris {
    /**
     * 获取「学校通知」二维码
     * 学校可通过此接口获取「学校通知」二维码，家长可通过扫描此二维码关注「学校通知」并接收学校推送的消息。
     */
    String API_GET_SUBSCRIBE_QR_CODE = "GET /externalcontact/get_subscribe_qr_code";

    String API_SET_SUBSCRIBE_MODEL= "GET /externalcontact/set_subscribe_mode";

    String API_GET_SUBSCRIBE_MODEL= "GET /externalcontact/get_subscribe_mode";

    String API_EXTERNALCONTACT_GET = "GET /externalcontact/get?external_userid={external_userid}";

    String API_EXTERNALCONTACT_LIST = "GET /externalcontact/list?userid={userid}";
    // https://open.work.weixin.qq.com/api/doc/90000/90135/92345
    String API_SET_ARCH_SYNC_MODE= "POST /school/set_arch_sync_mode";

    String API_STUDENT_CREATE= "POST /school/user/create_student";
    String API_STUDENT_DELETE= "GET /school/user/delete_student?userid={userid}";
    String API_STUDENT_UPDATE= "POST /school/user/update_student";
    String API_STUDENT_BATCH_CREATE= "POST /school/user/batch_create_student";
    String API_STUDENT_BATCH_DELETE= "POST /school/user/batch_delete_student";
    String API_STUDENT_BATCH_UPDATE= "POST /school/user/batch_update_student";
    String API_PARENT_CREATE= "POST /school/user/create_parent";
    String API_PARENT_DELETE= "GET /school/user/delete_parent?userid={userid}";
    String API_PARENT_UPDATE= "POST /school/user/update_parent";
    String API_PARENT_BATCH_CREATE= "POST /school/user/batch_create_parent";
    String API_PARENT_BATCH_DELETE= "POST /school/user/batch_delete_parent";
    String API_PARENT_BATCH_UPDATE= "POST /school/user/batch_update_parent";
    String API_USER_GET= "GET /school/user/get?userid={userid}";
    String API_STUDENT_LIST= "GET /school/user/list?department_id={department_id}&fetch_child={fetch_child}";

    String API_DEPT_CREATE= "GET /school/department/create";
    String API_DEPT_UPDATE= "GET /school/department/update";
    String API_DEPT_DELETE= "GET /school/department/delete?id={id}";
    String API_DEPT_LIST= "GET /school/department/list?id={id}";
    String API_DEPT_LIST_PARENT= "GET /school/user/list_parent?department_id={department_id}";
    String API_DEPT_SET_UPGRADE_INFO= "GET /school/set_upgrade_info";
}
