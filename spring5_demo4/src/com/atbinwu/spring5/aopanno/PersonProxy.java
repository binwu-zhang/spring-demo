package com.atbinwu.spring5.aopanno;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1) //曾强同一个方法，优先级，越小优先级越高
public class PersonProxy {
    @Before(value = "execution(* com.atbinwu.spring5.aopanno.User.add(..))")
    public void before() {
        System.out.println("Person Before....");
    }
}
