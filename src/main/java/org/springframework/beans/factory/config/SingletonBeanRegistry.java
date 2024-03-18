package org.springframework.beans.factory.config;

/**
 * @author cjd
 * @description
 * @create 2024-03-18
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String name);

}
