package org.springframework.beans;

/**
 * @author cjd
 * @description
 * @create 2024-03-18
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
