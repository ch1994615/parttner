package com.pattern.singleton.lazy;

/**
 * @author jackChen
 * @date 2019/2/18
 * 懒汉式（内部类形式保证线程安全）
 */
public class LazySingletonThree {
    private LazySingletonThree(){

    }

    public static final LazySingletonThree getInstance(){
        return LazyHolder.lazy;
    }

    private static class LazyHolder{
        private static final LazySingletonThree lazy = new LazySingletonThree();
    }


}
