package chat.qiye.wechat.sdk.api.contact.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2022/3/7
 */
@Data
public class ListSelectedTicketUserParam implements Serializable {
  /**
   * 	选人jsapi返回的selectedTicket
   */
  @JsonProperty("selected_ticket")
  private String selectedTicket;
  
}
