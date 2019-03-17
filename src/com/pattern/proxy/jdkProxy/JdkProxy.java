package com.pattern.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author jackChen
 * @date 2019/2/28
 */
public class JdkProxy implements InvocationHandler{
    //需要被代理的类的引用
    private Person p;

    public Object getinstance(Person p){
        this.p = p;
        Class<?> clazz =  p.getClass();

        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("开始物色");
        method.invoke(this.p,args);
        System.out.println("物色到了");
        return null;
    }
}
