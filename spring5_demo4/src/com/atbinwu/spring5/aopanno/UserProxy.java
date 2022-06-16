package com.atbinwu.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect //生成代理对象
@Order(2)
public class UserProxy {

    //相同切入点抽取
    @Pointcut(value = "execution(* com.atbinwu.spring5.aopanno.User.add(..))")
    public void pointDemo(){

    }

    //execution([权限修饰符][返回类型][类全路径][方法名称]([参数列表]))
    //权限修饰符：public、private...   *全部
    //返回类型 可以为空
    //类全路径 com.atbinwu.spring5.aopanno.User.add(..)
    //       com.atbinwu.spring5.aopanno.User.*(..) User类里的所有方法
    //       com.atbinwu.spring5.aopanno.*.*(..) aopanno包下的所有类以及类的所有方法
    //参数列表

    //前置通知
    //@Before(value = "execution(* com.atbinwu.spring5.aopanno.User.add(..))")
    @Before(value = "pointDemo()")
    public void before() {
        System.out.println("before....");
    }

    @AfterReturning(value = "execution(* com.atbinwu.spring5.aopanno.User.add(..))")
    public void afterReturning() {
        System.out.println("afterReturning....");
    }

    @After(value = "execution(* com.atbinwu.spring5.aopanno.User.add(..))")
    public void after() {
        System.out.println("after....");
    }

    @AfterThrowing(value = "execution(* com.atbinwu.spring5.aopanno.User.add(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing....");
    }

    //环绕通知 方法之前和之后都执行
    @Around(value = "execution(* com.atbinwu.spring5.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before....");
        proceedingJoinPoint.proceed();
        System.out.println("around after....");
    }
}
