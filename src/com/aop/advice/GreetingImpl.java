package com.aop.advice;

/**
 * @author jackChen
 * @date 2019/3/14
 */
public class GreetingImpl implements Greeting {
    @Override
    public void sayName(String name) {
        System.out.println("hello:"+name);
    }
}
