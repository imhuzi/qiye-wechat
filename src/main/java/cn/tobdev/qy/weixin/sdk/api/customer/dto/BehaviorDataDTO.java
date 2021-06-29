package cn.tobdev.qy.weixin.sdk.api.customer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/29
 */
@NoArgsConstructor
@Data
public class BehaviorDataDTO {
  /**
   * statTime
   */
  @JsonProperty("stat_time")
  private Integer statTime;

  /**
   * chatCnt
   */
  @JsonProperty("chat_cnt")
  private Integer chatCnt;

  /**
   * messageCnt
   */
  @JsonProperty("message_cnt")
  private Integer messageCnt;

  /**
   * replyPercentage
   */
  @JsonProperty("reply_percentage")
  private Double replyPercentage;

  /**
   * avgReplyTime
   */
  @JsonProperty("avg_reply_time")
  private Integer avgReplyTime;

  /**
   * negativeFeedbackCnt
   */
  @JsonProperty("negative_feedback_cnt")
  private Integer negativeFeedbackCnt;

  /**
   * newApplyCnt
   */
  @JsonProperty("new_apply_cnt")
  private Integer newApplyCnt;

  /**
   * newContactCnt
   */
  @JsonProperty("new_contact_cnt")
  private Integer newContactCnt;
}
