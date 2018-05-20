package me.gdzhu.exception;

/**
 * Created by ZhuGuodong on 2018/5/19 16:00
 * Description:重复预约异常
 */
public class RepeatAppointException extends RuntimeException {
    public RepeatAppointException(String message) {
        super(message);
    }

    public RepeatAppointException(String message, Throwable cause) {
        super(message, cause);
    }
}
