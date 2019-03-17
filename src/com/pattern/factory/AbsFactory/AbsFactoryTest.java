package com.pattern.factory.AbsFactory;

/**
 * Created by admin on 2019/1/29.
 * 工厂方法模式
 */
public class AbsFactoryTest {
    public static void main(String[] args) {
        MilkFactory milkFactory = new MilkFactory();
        System.out.println(milkFactory.getMengniu().getName());
        System.out.println(milkFactory.getMengniu().getAge());
    }
}
