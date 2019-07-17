package com.yjn.test;

import com.yjn.pojo.User;
import com.yjn.pojo.UserBean;
import com.yjn.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {

    @org.junit.Test
    public void test1(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = ac.getBean(IUserService.class);
        UserBean userBean = userService.selectUserById(4);
        System.out.println(userBean.getName());
    }
}
