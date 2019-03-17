package com.pattern.proxy.staticProxy;

/**
 * @author jackChen
 * @date 2019/2/24
 */
public class Father implements Person{

    private Son son;
    public Father(Son son){
        this.son = son;
    }
    /*
     * @author jackChen
     * 静态代理
     * @date 2019/2/24
     * @param []
     * @return void
     */
    public void findLove(){
        System.out.println("开始物色");
        this.son.findLove();
        System.out.println("双方父母是否同意");

    }
}
