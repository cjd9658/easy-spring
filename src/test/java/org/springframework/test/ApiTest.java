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

        // insert bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // get bean
        UserService userService = (UserService) beanFactory.getBean("userService","mdzy");
        userService.queryUserInfo();

    }

}
