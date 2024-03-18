package org.springframework.test;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.test.bean.UserService;

/**
 * @author cjd
 * @description
 * @create 2024-03-18
 */
public class ApiTest {

    @Test
    public void test_beanFactory() {

        // init beanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // insert beanDef
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // get beanDef
        UserService bean = (UserService) beanFactory.getBean("userService");
        bean.queryUserInfo();

        UserService bean2 = (UserService) beanFactory.getBean("userService");
        bean2.queryUserInfo();

    }

}
