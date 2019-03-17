package com.pattern.singleton.hungry;

/**
 * @author jackChen
 * @date 2019/2/18
 * 类加载顺序
 * 先静态 后动态
 * 先属性 后方法
 * 先上后下
 */
public class HungrySingleton {

    private HungrySingleton(){//单例模式一般构造函数私有化

    }
    private static final HungrySingleton hungry = new HungrySingleton();

    public static HungrySingleton getInstance(){

        return hungry;
    }
}
