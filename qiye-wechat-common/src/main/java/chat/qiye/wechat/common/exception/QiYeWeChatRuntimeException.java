package chat.qiye.wechat.common.exception;

public class QiYeWeChatRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 4181698471192264412L;

    public QiYeWeChatRuntimeException(Throwable e) {
        super(e);
    }

    public QiYeWeChatRuntimeException(String msg) {
        super(msg);
    }

    public QiYeWeChatRuntimeException(String msg, Throwable e) {
        super(msg, e);
    }
}
