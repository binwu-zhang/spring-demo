package com.atbinwu.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {
    public static void main(String[] args) {
        //创建实现类代理对象
        Class[] interfaces = {UserDao.class};
        /*Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //增强逻辑
                return null;
            }
        });*/

        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));

        int res = dao.add(1,2);
        System.out.println(res);
    }
}


class UserDaoProxy implements InvocationHandler {

    //创建的时谁的代理对象，把谁传递过来
    //有参构造传递
    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }

    //增强逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前
        System.out.println("before："+method.getName());

        //执行方法
        Object res = method.invoke(obj, args);

        //方法之后
        System.out.println("after；"+res);


        return res;
    }
}