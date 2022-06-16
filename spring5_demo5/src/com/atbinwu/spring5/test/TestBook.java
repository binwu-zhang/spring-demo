package com.atbinwu.spring5.test;

import com.atbinwu.spring5.config.TxConfig;
import com.atbinwu.spring5.entity.Book;
import com.atbinwu.spring5.service.BookService;
import com.atbinwu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = context.getBean("bookService", BookService.class);



        /*Book book = new Book();
        book.setUserId(2);
        book.setUsername("golang");
        book.setUserstatus("a");
        bookService.addBook(book);*/

        //System.out.println(bookService.findCount());

        //System.out.println(bookService.findOne(2));

        //System.out.println(bookService.findAll());

        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3", "php", "a"};
        batchArgs.add(o1);
        bookService.batchAddBook(batchArgs);
    }

    @Test
    public void testJdbcTemplateTransaction(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        UserService userService = context.getBean("userService", UserService.class);

        userService.accountMoney();

    }

    @Test //完全注解事务
    public void testJdbcTemplateTransactionBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);

        UserService userService = context.getBean("userService", UserService.class);

        userService.accountMoney();

    }
}
