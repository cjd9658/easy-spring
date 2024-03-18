package org.springframework.test;

import org.junit.Test;
import org.springframework.BeanDefinition;
import org.springframework.BeanFactory;
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
        BeanFactory beanFactory = new BeanFactory();

        // set beanDefinition
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // get bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

    }

}
