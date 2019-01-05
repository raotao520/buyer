package com.ssss.exception;

import com.ssss.enums.ResultEnum;

/**
 * @author ：sss
 * @Date ：Created in 22:03 2018/12/6
 */
public class BuyerException extends RuntimeException{

    private Integer code;

    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public BuyerException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    /**
     * Constructs a new runtime exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public BuyerException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
