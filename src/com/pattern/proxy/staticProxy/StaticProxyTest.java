package com.pattern.proxy.staticProxy;

/**
 * @author jackChen
 * @date 2019/2/24
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Son son = new Son();
        Father father = new Father(son);

        father.findLove();
    }
}
