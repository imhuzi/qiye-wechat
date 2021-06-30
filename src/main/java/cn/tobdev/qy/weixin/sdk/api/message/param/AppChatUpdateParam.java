package cn.tobdev.qy.weixin.sdk.api.message.param;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/1
 */
@Getter
@Setter
@ToString
public class AppChatUpdateParam extends  AppChatCreateParam{

  /**
   * add_user_list
   */
  @JsonProperty("add_user_list")
  private List<String> addUserList;

  @JsonProperty("del_user_list")
  private List<String> delUserList;


}
