package com.atbinwu.spring5.testdemo;

import com.atbinwu.spring5.Book;
import com.atbinwu.spring5.Orders;
import com.atbinwu.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testAdd(){
        // 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置创建的对象 //user是xml中的id
        User user = context.getBean("user", User.class);

        System.out.println(user);

        user.add();
    }

    @Test
    public void testBook(){
        // 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置创建的对象 //user是xml中的id
        Book book = context.getBean("book", Book.class);

        System.out.println(book);

        System.out.println(book.toString());
    }

    @Test
    public void testOrders(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        Orders orders = classPathXmlApplicationContext.getBean("orders", Orders.class);
        System.out.println(orders);
        System.out.println(orders.toString());
    }
}
