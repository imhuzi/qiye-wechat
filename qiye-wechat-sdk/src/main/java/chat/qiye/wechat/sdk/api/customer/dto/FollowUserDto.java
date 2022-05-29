package chat.qiye.wechat.sdk.api.customer.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import chat.qiye.wechat.sdk.common.dto.WechatChannelsDto;
import lombok.Data;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2022/5/29
 */
@Data
public class FollowUserDto {

  private String userid;

  private String remark;

  private String description;
  @JsonProperty("createtime")
  private Long addTime;
  private List<TagItemDto> tags;
  @JsonProperty("remark_corp_name")
  private String remarkCorpName;

  @JsonProperty("remark_mobiles")
  private List<String> remarkMobiles;

  /**
   * 发起添加的userid，如果成员主动添加，为成员的userid；如果是客户主动添加，则为客户的外部联系人userid；如果是内部成员共享/管理员分配，则为对应的成员/管理员userid
   */
  @JsonProperty("oper_userid")
  private String operUserId;

  @JsonProperty("add_way")
  private Integer addWay;

  @JsonProperty("wechat_channels")
  private WechatChannelsDto wechatChannels;

  private String state;

}
