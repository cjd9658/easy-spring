package org.springframework.util;

/**
 * @author cjd
 * @description
 * @create 2024-03-19
 */
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;

        try {
            cl = Thread.currentThread().getContextClassLoader();
        }catch (Throwable ex) {

        }

        if (cl == null) {
            cl = ClassUtils.class.getClassLoader();
        }
        return cl;
    }

}
