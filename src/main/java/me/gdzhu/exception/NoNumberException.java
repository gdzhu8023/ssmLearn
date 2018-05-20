package me.gdzhu.exception;

/**
 * Created by ZhuGuodong on 2018/5/19 15:59
 * Description:库存不足异常
 */
public class NoNumberException extends RuntimeException {
    public NoNumberException(String message) {
        super(message);
    }

    public NoNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
