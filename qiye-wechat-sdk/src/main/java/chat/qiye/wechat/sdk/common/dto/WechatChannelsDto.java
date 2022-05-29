package chat.qiye.wechat.sdk.common.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * 微信视频号相关信息: 该成员添加此客户的来源add_way为10时，对应的视频号信息
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2022/5/29
 */
@Data
public class WechatChannelsDto implements Serializable {
  /**
   * 视频号名称
   */
  private String nickname;

  /**
   * 视频号添加场景，0-未知 1-视频号主页 2-视频号直播间（微信版本要求：iOS ≥ 8.0.20，Android ≥ 8.0.21，且添加时间不早于2022年4月21日。否则添加场景值为0）
   */
  private Integer source;
}