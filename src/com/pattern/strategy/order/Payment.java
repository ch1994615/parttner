package com.pattern.strategy.order;

/**
 * Created by admin on 2019/3/2.
 */
public interface Payment {


//    public static final AliPay ALI_PAY = new AliPay();
//    public static final UnionPay UNION_PAY = new UnionPay();
    public PayState pay(double amount);
}
