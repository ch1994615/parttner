package com.pattern.dalegate;

/**
 * @author jackChen
 * @date 2019/3/3
 * 委派模式测试一下
 */
public class DelegateTest {
    public static void main(String[] args) {
        DalegatePattern dalegatePattern = new DalegatePattern();
        dalegatePattern.doService("/getMemberById.do");
    }
}
