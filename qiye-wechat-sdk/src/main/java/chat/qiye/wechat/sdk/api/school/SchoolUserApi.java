package chat.qiye.wechat.sdk.api.school;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import chat.qiye.wechat.sdk.api.school.dto.ParentDto;
import chat.qiye.wechat.sdk.api.school.dto.StudentDto;
import chat.qiye.wechat.sdk.api.school.param.BatchDeleteParam;
import chat.qiye.wechat.sdk.api.school.param.ParentBatchCreateParam;
import chat.qiye.wechat.sdk.api.school.param.ParentBatchUpdateParam;
import chat.qiye.wechat.sdk.api.school.param.ParentUpdateParam;
import chat.qiye.wechat.sdk.api.school.param.StudentBatchCreateParam;
import chat.qiye.wechat.sdk.api.school.param.StudentBatchUpdateParam;
import chat.qiye.wechat.sdk.api.school.param.StudentUpdateParam;
import chat.qiye.wechat.sdk.api.school.resp.ParentListResp;
import chat.qiye.wechat.sdk.api.school.resp.StudentBatchOperationResp;
import chat.qiye.wechat.sdk.api.school.resp.StudentListResp;
import chat.qiye.wechat.sdk.api.school.resp.StudentOrParentGetResp;
import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

/**
 * 家校通讯录 用户 相关接口
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/3
 */
@Headers(value = {"Accept: application/json", "Content-Type: application/json"})
@QiYeWeChatApi(appType = AppIdEnum.APP_SCHOOL_CONTACT)
public interface SchoolUserApi {
  /**
   * 创建学生
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/user/create_student?access_token=ACCESS_TOKEN
   *
   * 请求包体：
   *
   * {
   *     "student_userid": "zhangsan",
   *     "name": "张三",
   *     "department": [1, 2]
   * }
   *
   * @param param
   * @return
   */
  @RequestLine(SchoolApiUris.API_STUDENT_CREATE)
  RespStatus createStudent(StudentDto param);

  /**
   * 更新学生
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/user/update_student?access_token=ACCESS_TOKEN
   *
   * 请求包体：
   *
   * {
   *     "student_userid": "zhangsan",
   *     "new_student_userid":"NEW_ID",
   *     "name": "张三",
   *     "department": [1, 2]
   * }
   * @param param
   * @return
   */
  @RequestLine(SchoolApiUris.API_STUDENT_UPDATE)
  RespStatus updateStudent(StudentUpdateParam param);

  /**
   * 删除学生
   * 请求方式：GET（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/user/delete_student?access_token=ACCESS_TOKEN&userid=USERID
   *
   * 参数说明：
   *
   * 参数	必须	说明
   * access_token	是	调用接口凭证
   * userid	是	家校通信录中学生的userid
   * 注意，如果学生还有家长，则不允许删除学生，必须先把家长删除
   *
   * @param userid
   * @return
   */
  @RequestLine(SchoolApiUris.API_STUDENT_DELETE)
  RespStatus deleteStudent(@Param("userid") String userid);

  /**
   * 批量创建学生
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/user/batch_create_student?access_token=ACCESS_TOKEN
   *
   * 请求包体：
   *
   * {
   *     "students":[
   *         {
   *             "student_userid": "zhangsan",
   *             "name": "张三",
   *             "department": [1, 2]
   *         },
   *         {
   *             "student_userid": "lisi",
   *             "name": "李四",
   *             "department": [3, 4]
   *         }
   *      ]
   * }
   *
   * @param param
   * @return
   */
  @RequestLine(SchoolApiUris.API_STUDENT_BATCH_CREATE)
  StudentBatchOperationResp batchCreateStudent(StudentBatchCreateParam param);

  /**
   * 批量更新学生
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/user/batch_update_student?access_token=ACCESS_TOKEN
   *
   * 请求包体：
   *
   * {
   *     "students":[
   *         {
   *             "student_userid": "zhangsan",
   *             "new_student_userid":"zhangsan_new",
   *             "name": "张三",
   *             "department": [1, 2],
   *         },
   *         {
   *             "student_userid": "lisi",
   *             "name": "李四",
   *             "department": [3, 4]
   *         }
   *      ]
   * }
   *
   * @param param
   * @return
   */
  @RequestLine(SchoolApiUris.API_STUDENT_BATCH_UPDATE)
  StudentBatchOperationResp batchUpdateStudent(StudentBatchUpdateParam param);

  /**
   * 批量删除学生
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/user/batch_delete_student?access_token=ACCESS_TOKEN
   *
   * 请求包体：
   *
   * {
   *     "useridlist": ["zhangsan", "lisi"]
   * }
   * @param param
   * @return
   */
  @RequestLine(SchoolApiUris.API_STUDENT_BATCH_DELETE)
  StudentBatchOperationResp batchDeleteStudent(BatchDeleteParam param);

  /**
   * 创建家长
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/user/create_parent?access_token=ACCESS_TOKEN
   *
   * 请求包体：
   *
   * {
   *     "parent_userid": "zhangsan_parent_userid",
   *     "mobile": "10000000000",
   *     "to_invite": false,
   *     "children":[
   *         {
   *             "student_userid": "zhangsan",
   *             "relation": "爸爸"
   *         },
   *         {
   *             "student_userid": "lisi",
   *             "relation": "伯父"
   *         }
   *      ]
   * }
   *
   * @param param
   * @return
   */
  @RequestLine(SchoolApiUris.API_PARENT_CREATE)
  RespStatus createParent(ParentDto param);

  /**
   * 更新家长
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/user/update_parent?access_token=ACCESS_TOKEN
   *
   * 请求包体：
   *
   * {
   *     "parent_userid": "zhangsan_parent_userid",
   *     "new_parent_userid":"NEW_ID",
   *     "mobile": "18000000000",
   *     "children":[
   *         {
   *             "student_userid": "zhangsan",
   *             "relation": "爸爸"
   *         },
   *         {
   *             "student_userid": "lisi",
   *             "relation": "伯父"
   *         }
   *      ]
   * }
   *
   * @param param
   * @return
   */
  @RequestLine(SchoolApiUris.API_PARENT_UPDATE)
  RespStatus updateParent(ParentUpdateParam param);

  /**
   * 删除家长
   * 请求方式：GET（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/user/delete_parent?access_token=ACCESS_TOKEN&userid=USERID
   *
   * 参数说明：
   *
   * 参数	必须	说明
   * access_token	是	调用接口凭证
   * userid	是	家校通信录中家长的userid
   *
   * @param userid
   * @return
   */
  @RequestLine(SchoolApiUris.API_PARENT_DELETE)
  RespStatus deleteParent(@Param("userid") String userid);

  /**
   * 批量创建家长
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/user/batch_create_parent?access_token=ACCESS_TOKEN
   *
   * 请求包体：
   *
   * {
   *     "parents":[
   *         {
   *             "parent_userid": "zhangsan_parent_userid",
   *             "mobile": "18000000000",
   *             "to_invite": false,
   *             "children":[
   *                 {
   *                     "student_userid": "zhangsan",
   *                     "relation": "爸爸"
   *                 },
   *                 {
   *                     "student_userid": "lisi",
   *                     "relation": "伯父"
   *                 }
   *             ]
   *         },
   *         {
   *             "parent_userid": "lisi_parent_userid",
   *             "mobile": "18000000001",
   *             "children":[
   *                 {
   *                     "student_userid": "lisi",
   *                     "relation": "爸爸"
   *                 },
   *                 {
   *                     "student_userid": "zhangsan",
   *                     "relation": "伯父"
   *                 }
   *             ]
   *         }
   *     ]
   * }
   *
   * @param param
   * @return
   */
  @RequestLine(SchoolApiUris.API_PARENT_BATCH_CREATE)
  StudentBatchOperationResp batchCreateParent(ParentBatchCreateParam param);

  /**
   * 批量更新家长
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/user/batch_update_parent?access_token=ACCESS_TOKEN
   *
   * 请求包体：
   *
   * {
   *     "parents":[
   *         {
   *             "parent_userid": "zhangsan_baba",
   *             "new_parent_userid":"zhangsan_baba_new",
   *             "mobile": "10000000000",
   *             "children":[
   *                 {
   *                     "student_userid": "zhangsan",
   *                     "relation": "爸爸"
   *                 }
   *             ]
   *         },
   *         {
   *             "parent_userid": "lisi_mama",
   *             "mobile": "10000000001",
   *             "children":[
   *                 {
   *                     "student_userid": "lisi",
   *                     "relation": "妈妈"
   *                 }
   *             ]
   *         }
   *     ]
   * }
   *
   * @param param
   * @return
   */
  @RequestLine(SchoolApiUris.API_PARENT_BATCH_UPDATE)
  StudentBatchOperationResp batchUpdateParent(ParentBatchUpdateParam param);

  /**
   * 批量删除家长
   * 请求方式：POST（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/user/batch_delete_parent?access_token=ACCESS_TOKEN
   *
   * 请求包体：
   *
   * {
   *     "useridlist": ["zhangsan", "lisi"]
   * }
   *
   * @param param
   * @return
   */
  @RequestLine(SchoolApiUris.API_PARENT_BATCH_DELETE)
  StudentBatchOperationResp batchDeleteParent(BatchDeleteParam param);

  /**
   * 读取学生或家长
   * 请求方式：GET（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/user/get?access_token=ACCESS_TOKEN&userid=USERID
   *
   * 参数说明：
   *
   * 参数	必须	说明
   * access_token	是	调用接口凭证
   * userid	是	家校通讯录的userid，家长或者学生的userid。不区分大小写，长度为1~64个字节
   *
   * @param userid
   * @return
   */
  @RequestLine(SchoolApiUris.API_USER_GET)
  StudentOrParentGetResp get(@Param("userid") String userid);

  /**
   * 获取部门成员详情
   * 请求方式：GET（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/user/list?access_token=ACCESS_TOKEN&department_id=DEPARTMENT_ID&fetch_child=FETCH_CHILD
   *
   * 参数说明：
   *
   * 参数	必须	说明
   * access_token	是	调用接口凭证
   * department_id	是	获取的部门id
   * fetch_child	否	1/0：是否递归获取子部门下面的成员
   *
   * @param departmentId
   * @param fetchChild
   * @return
   */
  @RequestLine(SchoolApiUris.API_STUDENT_LIST)
  StudentListResp listStudent(@Param("department_id") Integer departmentId, @Param("fetch_child") Integer fetchChild);

  /**
   * 获取部门家长详情
   * 请求方式：GET（HTTPS）
   * 请求地址：https://qyapi.weixin.qq.com/cgi-bin/school/user/list_parent?access_token=ACCESS_TOKEN&department_id=DEPARTMENT_ID
   *
   * 参数说明：
   *
   * 参数	必须	说明
   * access_token	是	调用接口凭证
   * department_id	是	获取的部门id
   * 学校需要使用“家校沟通”secret或配置到“可调用应用”列表中的自建应用secret所获取的accesstoken来调用（accesstoken如何获取？）。
   * 第三方应用需拥有「家校沟通」使用权限。
   * @param departmentId
   * @return
   */
  @RequestLine(SchoolApiUris.API_DEPT_LIST_PARENT)
  ParentListResp listParent(@Param("department_id") Integer departmentId);


}
