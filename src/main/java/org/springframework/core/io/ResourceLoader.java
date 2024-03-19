package org.springframework.core.io;

/**
 * @author cjd
 * @description
 * @create 2024-03-19
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
