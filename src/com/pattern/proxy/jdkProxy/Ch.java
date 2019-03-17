package com.pattern.proxy.jdkProxy;

/**
 * @author jackChen
 * @date 2019/2/28
 */
public class Ch implements Person{

    public void findLove(){
        System.out.println("找对象");
    }

    @Override
    public void rentHouse() {
        System.out.println("租房子");
    }

    @Override
    public void findJob() {
        System.out.println("找工作");
    }
}
