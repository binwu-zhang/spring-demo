package com.atbinwu.spring5.test;

import com.atbinwu.spring5.aopanno.User;
import com.atbinwu.spring5.aopxml.Book;
import com.atbinwu.spring5.config.ConfigAop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test //注解+xml
    public void testAopAnno(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test //xml
    public void testAopAnno2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        Book book = context.getBean("book", Book.class);
        book.buy();
    }

    @Test //完全注解
    public void testAopAnno3(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);

        User user = context.getBean("user", User.class);
        user.add();
    }
}
