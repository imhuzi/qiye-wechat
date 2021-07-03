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
public class SchoolDeptDto {

  /**
   * name
   */
  @JsonProperty("name")
  private String name;

  /**
   * parentid
   */
  @JsonProperty("parentid")
  private Integer parentid;

  /**
   * id
   */
  @JsonProperty("id")
  private Integer id;

  /**
   * type
   */
  @JsonProperty("type")
  private Integer type;

  /**
   * registerYear
   */
  @JsonProperty("register_year")
  private Integer registerYear;

  /**
   * standardGrade
   */
  @JsonProperty("standard_grade")
  private Integer standardGrade;

  /**
   * order
   */
  @JsonProperty("order")
  private Integer order;

  /**
   * departmentAdmins
   */
  @JsonProperty("department_admins")
  private List<SchoolDeptAdminsDto> departmentAdmins;
}
