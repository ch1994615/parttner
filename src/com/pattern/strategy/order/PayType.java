package com.pattern.strategy.order;

/**
 * @author jackChen
 * @date 2019/3/2
 * 枚举
 */
public enum PayType {
    ALI_PAY(new AliPay()),
    UNION_PAY(new UnionPay());

    private Payment payment;

    PayType(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment(){
        return this.payment;
    }
}
