package org.springframework.beans.factory;

/**
 * @author cjd
 * @description
 * @create 2024-03-18
 */
public interface BeanFactory {

    Object getBean(String name) throws Exception;

}
