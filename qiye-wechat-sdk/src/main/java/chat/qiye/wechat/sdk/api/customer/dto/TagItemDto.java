package chat.qiye.wechat.sdk.api.customer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2022/5/29
 */
@Data
public class TagItemDto {

  @JsonProperty("group_name")
  private String groupName;

  @JsonProperty("tag_name")
  private String tagName;

  @JsonProperty("tag_id")
  private String tagId;

  private Integer type;


}
