package com.pattern.strategy.order;

/**
 * @author jackChen
 * @date 2019/3/2
 */
public class Order {

    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public PayState pay(PayType payType){
        return payType.getPayment().pay(this.amount);
    }
}
