package chat.qiye.wechat.sdk.api.contact.resp;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import chat.qiye.wechat.sdk.common.RespStatus;
import chat.qiye.wechat.sdk.api.contact.vo.UserExtattrVo;
import chat.qiye.wechat.sdk.api.contact.vo.UserExternalProfile;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/5/29
 */
@Getter
@Setter
@ToString
public class ContactUserGetResp extends RespStatus implements Serializable  {

  /**
   * 成员UserID。对应管理端的帐号，企业内必须唯一。不区分大小写，长度为1~64个字节
   */
  private String userid;

  /**
   * 名称
   */
  private String name;

  /**
   * 手机号
   */
  private String mobile;

  /**
   * 成员所属部门id列表，仅返回该应用有查看权限的部门id
   */
  private Integer[] department;

  /**
   * 部门内的排序值，默认为0。数量必须和department一致，数值越大排序越前面。值范围是[0, 2^32)
   */
  private Integer[] order;

  /**
   * 职位
   */
  private String position;

  /**
   * 邮箱
   */
  private String email;

  @JsonProperty("biz_mail")
  private String bizMail;

  /**
   * 性别。0表示未定义，1表示男性，2表示女性
   */
  private Integer gender;

  /**
   * 头像
   */
  private String avatar;

  /**
   * 头像缩略
   */
  @JsonProperty("thumb_avatar")
  private String thumbAvatar;

  /**
   * 企业微信返回的 open_userId
   */
  @JsonProperty("open_userid")
  private String openUserid;

  /**
   * 表示在所在的部门内是否为上级。；第三方仅通讯录应用可获取；对于非第三方创建的成员，第三方通讯录应用也不可获取
   */
  @JsonProperty("is_leader_in_dept")
  private Integer[] leaderInDept;

  @JsonProperty("direct_leader")
  private String[] directLeader;

  /**
   * 联系电话
   */
  private String telephone;

  /**
   * 别名
   */
  private String alias;

  /**
   * 激活状态: 1=已激活，2=已禁用，4=未激活，5=退出企业
   */
  private Integer status;

  /**
   * 别名
   */
  private UserExtattrVo extattr;

  /**
   * 员工个人二维码，扫描可添加为外部联系人(注意返回的是一个url，可在浏览器上打开该url以展示二维码)；第三方仅通讯录应用可获取；对于非第三方创建的成员，第三方通讯录应用也不可获取
   */
  @JsonProperty("qr_code")
  private String qrCode;

  /**
   * 成员对外属性，字段详情见对外属性；
   */
  @JsonProperty("external_profile")
  private UserExternalProfile externalProfile;

  /**
   * 对外职务，如果设置了该值，则以此作为对外展示的职务，否则以position来展示。
   */
  @JsonProperty("external_position")
  private String externalPosition;

  /**
   * 主部门
   */
  @JsonProperty("main_department")
  private Integer mainDepartment;

  /**
   * 地址
   */
  private String address;
}
