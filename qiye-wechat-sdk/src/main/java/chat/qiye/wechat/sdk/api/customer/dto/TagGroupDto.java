package chat.qiye.wechat.sdk.api.customer.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/30
 */
@NoArgsConstructor
@Data
public class TagGroupDto {
  /**
   * groupId
   */
  @JsonProperty("group_id")
  private String groupId;

  /**
   * groupName
   */
  @JsonProperty("group_name")
  private String groupName;

  /**
   * createTime
   */
  @JsonProperty("create_time")
  private Integer createTime;

  /**
   * order
   */
  @JsonProperty("order")
  private Integer order;

  /**
   * deleted
   */
  @JsonProperty("deleted")
  private Boolean deleted;

  /**
   * tag
   */
  @JsonProperty("tag")
  private List<TagDto> tag;
}
