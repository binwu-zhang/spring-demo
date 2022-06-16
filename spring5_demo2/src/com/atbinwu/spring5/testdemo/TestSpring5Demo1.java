package com.atbinwu.spring5.testdemo;

import com.atbinwu.spring5.autowire.Emp;
import com.atbinwu.spring5.bean.Orders;
import com.atbinwu.spring5.collectiontype.Book;
import com.atbinwu.spring5.collectiontype.Course;
import com.atbinwu.spring5.collectiontype.Stu;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

public class TestSpring5Demo1 {
    @Test
    public void testCollection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu",Stu.class);

        System.out.println(stu.toString());
    }
    @Test
    public void testCollection2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);

        System.out.println(book.toString());
    }

    @Test
    public void testCollection3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course book = context.getBean("myBean", Course.class);

        System.out.println(book.toString());
    }

    @Test
    public void testCollection4(){
        //ApplicationContext 没有close
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);

        System.out.println("第四步");

        System.out.println(orders.toString());
        //销毁bean实例
        context.close();
    }

    @Test
    public void testCollection5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp.toString());
    }
}
