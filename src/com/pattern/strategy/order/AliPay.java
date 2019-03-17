package com.pattern.strategy.order;

/**
 * @author jackChen
 * @date 2019/3/2
 */
public class AliPay implements Payment{
    @Override
    public PayState pay(double amount) {
        System.out.println("欢迎使用支付宝支付");
        System.out.println("正在支付~~");
        return new PayState(200,amount);
    }
}
