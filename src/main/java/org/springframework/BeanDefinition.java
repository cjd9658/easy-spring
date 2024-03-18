package org.springframework;

/**
 * @author cjd
 * @description
 * @create 2024-03-18
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
