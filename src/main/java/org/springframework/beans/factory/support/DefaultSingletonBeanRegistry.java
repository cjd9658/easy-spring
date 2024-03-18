package org.springframework.beans.factory.support;

import org.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cjd
 * @description
 * @create 2024-03-18
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    // 单例bean容器
    private final Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String name) {
        return singletonObjects.get(name);
    }

    protected void addSingleton(String beanName,Object singletonObj) {
        singletonObjects.put(beanName, singletonObj);
    }

}
