package chat.qiye.wechat.sdk.api.school.resp;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import chat.qiye.wechat.sdk.common.RespStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/3
 */
@Getter
@Setter
@ToString
public class GradeUpResp extends RespStatus implements Serializable {
  /**
   * 下次升级的时间，只有年月日有效，如果该学校今年已经升过年级，那本参数会给明年对应日期的时间戳
   */
  @JsonProperty("next_upgrade_time")
  private Integer nextUpgradeTime;
}
