package com.atbinwu.spring5.testdemo;

import com.atbinwu.spring5.bean.Emp;
import com.atbinwu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService =  context.getBean("userService", UserService.class);

        userService.add();
    }

    @Test
    public void testBen2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        Emp emp =  context.getBean("emp", Emp.class);
        System.out.println(emp.toString());

    }
}
