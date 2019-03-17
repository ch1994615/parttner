package com.pattern.singleton.lazy;

/**
 * @author jackChen
 * @date 2019/2/18
 * 懒汉式（即该单例 需要用的时候才实例化 >> 延时加载）
 */
public class LazySingletonOne {//线程不安全的常见单例
    private LazySingletonOne(){

    }

    private static LazySingletonOne lazy = null;

    public static LazySingletonOne getInstance(){
        if(lazy == null){
            lazy = new LazySingletonOne();
        }
        return lazy;
    }
}
