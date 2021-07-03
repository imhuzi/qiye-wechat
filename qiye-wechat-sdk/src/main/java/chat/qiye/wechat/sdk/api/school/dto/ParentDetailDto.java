package chat.qiye.wechat.sdk.api.school.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/3
 */
@NoArgsConstructor
@Data
public class ParentDetailDto {

  /**
   * parentUserid
   */
  @JsonProperty("parent_userid")
  private String parentUserid;

  /**
   * relation
   */
  @JsonProperty("relation")
  private String relation;

  /**
   * mobile
   */
  @JsonProperty("mobile")
  private String mobile;

  /**
   * isSubscribe
   */
  @JsonProperty("is_subscribe")
  private Integer isSubscribe;

  /**
   * externalUserid
   */
  @JsonProperty("external_userid")
  private String externalUserid;

  private List<ChildrenDto> children;
}
