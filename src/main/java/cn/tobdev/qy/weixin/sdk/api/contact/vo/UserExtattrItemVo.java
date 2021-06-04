package cn.tobdev.qy.weixin.sdk.api.contact.vo;

import lombok.Data;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/5/29
 */
@Data
public class UserExtattrItemVo {

    private String type;
    private String name;
    private UserExtattrItemValueVo text;
    private UserExtattrItemValueVo web;
    private UserExtattrItemValueVo miniprogram;
}
