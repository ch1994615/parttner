package com.pattern;

import java.lang.reflect.Method;

/**
 * @author jackChen
 * @date 2019/3/5
 */
public class Test {

    public void a(){

    }
    public void b(){

    }
    public void c(){

    }

    public static void main(String[] args) {
        Method[] methods =  Test.class.getMethods();
        for(Method method:methods){
            System.out.println(method.getName());
            System.out.println(method.getDeclaringClass());

        }

    }

}
