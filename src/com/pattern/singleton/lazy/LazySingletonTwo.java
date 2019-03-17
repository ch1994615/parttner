package com.pattern.singleton.lazy;

/**
 * @author jackChen
 * @date 2019/2/18
 * 懒汉式（线程安全的）
 */
public  class LazySingletonTwo {
    private LazySingletonTwo(){

    }
    private static LazySingletonTwo lazy = null;

    public synchronized static LazySingletonTwo getInstance(){
        if(lazy == null){
            lazy = new LazySingletonTwo();
        }
        return lazy;
    }
}
