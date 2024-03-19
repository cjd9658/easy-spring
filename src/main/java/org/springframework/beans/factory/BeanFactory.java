package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * @author cjd
 * @description
 * @create 2024-03-18
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
