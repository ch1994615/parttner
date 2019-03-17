package com.pattern.factory.MilkFactory;

/**
 * Created by admin on 2019/1/29.
 */
public class MilkFacktoryTest {
    public static void main(String[] args) {

        System.out.println(new MilkFactory().getMilk("telunsu").getName());
        System.out.println(new MilkFactory().getMilk("mengniu").getName());

    }
}
