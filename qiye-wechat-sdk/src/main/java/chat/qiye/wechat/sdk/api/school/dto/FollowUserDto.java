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
public class FollowUserDto {
  /**
   * userid
   */
  @JsonProperty("userid")
  private String userid;

  /**
   * remark
   */
  @JsonProperty("remark")
  private String remark;

  /**
   * description
   */
  @JsonProperty("description")
  private String description;

  /**
   * createtime
   */
  @JsonProperty("createtime")
  private Integer createtime;

  /**
   * tags
   */
  @JsonProperty("tags")
  private List<TagsDto> tags;

  /**
   * remarkCompany
   */
  @JsonProperty("remark_company")
  private String remarkCompany;

  /**
   * remarkMobiles
   */
  @JsonProperty("remark_mobiles")
  private List<String> remarkMobiles;

  /**
   * state
   */
  @JsonProperty("state")
  private String state;
}
