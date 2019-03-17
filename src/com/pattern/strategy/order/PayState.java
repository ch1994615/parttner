package com.pattern.strategy.order;

/**
 * @author jackChen
 * @date 2019/3/2
 */
public class PayState {
    private int code;
    private double amount;

    public PayState(int code, double amount) {
        this.code = code;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return ("支付校验玛："+this.code+",支付结果：支付成功,支付金额："+this.amount+"元");
    }
}
