package com.pattern.proxy.jdkProxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @author jackChen
 * @date 2019/2/28
 * 动态代理
 * 在代理类生成之前 我是不知道  需要代理什么东西的 是一个位置的东西
 */
public class JckproxyTest {
    /**
     * @param args 原理
     *             1 拿到代理类的引用，并且获得他所有的接口，反射获取
     *             2 jdkProxy 重新生成一个类，同时实现被代理类实现的所有实现
     *             3 动态生成java代码 把新加的业务逻辑方法由一定的逻辑代码去调用
     *             4 编译生成java代码.class
     *             5 再重新加载到jvm中运行
     *             以上这个过程就叫做字节码重组  运行时加载
     *             <p>
     *             $开头的都是自动生成的
     */
    public static void main(String[] args) {
        Person obj = (Person) new JdkProxy().getinstance(new Ch());
        obj.findLove();
        System.out.println(obj.getClass());

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});

        try {
            FileOutputStream fos = new FileOutputStream("D:/$proxy.class");
            fos.write(bytes);
        } catch (Exception e) {

        }


    }
}
