package me.gdzhu.exception;

/**
 * Created by ZhuGuodong on 2018/5/19 16:00
 * Description: 预约业务异常
 */
public class AppointException extends RuntimeException {
    public AppointException(String message) {
        super(message);
    }

    public AppointException(String message, Throwable cause) {
        super(message, cause);
    }
}
