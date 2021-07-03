package chat.qiye.wechat.sdk.api.school.param;

import java.util.Set;

import lombok.Data;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/3
 */
@Data
public class ParentBatchUpdateParam {
  private Set<ParentUpdateParam> parents;
}
