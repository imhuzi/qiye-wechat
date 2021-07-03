package chat.qiye.wechat.sdk.api.contact.param;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class ContactUserParam implements Serializable  {

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
  private Integer order;

  /**
   * 职位
   */
  private String position;

  /**
   * 邮箱
   */
  private String email;

  /**
   * 性别。0表示未定义，1表示男性，2表示女性
   */
  private Integer gender;

  /**
   * 是否邀请该成员使用企业微信（将通过微信服务通知或短信或邮件下发邀请，每天自动下发一次，最多持续3个工作日），默认值为true。
   */
  @JsonProperty("to_invite")
  private Boolean toInvite = true;
  /**
   * 成员头像的mediaid，通过素材管理接口上传图片获得的mediaid
   */
  @JsonProperty("avatar_mediaid")
  private String avatarMediaid;

  /**
   * 个数必须和参数department的个数一致，表示在所在的部门内是否为上级。1表示为上级，0表示非上级。在审批等应用里可以用来标识上级审批人
   */

  @JsonProperty("is_leader_in_dept")
  private Integer[] leaderInDept;
  /**
   * 联系电话
   */
  private String telephone;

  /**
   * 别名
   */
  private String alias;

  /**
   * 启用/禁用成员。1表示启用成员，0表示禁用成员
   */
  private Integer enable;

  /**
   * 别名
   */
  private UserExtattrVo extattr;


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
