package chat.qiye.wechat.sdk.api.contact.vo;

import lombok.Data;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/5/29
 */
@Data
public class UserExtattrItemValueVo {
  /**
   * 文本
   */
  private String value;

  /**
   * 网页
   */
  private String url;

  private String title;

  /**
   * 小程序
   */
  private String appid;

  private String pagepath;
}
