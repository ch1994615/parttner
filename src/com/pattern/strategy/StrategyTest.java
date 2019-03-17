package com.pattern.strategy;

import com.pattern.strategy.order.Order;
import com.pattern.strategy.order.PayType;

/**
 * @author jackChen
 * @date 2019/3/2
 * 策略模式  （strategy）
 *
 */
public class StrategyTest {
    public static void main(String[] args) {
        Order order = new Order("123456","75467613",456.85);
        System.out.println(order.pay(PayType.UNION_PAY));
    }
}
