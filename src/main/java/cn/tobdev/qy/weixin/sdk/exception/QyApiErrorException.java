package cn.tobdev.qy.weixin.sdk.exception;


import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class QyApiErrorException extends Exception {
    private static final long serialVersionUID = -238091758285157331L;
    private String errcode;
    private String errmsg;
}
