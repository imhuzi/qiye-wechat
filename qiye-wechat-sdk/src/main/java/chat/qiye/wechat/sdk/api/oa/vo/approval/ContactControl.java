package chat.qiye.wechat.sdk.api.oa.vo.approval;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/9
 */
@Data
public class ContactControl {

    public static final String TYPE_SINGLE = "single";
    public static final String TYPE_MULTI = "multi";

    public static final String MODE_USER = "user";
    public static final String MODE_DEPARTMENT = "department";

    /**
     * 选择方式：single-单选；multi-多选
     */
    @JsonProperty("type")
    private String type;

    /**
     * 选择对象：user-成员；department-部门
     */
    private String mode;
}
