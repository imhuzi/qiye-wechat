package chat.qiye.wechat.sdk.exception;


import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class QyApiErrorException extends Exception {
    private static final long serialVersionUID = -238091758285157331L;
    private String errcode;
    private String errmsg;

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param errmsg the detail message. The detail message is saved for
     *               later retrieval by the {@link #getMessage()} method.
     */
    public QyApiErrorException(String errmsg) {
        super(errmsg);
        this.errmsg = errmsg;
    }

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public QyApiErrorException(String errcode, String errmsg) {
        super(errmsg);
        this.errcode = errcode;
        this.errmsg = errmsg;
    }
}
